-- migrate:up
CREATE TABLE customers (
  customer_code CHAR(30) NOT NULL PRIMARY KEY,
  customer_name CHAR(30) NOT NULL,
  email CHAR(30),
  phone CHAR(11) CHECK(phone Like '010%'),
  join_date DATETIME DEFAULT CURRENT_TIMESTAMP,
  balance INT(7) CHECK(balance >= 0),
  UNIQUE KEY (email)
);

-- migrate:down
DROP TABLE customers;

-- insert into orders (order_code, customer_code, menu_code, amount) 
--   values (
--     2, 
--     (select customer_code from customers where customer_name = "황희정"), 
--     (select menu_code from menus where menu_name = "클럽샌드위치"), 
--     2
--   );

-- update menus 
--   set left_product = left_product - (select amount from orders where order_code = 1) 
--   where menu_name = "클럽샌드위치";

-- update customers 
--   set balance = balance - (
--     (select price from menus where menu_name = "클럽샌드위치") * 
--     (select amount from orders where order_code = 1)) 
-- where customer_code = "hee1";

-- select 
--   customers.customer_code, 
--   customers.customer_name, 
--   customers.balance, 
--   menus.menu_name, 
--   orders.amount 
-- from orders 
--   INNER JOIN customers ON orders.customer_code = customers.customer_code  
--   Inner join menus on orders.menu_code = menus.menu_code 
-- where order_code = 1;

