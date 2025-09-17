-- Last updated: 9/17/2025, 9:28:27 PM
# Write your MySQL query statement below
select name
from Customer
where referee_id != 2
or referee_id is null;