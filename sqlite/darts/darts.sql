-- Schema: CREATE TABLE "darts" ("x" REAL, "y" REAL, score INTEGER);
-- Task: update the darts table and set the score based on the x and y values.


UPDATE darts
SET score = 10
WHERE ((x*x) + (y*y)) <= 1;

UPDATE darts 
SET score = 5 
WHERE ((x*x) + (y*y)) <= 25 AND ((x*x)+(y*y)) > 1;

UPDATE darts 
SET score = 1
WHERE ((x*x) + (y*y)) <= 100 AND ((x*x) + (y*y)) > 25;

UPDATE darts 
SET score = 0
WHERE ((x*x) + (y*y)) > 100;

SELECT * FROM darts;
