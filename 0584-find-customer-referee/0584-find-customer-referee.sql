# Write your MySQL query statement below

# make sure--> use is null NOT  referee_id = null
SELECT name FROM Customer  WHERE referee_id !=2 OR referee_id is null;
