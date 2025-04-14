package br.com.dio.Board.persistence.migration;

import liquibase.Liquibase;
import liquibase.database.Database;
import liquibase.database.jvm.JdbcConnection;
import liquibase.exception.LiquibaseException;
import liquibase.resource.ClassLoaderResourceAccessor;
import liquibase.database.DatabaseFactory;
import liquibase.Contexts;

import java.sql.Connection;

public class MigrationStrategy {

    private final Connection connection;

    public MigrationStrategy(Connection connection) {
        this.connection = connection;
    }

    public void executeMigration() {
        try {
            Database database = DatabaseFactory.getInstance()
                    .findCorrectDatabaseImplementation(new JdbcConnection(connection));

            Liquibase liquibase = new Liquibase(
                    "db/changelog/db.changelog-master.yml",
                    new ClassLoaderResourceAccessor(),
                    database
            );

            liquibase.update(new Contexts());
        } catch (LiquibaseException e) {
            throw new RuntimeException("Erro ao executar a migração com Liquibase", e);
        }
    }
}
