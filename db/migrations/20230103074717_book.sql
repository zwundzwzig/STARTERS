-- migrate:up
CREATE TABLE book (
  bookNo CHAR(10) PRIMARY KEY NOT NULL,
  bookTitle VARCHAR(30),
  bookAuthor VARCHAR(20),
  bookTime DATETIME,
  bookPrice INT,
  bookPublisher CHAR(10)
);

INSERT INTO book VALUE 
    ('B001', '자바프로그래밍', '홍길동', STR_TO_DATE('01-01-2021', '%d-%m-%Y'), 30000, '서울출판사'), 
    ('B002', '데이터베이스', '이몽룡', STR_TO_DATE('01-01-2020', '%d-%m-%Y'), 25000, '대한출판사'), 
    ('B003', 'HTML/CSS', '성춘향', STR_TO_DATE('01-01-2021', '%d-%m-%Y'), 18000, '민국출판사'),
    ('B004', '자바스크립트', '강길동', STR_TO_DATE('01-01-2020', '%d-%m-%Y'), 28000, '새싹출판사');

SELECT bookNo AS 도서 번호, bookTitle AS 도서 제목, bookAuthor AS 저자, YEAR(bookTime) AS 발행시간, bookPrice AS 가격, bookPublisher AS 출판사 FROM book;

-- migrate:down

