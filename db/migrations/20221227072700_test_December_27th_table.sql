-- migrate:up
--1.
select
  first_name,
  department_id,
  salary
from
  employees
where
  salary > (
    select
      avg(salary)
    from
      employees
    where
      department_id = 80
  );

-- 2.
select
  e.first_name,
  e.department_id,
  e.salary,
  d.department_name,
  l.city
from
  employees e
  inner join departments d on e.department_id = d.department_id
  inner join locations l on l.location_id = d.location_id
where
  salary > (
    select
      avg(salary)
    from
      employees
    where
      department_id = 50
  )
  and salary > (
    select
      min(salary)
    from
      employees
    where
      department_id = (
        select
          department_id
        from
          departments d
        where
          d.location_id = (
            select
              l.location_id
            from
              locations l
            where
              l.city = 'South San Francisco'
          )
      )
  )
order by
  salary;

--3.
select
  j.job_id,
  count(*) count
from
  employees e
  join jobs j on e.job_id = j.job_id
group by
  j.job_id
having
  count >= 10;

--4.
select
  e.first_name,
  d.department_name,
  e.salary
from
  employees e
  inner join departments d on e.department_id = d.department_id
where
  (d.department_id, salary) in (
    select
      e.department_id,
      max(salary)
    from
      employees e
    group by
      e.department_id
  );

--5
select
  employee_id,
  first_name,
  d.department_name,
  Min(salary),
  salary
from
  employees e
  inner join departments d on e.department_id = d.department_id
group by
  d.department_name,
  e.employee_id;

-- migrate:down