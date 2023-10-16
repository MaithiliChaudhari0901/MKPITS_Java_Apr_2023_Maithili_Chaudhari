
use sakila
select * from inventory
delimiter //
create function total_order_value(order_quantity decimal(10,2), unit_price decimal(10,2))
returns decimal(10,2)
deterministic
begin
declare total_order_value decimal(10,2);
set total_order_value = order_quantity * unit_price;
return total_order_value;
end
// delimiter ;


select total_order_value(order_quantity, unit_price) AS total_order_value from orders;