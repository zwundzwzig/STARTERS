-- migrate:up
CREATE TABLE orders (
  order_code INT(5) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  customer_code CHAR(30) NOT NULL,
  menu_code INT(5) NOT NULL,
  amount INT(3) CHECK(amount <= 100),
  order_date DATETIME DEFAULT CURRENT_TIMESTAMP,
  CONSTRAINT fk_menu_code FOREIGN KEY (menu_code) REFERENCES menus (menu_code),
  CONSTRAINT fk_customer_code FOREIGN KEY (customer_code) REFERENCES customers (customer_code)
);

-- migrate:down
DROP TABLE orders;