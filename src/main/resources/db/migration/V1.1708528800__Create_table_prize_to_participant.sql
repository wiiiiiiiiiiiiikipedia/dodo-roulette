CREATE TABLE IF NOT EXISTS prize_to_participant
(
    id serial PRIMARY KEY NOT NULL,
    prize_id serial NOT NULL,
    participant_id  serial NOT NULL,
    created_at date NOT NULL
);