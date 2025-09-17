-- Last updated: 9/17/2025, 9:28:24 PM
# Write your MySQL query statement below
select p.product_name , s.year , s.price 
from Sales s Join Product p
on s.product_id = p.product_id;