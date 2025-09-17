-- Last updated: 9/17/2025, 9:28:37 PM
# Write your MySQL query statement below
select w1.id from Weather W1,Weather W2
WHERE  datediff(w1.recordDate ,w2.recordDate)=1
and w1.temperature > w2.temperature ;