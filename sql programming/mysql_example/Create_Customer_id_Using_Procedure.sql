delimiter //
CREATE PROCEDURE retrive_customer_name(In v_city_id int)

begin
select customer.first_name,customer.last_name,city.city,city.city_id from customer
join address
on customer.address_id=address.address_id
join city
on city.city_id=address.city_id  
where city.city_id=v_city_id;
end 
//
delimiter ;
-- drop procedure retrive_customer_name
call retrive_customer_name(251)