-- migrate:up
CREATE TABLE menus (
  menu_code INT(5) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  menu_name CHAR(100) NOT NULL UNIQUE,
  price INT(5) NOT NULL CHECK(price >= 100 || price <= 10000),
  left_product INT(3) NOT NULL CHECK(left_product >= 0),
  comment TEXT NULL,
  image CHAR(50) NULL,
  UNIQUE KEY (menu_name)
);

-- migrate:down
DROP TABLE menus;