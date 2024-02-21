CREATE TABLE IF NOT EXISTS participant
(
    id serial PRIMARY KEY NOT NULL,
    name varchar NOT NULL,
    created_at date NOT NULL
);