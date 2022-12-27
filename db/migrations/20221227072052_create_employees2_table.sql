-- migrate:up
CREATE TABLE employees (
  employee_id INT,
  first_name VARCHAR(20),
  last_name VARCHAR(25) NOT NULL,
  email VARCHAR(25) NOT NULL,
  phone_number VARCHAR(20),
  hire_date DATETIME NOT NULL,
  job_id VARCHAR(10) NOT NULL,
  salary DECIMAL(8, 2),
  commission_pct DECIMAL(2, 2),
  manager_id INT,
  department_id SMALLINT,
  CONSTRAINT emp_salary_min CHECK (salary > 0),
  CONSTRAINT emp_email_uk UNIQUE (email),
  CONSTRAINT PRIMARY KEY (employee_id)
);

-- migrate:down