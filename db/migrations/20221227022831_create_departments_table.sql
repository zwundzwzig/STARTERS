-- migrate:up
CREATE TABLE departments (
  department_id SMALLINT,
  department_name VARCHAR(30),
  manager_id INT,
  location_id SMALLINT,
  CONSTRAINT PRIMARY KEY (department_id),
  CONSTRAINT dept_loc_fk FOREIGN KEY (location_id) REFERENCES locations (location_id)
);

-- migrate:down
DROP TABLE departments;