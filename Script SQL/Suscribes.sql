CREATE TABLE IF NOT EXISTS Subscribers (
    subscriber_id SERIAL PRIMARY KEY,
    subscriber_name VARCHAR(100) NOT NULL,
    email VARCHAR(255) UNIQUE NOT NULL
);