-- migrate:up
--1. 80번부서의 평균급여보다 많은 급여를 받는 직원의 이름, 부서id, 급여를 조회하시오.
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

-- 2. 'South San Francisco'에 근무하는 직원의 최소급여보다 급여를 많이 받으면서 50 번부서의 평균급여보다 많은 급여를 받는 직원의 이름, 급여, 부서명, 부서id를 조회하시오.
SELECT
  e.first_name,
  e.department_id,
  e.salary,
  d.department_name,
  l.city,
  (
    SELECT
      AVG(salary)
    FROM
      employees
    WHERE
      department_id = 50
  ) avg_dep_50,
  (
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
  ) avg_SSF
FROM
  employees e
  INNER JOIN departments d ON e.department_id = d.department_id
  INNER JOIN locations l ON l.location_id = d.location_id
WHERE
  salary > ALL (
    SELECT
      AVG(salary)
    FROM
      employees
    WHERE
      department_id = 50
  )
  AND (
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
      ) -- SELECT *
      -- FROM
      --   locations l
      --   JOIN departments d ON l.location_id = d.department_id
      --   JOIN employees e ON d.department_id = e.department_id
      -- WHERE
      --   l.city = 'South San Francisco'
  )
ORDER BY
  salary;

--3. 각 직급별(job_title) 인원수를 조회하되 사용되지 않은 직급이 있다면 해당 직급도 출력결과에 포함시키고, 직급별 인원수가 10명 이상인 직급만 출력결과에 포함시키시오.
SELECT
  j.job_id,
  j.job_title,
  COUNT(*) count
FROM
  employees e
  INNER JOIN jobs j ON e.job_id = j.job_id
GROUP BY
  j.job_id
HAVING
  count >= 10;

--4. 각 부서별 최대급여를 받는 직원의 이름, 부서명, 급여를 조회하시오.
SELECT
  e.first_name,
  e.last_name,
  e.commission_pct,
  d.department_id,
  d.department_name,
  e.salary
FROM
  employees e
  INNER JOIN departments d ON e.department_id = d.department_id
WHERE
  (d.department_id, salary) IN (
    SELECT
      e.department_id,
      MAX(salary)
    FROM
      employees e
    GROUP BY
      e.department_id
  )
ORDER BY
  d.department_id;

--5 직원의 이름, 부서id, 급여를 조회하시오. 그리고 직원이 속한 해당 부서의 최소급여를 마지막에 포함시켜 출력 하시오.
SELECT
  e.employee_id,
  d.department_name,
  salary,
  MIN(salary) min
FROM
  employees e
  INNER JOIN departments d ON e.department_id = d.department_id
GROUP BY
  d.department_name,
  e.employee_id;

--6 월별 입사자 수를 조회하되, 입사자 수가 10명 이상인 월만 출력하시오.
SELECT
  MONTH(hire_date) month,
  COUNT(MONTH(hire_date)) count
FROM
  employees
GROUP BY
  MONTH(hire_date)
HAVING
  COUNT(MONTH(hire_date)) >= 10;

SELECT
  hire_month month,
  COUNT(hire_month) count
FROM
  (
    SELECT
      case
        when hire_date LIKE '_____01%' then '01'
        when hire_date LIKE '_____02%' then '02'
        when hire_date LIKE '_____03%' then '03'
        when hire_date LIKE '_____04%' then '04'
        when hire_date LIKE '_____05%' then '05'
        when hire_date LIKE '_____06%' then '06'
        when hire_date LIKE '_____07%' then '07'
        when hire_date LIKE '_____08%' then '08'
        when hire_date LIKE '_____09%' then '09'
        when hire_date LIKE '_____10%' then '10'
        when hire_date LIKE '_____11%' then '11'
        when hire_date LIKE '_____12%' then '12'
      END hire_month
    FROM
      employees
  ) count_employee
GROUP BY
  hire_month
ORDER BY
  month;

--7 자신의 관리자(상사)보다 많은 급여를 받는 직원의 이름과 급여를 조회하시오.
SELECT
  e.employee_id,
  e.email junior_mail,
  e.salary junior_salary,
  e.manager_id junior_manager,
  m.employee_id senior_id,
  m.email senior_mail,
  m.salary senior
FROM
  employees e
  INNER JOIN employees m ON e.manager_id = m.employee_id
WHERE
  e.salary > m.salary;

--8 'Southlake'에서 근무하는 직원의 이름, 급여, 직책(job_title)을 조회하시오.
SELECT
  e.first_name,
  e.salary,
  e.phone_number,
  j.job_title,
  l.city
FROM
  jobs j
  JOIN employees e ON j.job_id = e.job_id
  JOIN departments d ON e.department_id = d.department_id
  JOIN locations l ON d.location_id = l.location_id
WHERE
  city = 'Southlake';

--9 국가별 근무 인원수를 조회하시오. 단, 인원수가 3명 이상인 국가정보만 출력되어야함.
SELECT
  c.country_name,
  COUNT(*) count
FROM
  employees e
  JOIN departments d ON d.department_id = e.department_id
  JOIN locations l ON d.location_id = l.location_id
  JOIN countries c ON c.country_id = l.country_id
GROUP BY
  country_name
HAVING
  COUNT(*) >= 3;

--10 직원의 폰번호, 이메일과 상사의 폰번호, 이메일을 조회하시오. 단, 상사가 없는 직원은 '<관리자 없음>'이 출력되도록 해야 한다.
SELECT
  e.phone_number,
  e.email,
  IFNULL(m.phone_number, '<관리자 없음>') manager_number,
  IFNULL(m.email, '<관리자 없음>') manager_email
FROM
  employees e
  LEFT OUTER JOIN employees m ON e.manager_id = m.employee_id;

--11 각 부서 이름별로 최대급여와 최소급여를 조회하시오. 단, 최대/최소급여가 동일한 부서는 출력결과에서 제외시킨다.
SELECT
  d.department_name,
  MAX(salary) maximum,
  MIN(salary) mininum
FROM
  departments d
  JOIN employees e ON d.department_id = e.department_id
GROUP BY
  d.department_name
HAVING
  MAX(salary) != MIN(salary);

--12 부서별, 직급별, 평균급여를 조회하시오. 단, 평균급여가 50번부서의 평균보다 많은 부서만 출력되어야 합니다.
SELECT
  d.department_name,
  job_id,
  AVG(salary)
FROM
  employees e
  join departments d on e.department_id = d.department_id
GROUP BY
  e.department_id,
  e.job_id
HAVING
  AVG(salary) > (
    SELECT
      AVG(salary)
    FROM
      employees
    WHERE
      department_id = 50
  );

-- migrate:down