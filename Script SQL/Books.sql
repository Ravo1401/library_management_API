CREATE TABLE IF NOT EXISTS Book (
    book_id SERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    publication_date DATE,
    topic Topic,
    authorId INT REFERENCES Author(authorId)
);