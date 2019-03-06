CREATE DATABASE todo_app;
show databases;
USE todo_app;
show tables;
create table todo(
    id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    name VARCHAR(30) NOT NULL,
    deadline DATE);

show tables;
DESCRIBE todo;

INSERT INTO todo VALUES(
    NULL, 'Walk the dog', DATE '2018-03-09');
SELECT * FROM todo;

INSERT INTO todo VALUES
    (NULL, 'Wash the dishes', DATE '2019-03-19'),
    (NULL, 'Buy Cleanex', DATE '2019-03-20'),
    (NULL, 'Go to repair shop', DATE '2019-04-02');
SELECT * FROM todo;
INSERT INTO todo VALUES
    (NULL, 'Clean the house', DATE '2019-03-18'),
    (NULL, 'Water flowers', DATE '2019-03-18');
SELECT * FROM todo;
INSERT INTO todo VALUE (
    NULL, 'Repair laptop', NOW());
SELECT * FROM todo;

INSERT INTO todo VALUE (
    NULL, 'Repair laptop', NOW());
SELECT * FROM todo;

DELETE FROM todo WHERE id=8;
SELECT * FROM todo;

INSERT INTO todo VALUE (
    NULL, 'Repair laptop', NOW());
SELECT * FROM todo;
INSERT INTO todo VALUE (
    NULL, 'Repair laptop', NOW());
DELETE FROM todo WHERE name = 'Repair laptop';
SELECT * FROM todo;

INSERT INTO todo (name, deadline) VALUE (
    'Repair laptop', NOW());
    
ALTER TABLE todo ADD status ENUM('DONE', 'TODO') NOT NULL
    AFTER deadline;
describe todo;
SELECT * FROM todo;

UPDATE todo SET status = 'TODO'
    WHERE name = 'Repair laptop';
SELECT * FROM todo;

ALTER TABLE todo
    CHANGE status status_DONE_TODO ENUM('DONE', 'TODO');
SELECT * FROM todo;