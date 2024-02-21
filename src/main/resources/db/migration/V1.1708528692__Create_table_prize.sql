CREATE TABLE IF NOT EXISTS prize
(
    id serial PRIMARY KEY NOT NULL,
    name varchar NOT NULL,
    count  int NOT NULL,
    price decimal NOT NULL
);