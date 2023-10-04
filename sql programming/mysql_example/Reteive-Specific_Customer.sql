use sakila
show tables
-- Retrieve the Customer from a specific city
select  * from Customer_list

-- Retrieve the most recent rentals
select* from rental 
select* from rental order by return_date desc

-- Retreive  the distinct film categories available 
select * from film _category
select distinct (categoty_id) from film_category


--Retreive the rentals history for a specific customer
select * from rental
select * from rental where customer_id=3


