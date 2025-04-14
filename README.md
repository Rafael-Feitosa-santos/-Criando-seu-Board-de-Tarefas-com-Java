# 🗂️ Kanban JDBC + PostgreSQL

Projeto simples de **Quadro Kanban** usando **Java com JDBC** e **PostgreSQL**.

Permite:
- Criar quadros (boards)
- Adicionar colunas personalizadas (To Do, Doing, Done, etc.)
- Inserir cartões com descrição
- Bloquear e desbloquear cards com motivo

Ideal para fins educativos, testes e estruturação de lógica com banco de dados relacional e JDBC puro.

---

## 🚀 Tecnologias

- Java 17+
- JDBC (puro, sem frameworks)
- PostgreSQL
- Docker (para subir o banco rapidamente)

---

## 🐳 Subindo o Banco de Dados com Docker

```bash
docker run --name postgres-kanban -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=admin -e POSTGRES_DB=kanban -p 5432:5432 -d postgres

