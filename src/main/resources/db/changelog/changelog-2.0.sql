--liquibase formatted sql

--changeset profmi2022:1

alter table users
    rename column name to first_name;

alter table catowner
    rename column name to first_name;

alter table dogowner
    rename column name to first_name;
