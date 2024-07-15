-- Schema: CREATE TABLE "leap" ( "year" INT, "is_leap" BOOL);
-- Task: update the leap table and set the is_leap based on the year field.

Update leap 
set is_leap = 1
WHERE (year % 100 == 0 and year % 400 == 0) or (year % 100 != 0 and year % 4 == 0);




SELECT * FROM leap;
