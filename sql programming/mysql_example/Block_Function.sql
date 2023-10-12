use sakila

DELIMITER //
CREATE PROCEDURE get_id()
BEGIN 
select actor_id from actor ;
END
//
DELIMITER ;

  CALL get_id()
  
 