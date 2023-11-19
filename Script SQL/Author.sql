CREATE TABLE IF NOT EXISTS Author (
    authorId SERIAL PRIMARY KEY,
    authorName VARCHAR(100) NOT NULL,
    sex CHAR(1) CHECK (sex IN ('M', 'F'))
);

INSERT INTO Author (authorid, authorname, sex)
VALUES 
    (1, 'Peter Parker', 'M'),
    (2, 'Johnny Deep', 'M'),
    (3 , 'Michel Williams' , 'F');