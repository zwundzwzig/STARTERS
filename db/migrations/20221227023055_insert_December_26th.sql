-- migrate:up
-- 연관형 서브쿼리
SELECT
  salary,
  department_id,
  (
    SELECT
      AVG(salary)
    FROM
      employees
    WHERE
      e.department_id = department_id
  ) AS avg
FROM
  employees e
WHERE
  salary > ANY (
    SELECT
      AVG(salary)
    FROM
      employees
    GROUP BY
      department_id
  );

-- 앨리야스
SELECT
  sal_tbl.avg AS hohoh
FROM
  (
    SELECT
      AVG(salary) AS avg
    FROM
      employees
    WHERE
      salary > 4000000
  ) sal_tbl;

-- CASE WHEN
SELECT
  first_name AS 이름,
  CASE
    WHEN temporary >= 60000000 THEN '부장'
    WHEN temporary >= 39000000 THEN "대리"
    ELSE '사원'
  END 직급
FROM
  (
    SELECT
      first_name,
      salary + salary * 10 AS temporary
    FROM
      employees
  ) temporary_table;

-- 과제
INSERT INTO
  menus (menu_name, price, left_product, comment, image)
VALUES
  (
    '아메리카노',
    2000,
    100,
    '핫,아이스 선택가능:추가요금없음',
    'americano.jpg'
  ),
  (
    '카페라떼',
    3000,
    100,
    '두유 변경가능:추가요금없음',
    'latte.jpg'
  ),
  ('딸기바나나쥬스', 3000, 50, '딸기싱싱', 'ddalba.jpg'),
  ('치즈케익', 5000, 10, '사이즈10*10', 'cheesecake.jpg'),
  (
    '클럽샌드위치',
    4500,
    10,
    '치킨,베이컨선택가능:4조각',
    'sandwich.jpg'
  );

INSERT INTO
  customers (
    customer_code,
    customer_name,
    email,
    phone,
    join_date,
    balance
  )
VALUES
  (
    'jung1',
    '유정은',
    'jung1@kitri.com',
    '0102223333',
    '2022-12-26',
    30000
  ),
  (
    'inchul1',
    '신인철',
    'in1@bit.com',
    '0103335677',
    '2022-11-26',
    40000
  ),
  (
    'hee1',
    '황희정',
    'heejung1@multi.com',
    '0102224444',
    '2021-12-26',
    50000
  );

INSERT INTO
  orders (order_code, customer_code, menu_code, amount)
VALUES
  (
    2,
    (
      SELECT
        customer_code
      FROM
        customers
      WHERE
        customer_name = "황희정"
    ),
    (
      SELECT
        menu_code
      FROM
        menus
      WHERE
        menu_name = "클럽샌드위치"
    ),
    2
  );

UPDATE
  menus
SET
  left_product = left_product - (
    SELECT
      amount
    FROM
      orders
    WHERE
      order_code = 1
  )
WHERE
  menu_name = "클럽샌드위치";

UPDATE
  customers
SET
  balance = balance - (
    (
      SELECT
        price
      FROM
        menus
      WHERE
        menu_name = "클럽샌드위치"
    ) * (
      SELECT
        amount
      FROM
        orders
      WHERE
        order_code = 1
    )
  )
WHERE
  customer_code = "hee1";

SELECT
  customers.customer_code,
  customers.customer_name,
  customers.balance,
  menus.menu_name,
  orders.amount
FROM
  orders
  INNER JOIN customers ON orders.customer_code = customers.customer_code
  INNER JOIN menus ON orders.menu_code = menus.menu_code
WHERE
  order_code = 1;

SELECT
  first_name,
  department_id
FROM
  employees
WHERE
  department_id = 20;

UPDATE
  employees
SET
  department_id = 100
WHERE
  department_id = (
    SELECT
      department_id
    FROM
      employees
    WHERE
      first_name = 'ji-hun'
  );

UPDATE
  employees
SET
  department_id = (
    SELECT
      department_id
    FROM
      employees
    WHERE
      first_name = 'ji-hun'
  )
WHERE
  department_id = 100;

-- migrate:down