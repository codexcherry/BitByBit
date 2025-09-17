-- Last updated: 9/17/2025, 9:28:20 PM
# Write your MySQL query statement below
select v.customer_id , count(v.visit_id) as count_no_trans
from Visits v left join Transactions t
on t.visit_id = v.visit_id 
where t.transaction_id is null
group by customer_id;