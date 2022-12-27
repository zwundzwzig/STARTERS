-- migrate:up
CREATE TABLE dept50 
(SELECT * FROM employees WHERE department_id = 50);

CREATE TABLE emp_job_man
(SELECT * FROM employees WHERE job_id = 50);

-- migrate:down

