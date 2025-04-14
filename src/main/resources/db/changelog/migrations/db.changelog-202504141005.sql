--liquibase formatted sql
--changeset rafael:202504141005
--comment: set unblock_reason nullable

ALTER TABLE BLOCKS
ALTER COLUMN unblock_reason TYPE VARCHAR(255),
ALTER COLUMN unblock_reason DROP NOT NULL;

--rollback DROP TABLE BLOCKS