# Write your MySQL query statement below
select r.contest_id , ROUND((COUNT(r.contest_id)/(select COUNT(*) from Users)) * 100, 2) as percentage FROM
 Users as u 
RIGHT JOIN Register as r on r.user_id = u.user_id
group by r.contest_id 
order by percentage desc, r.contest_id asc  ;