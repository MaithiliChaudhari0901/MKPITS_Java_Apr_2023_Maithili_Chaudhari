
use sakila;
DELIMITER // 
CREATE FUNCTION myfun1(  
)   
returns integer 
DETERMINISTIC  
BEGIN  
    DECLARE amt int;  
    select sum(amount) into amt from payment where customer_id=cust_id;
    return amt;
    END
    //
DELIMITER ;  
    
   
  