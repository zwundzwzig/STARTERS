-- migrate:up
SCALAR FUNCTION
ROUND(), REPLACE(), CONCAT(), AVG(), ADD, TRUNCATE, MOD, ASCII(),
LENGTH(), CHAR_LENGTH(), BIT_LENGTH()
type
정수 TINYINT(1) SMALLINT(2) INT(4) LONG(8)
실수 FLOAT(4) DOUBLE(8)
사용자 구성 DECIMAL(10, 0) 

ELT(index, ), FILELD(), FIND_IN_SET(), INSTR(), LOCATE(), SUBSTRING(), SUBSTR()
암호 숨기기 select insert(@pw, 1, char_length(@pw), repeat("*", length(@pw) -1));
LEFT(), RIGHT(), UPPER(), LOWER(), LPAD(), RPAD(), TRIM()
LEADING, TRAILING, BOTH
DATE_SUB(NOW(), INTERVAL num MONTH)
cast(avg(salary) as signed integer), convert(avg(salary),signed integer), format(avg(salary), 0)
IFNULL (column, 대체값)
WHERE NULLIF(값1, 값2) IS NULL
IF(T/F, T, F)

select hire_date, SUBSTR(hire_date, 1, 4), salary, case when year(hire_date) < 2002 then salary + 5000 when year(hire_date) in (2003, 2004, 2005) then salary + 10000 else salary + 30000 end bonus from employees;
select now(), date_format(now(), '%y%m%e %W %a %H%i%s');
select * from employees where instr(hire_date, '06') = 6;
select 
    datediff(now(), hire_date) 경과일수, 
    TRUNCATE(datediff(now(), hire_date) / 7, 0) 경과주수, 
    TRUNCATE(datediff(now(), hire_date) / 365, 0) 경과년수
from employees;
select period_diff();
select
    upper(first_name),
    (
        select
            case
                when weekday(hire_date) = 0 then 'Monday'
                when weekday(hire_date) = 1 then 'Tuesday'
                when weekday(hire_date) = 2 then 'Wednesday'
                when weekday(hire_date) = 3 then 'Thursday'
                when weekday(hire_date) = 4 then 'Friday'
                when weekday(hire_date) = 5 then 'Saturday'
                when weekday(hire_date) = 6 then 'Sunday'
            end hire_day
    ) hire_day
from
    employees;

-- migrate:down
