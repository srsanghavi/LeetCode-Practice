-- https://leetcode.com/problems/not-boring-movies/description/


# Write your MySQL query statement below
SELECT *
FROM cinema
WHERE id%2=1 and description <> 'boring'
ORDER BY rating DESC
