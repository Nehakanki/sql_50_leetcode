# Write your MySQL query statement below

select p.product_id , IFNULL(ROUND(sum(p.price * u.units)/sum(units),2),0)as average_price FROM Prices as p
LEFT JOIN UnitsSold as u on u.product_id = p.product_id AND u.purchase_date BETWEEN start_date and end_date
group by product_id;