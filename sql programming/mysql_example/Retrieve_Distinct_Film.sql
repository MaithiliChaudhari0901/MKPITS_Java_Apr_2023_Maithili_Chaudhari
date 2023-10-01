--write queries to retrieve data from sakila database

use sakila
show tables
-- retreive the number of distinct films in the inventory
select * from inventory
select distinct (film_id) from inventory