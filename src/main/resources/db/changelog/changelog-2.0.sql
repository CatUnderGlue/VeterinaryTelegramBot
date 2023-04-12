--liquibase formatted sql

--changeset profmi2022:1

alter table users
    rename column name to first_name;

alter table catowner
    rename column name to first_name;

alter table dogowner
    rename column name to first_name;

--changeset catunderglue:2

alter table trial_periods
    add animal_type varchar(255);

alter table trial_periods
    add animal_id bigint;

--changeset pro100:3
alter table dog_Shelter
    rename column id_shelter to id;

--changeset profmi2022:4
alter table users
    add shelter varchar(255);