-- migrate:up
--1.
SELECT
  first_name,
  department_id,
  salary
FROM
  employees
WHERE
  salary > (
    SELECT
      AVG(salary)
    FROM
      employees
    WHERE
      department_id = 80
  );

-- 2.
SELECT
  e.first_name,
  e.department_id,
  e.salary,
  d.department_name,
  l.city
FROM
  employees e
  INNER JOIN departments d ON e.department_id = d.department_id
  INNER JOIN locations l ON l.location_id = d.location_id
WHERE
  salary > (
    SELECT
      avg(salary)
    FROM
      employees
    WHERE
      department_id = 50
  )
  and salary > (
    SELECT
      MIN(salary)
    FROM
      employees
    WHERE
      department_id = (
        SELECT
          department_id
        FROM
          departments d
        WHERE
          d.location_id = (
            SELECT
              l.location_id
            FROM
              locations l
            WHERE
              l.city = 'South San Francisco'
          )
      )
  )
order by
  salary;

--3.
SELECT
  j.job_id,
  COUNT(*) count
FROM
  employees e
  JOIN jobs j ON e.job_id = j.job_id
GROUP BY
  j.job_id
having
  count >= 10;

--4.
SELECT
  e.first_name,
  d.department_name,
  e.salary
FROM
  employees e
  INNER JOIN departments d ON e.department_id = d.department_id
WHERE
  (d.department_id, salary) IN (
    SELECT
      e.department_id,
      max(salary)
    FROM
      employees e
    GROUP BY
      e.department_id
  );

--5
SELECT
  employee_id,
  first_name,
  d.department_name,
  Min(salary),
  salary
FROM
  employees e
  INNER JOIN departments d ON e.department_id = d.department_id
GROUP BY
  d.department_name,
  e.employee_id;

--6
SELECT
  MONTH(hire_date) month,
  COUNT(MONTH(hire_date)) count
FROM
  employees
GROUP BY
  MONTH(hire_date)
HAVING
  COUNT(MONTH(hire_date)) >= 10;

--7
SELECT
  MY.first_name,
  MY.salary,
  BO.salary
FROM
  employees MY
  LEFT OUTER JOIN employees BO ON MY.manager_id = BO.manager_id
WHERE
  MY.salary > BO.salary;

--8
SELECT
  e.first_name,
  e.salary,
  j.job_title,
  l.city
FROM
  jobs j
  JOIN employees e ON j.job_id = e.job_id
  JOIN departments d ON e.department_id = d.department_id
  JOIN locations l ON d.location_id = l.location_id
WHERE
  city = 'Southlake';

-- migrate:down