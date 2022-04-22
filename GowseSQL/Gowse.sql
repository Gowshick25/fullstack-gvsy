create table GowshickBook(book_Number number (5) PRIMARY KEY ,book_Name varchar2(20),author VARCHAR2(20),price number(5,2));
DESCRIBE GowshickBook


create table GowshickStudent(Student_Name VARCHAR2 (20),Student_RollNumber NUMBER (5) primary key,Department VARCHAR2(20),Score number(10));
DESCRIBE gowshickStudent


CREATE TABLE  Gowse_Author(Phone_Number number(10)primary key,First_Name Varchar2(20),Second_Name Varchar2(20),City Varchar2(20),PinCode number(8));


CREATE TABLE  Gowse_Book(Phone_Number number(10) primary key ,Book_Name varchar2(20),Price number(10,),Author_Ref number(10) REFERENCES Gowse_Author(phone_Number),City VArchar(20),PinCode number(7));

DESCRIBE Gowse_Book

DESCRIBE gowshick_product

CREATE TABLE gowse_member(Member_Id number (10) PRIMARY KEY ,Membership_type VARCHAR2(20));


CREATE TABLE  Gowse_Books(Book_No number (5),Book_Name VARCHAR2(20)	,Author_name VARCHAR2(10),Cost number (15),Category VARCHAR2(20));

CREATE TABLE Gowse_Issues(Lib_Issue_Id number (10),Book_No number(10),Member_Id VARCHAR2(30),Issue_Date date,Return_date date);

DESCRIBE gowse_member

DESCRIBE gowse_Books

DESCRIBE gowse_issues

drop table gowse_member;

ALTER table gowse_issues add Reference varchar(30);

ALTER table gowse_issues drop COLUMN Reference;

ALTER table gowse_issues RENAME  TO gowse_Lib_Issue;

INSERT into gowse_member (MEMBER_ID , MEMBERSHIP_TYPE, MEMBER_NAME , MEMBER_ADDRESS , ACC_OPEN_DATE , FEES_PAID , MAX_BOOKS_ALLOWED , PENALTY_AMOUNT)
VALUES (1,'Lifetime','Richa_Sharma','Pune'	,'10-Dec-05',2500,5,5);

INSERT into gowse_member (MEMBER_ID , MEMBERSHIP_TYPE, MEMBER_NAME , MEMBER_ADDRESS , ACC_OPEN_DATE , FEES_PAID , MAX_BOOKS_ALLOWED , PENALTY_AMOUNT)
VALUES (2,'Annual','Sharma','delhi'	,'20-Dec-25',4500,3,2);

INSERT into gowse_member (MEMBER_ID , MEMBERSHIP_TYPE, MEMBER_NAME , MEMBER_ADDRESS , ACC_OPEN_DATE , FEES_PAID , MAX_BOOKS_ALLOWED , PENALTY_AMOUNT)
VALUES (3,'Lifetime','Rich_Sharma',''	,'4-jun-05',400,3,2);

INSERT into gowse_member (MEMBER_ID , MEMBERSHIP_TYPE, MEMBER_NAME , MEMBER_ADDRESS , ACC_OPEN_DATE , FEES_PAID , MAX_BOOKS_ALLOWED , PENALTY_AMOUNT)
VALUES (4,'Lifetime','Sharmaraj','chennai'	,'8-Dec-12',2000,3,2);


CREATE TABLE Gowse_Member101 as SELECT * FROM gowse_member 

 
 select * from gowse_member101
 
 drop table gowse_books
 
 DESCRIBE gowse_books101;

 INSERT INTO GOWSE_BOOKS101 (SELECT * FROM GOWSE_BOOKS);
 
 INSERT into gowse_Books VALUES (106,'NationalGeographic', 'Adis Scott', 1000,'Science');

 
 select * from gowse_books


 UPDATE gowse_books
SET cost= 300, category = 'RDBMS'
WHERE book_no =103 ;