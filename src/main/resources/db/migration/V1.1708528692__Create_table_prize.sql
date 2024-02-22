CREATE TABLE IF NOT EXISTS prize
(
    id serial PRIMARY KEY NOT NULL,
    name varchar NOT NULL,
    photo_url varchar NOT NULL,
    price decimal NOT NULL
);