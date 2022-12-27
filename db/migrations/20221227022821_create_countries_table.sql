-- migrate:up
CREATE TABLE countries (
  country_id CHAR(2) NOT NULL,
  country_name VARCHAR(40),
  region_id DOUBLE,
  CONSTRAINT PRIMARY KEY (country_id),
  CONSTRAINT countr_reg_fk FOREIGN KEY (region_id) REFERENCES regions(region_id)
);

-- migrate:down
DROP TABLE countries;