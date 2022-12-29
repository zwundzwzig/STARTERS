-- migrate:up
CREATE TABLE account (
  account_number CHAR(10) PRIMARY KEY,
  account_pw INT,
  balance DECIMAL(10, 2)
);

-- migrate:down