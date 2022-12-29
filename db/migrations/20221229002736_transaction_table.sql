-- migrate:up
SHOW variables LIKE 'auto%';
SET AUTOCOMMIT = OFF;
--CRUD
ROLLBACK;
COMMIT;

-- migrate:down

