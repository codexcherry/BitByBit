-- Last updated: 9/17/2025, 9:28:21 PM
# Write your MySQL query statement below
select eu.unique_id,e.name 
from Employees e 
left join EmployeeUNI eu
on e.id = eu.id