--liquibase formatted sql

--changeset chiennv:1

DROP TABLE IF EXISTS users;
CREATE TABLE users
(
    id         binary(16) NOT NULL
        primary key,
    limit_task int        NOT NULL
);

--changeset chiennv:3

DROP TABLE IF EXISTS notes;
CREATE TABLE tasks
(
    id          binary(16)                          NOT NULL
        primary key,
    title       varchar(64)                         NOT NULL,
    description varchar(255)                        NOT NULL,
    user_id     binary(16)                          NOT NULL,
    created_at   timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL,
    updated_at  timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL,
    constraint tasks_ibfk_1
        foreign key (user_id) references users (id)
            on delete cascade
);
