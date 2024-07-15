-- Schema: CREATE TABLE "grains" ("task" TEXT, "square" INT, "result" INT);
-- Task: update the grains table and set the result based on the task (and square fields).


UPDATE grains 
set result = power(2, square - 1)
WHERE task LIKE 'single-square';



update grains 
set result = POWER(2,64) - 1
Where task LIKE 'total';


SELECT * FROM grains;

