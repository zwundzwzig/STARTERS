-- migrate:up
CREATE TABLE regions (
    region_id DOUBLE NOT NULL,
    region_name VARCHAR(25),
    CONSTRAINT PRIMARY KEY (region_id)
);

-- migrate:down
DROP TABLE regions;