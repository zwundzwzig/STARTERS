-- migrate:up
CREATE TABLE jobs (
  job_id VARCHAR(10),
  job_title VARCHAR(35) NOT NULL,
  min_salary INT,
  max_salary INT,
  CONSTRAINT PRIMARY KEY(job_id)
);

-- migrate:down
DROP TABLE jobs;