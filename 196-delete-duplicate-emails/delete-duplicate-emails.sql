# Write your MySQL query statement below
DELETE FROM Person 
WHERE id NOT IN
    (SELECT mid     
    FROM 
        (SELECT MIN(id) AS mid 
        FROM Person GROUP BY email) 
    AS A);