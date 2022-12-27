-- migrate:up
CREATE TABLE locations (
  location_id SMALLINT,
  street_address VARCHAR(40),
  postal_code VARCHAR(12),
  city VARCHAR(30) NOT NULL,
  state_province VARCHAR(25),
  country_id CHAR(2),
  CONSTRAINT PRIMARY KEY (location_id),
  CONSTRAINT loc_c_id_fk FOREIGN KEY (country_id) REFERENCES countries(country_id)
);

-- migrate:down
DROP TABLE locations;