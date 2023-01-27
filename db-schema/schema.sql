DROP TABLE IF EXISTS ART_WORK;

CREATE TABLE ART_WORK (
    ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    SUBJECT VARCHAR(32) NOT NULL,
    DESCRIPTION VARCHAR(512),
    URL VARCHAR(512) DEFAULT '',
    STYLE VARCHAR(16) DEFAULT 'European',
    TYPE VARCHAR(32) DEFAULT 'Oil paint',
    PRICE DECIMAL(9,2) DEFAULT 0.0
);

INSERT INTO ART_WORK (SUBJECT, DESCRIPTION, URL, STYLE, TYPE, PRICE) VALUES
('Paint #1', 'This is paint #1', 'European', '', 'Oil paint', 100.0),
('Paint #2', 'This is paint #2', 'European', '', 'Oil paint', 200.0),
('Paint #3', 'This is paint #3', 'Chinese', '', 'Pencil paint', 300.0),
('Paint #4', 'This is paint #4', 'Japanese', '', 'Wood paint', 110.0),
('Paint #5', 'This is paint #5', 'American', '', 'Oil paint', 900.0);
