# Write your MySQL query statement below
SELECT product_id,year as first_year,quantity,price 
FROM Sales s
WHERE (product_id,year) IN 
(SELECT product_id,MIN(year)
FROM Sales
GROUP BY product_id);