-- migrate:up
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

-- migrate:down