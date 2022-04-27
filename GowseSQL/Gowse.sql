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


 INSERT INTO GOWSE_BOOKS101 (SELECT * FROM GOWSE_BOOKS);
 
 create table gowses_issue(
                        LIB_ISSue_ID number(10) PRIMARY KEY,
                        MEMBER_ID number(10) REFERENCES gowse_member(Member_Id),
                        BOOK_NO NUMBER(10) REFERENCES gowse_MEMBER(MEMBER_ID),
                        Issue_date date , return_date date, constraint "member" check( issue_date < return_date))
 
 drop table gowses_issue
 
 describe gowses_issue
 
insert into gowses_issue (LIB_ISSUE_ID,MEMBER_ID,BOOK_NO,ISSUE_DATE) VALUES(7001,101,101,'1-APR-22')

insert into gowses_issue (LIB_ISSUE_ID,MEMBER_ID,BOOK_NO,ISSUE_DATE) VALUES(7002,102,102,'25-APR-22')

insert into gowses_issue (LIB_ISSUE_ID,MEMBER_ID,BOOK_NO,ISSUE_DATE) VALUES(7003,103,103,'12-APR-22')

insert into gowses_issue (LIB_ISSUE_ID,MEMBER_ID,BOOK_NO,ISSUE_DATE) VALUES(7004,104,104,'16-APR-22')

 insert into gowses_issue (LIB_ISSUE_ID,MEMBER_ID,BOOK_NO,ISSUE_DATE) VALUES(7005,110,69,'17-APR-22')
 
DELETE FROM gowses_issue WHERE book_no=69;


select round(5464.9464) from dual;


create table gowshick_product (product_id number (2) primary key , product_name varchar2 (20),price number(10,2));

insert into gowshick_product values(01,'tv',450)

insert into gowshick_product values(02,'fridge',11500)

insert into gowshick_product values(03,'laptop',25000)

create table gowshick_invoice 
(invoice_Number number(5) primary key , customer_name varchar2(20), quantity number(3), product_ref REFERENCES gowshick_product(product_id));

insert into gowshick_invoice values (204,'malathi',2,01)

insert into gowshick_invoice values (205,'sathiya',4,02)

insert into gowshick_invoice values (206,'yovel',3,03)

insert into gowshick_invoice values(207,'viks',25,01)



update  gowshick_invoice set customer_name = 'vishnu' where invoice_number =204

select * from gowshick_product,gowshick_invoice

select gp.product_id, gp.product_name, gp.price, gi.invoice_Number, gi.customer_name, gi.quantity from gowshick_product gp, gowshick_invoice gi where gp.product_id=gi.product_ref

select gp.product_id,gp.product_name,gi.customer_name,gp.price*gi.quantity amount
from gowshick_product gp,gowshick_invoice gi
where gi.product_ref=gp.product_id

select * from gowshick_product gp LEFT OUTER JOIN gowshick_invoice gi on gp.product_id=gi.product_ref

select * from gowshick_product gp right OUTER JOIN gowshick_invoice gi on gp.product_id=gi.product_ref

create view gowshick_product_view as select product_id,product_name from gowshick_product

select * from gowshick_product_view

insert into gowshick_product_view values(107,'mobile');
select view_name, text from user_views where view_name='gowshick_PRODUCT_VIEW';

CREATE INDEX gowse_product_name_index on gowshick_product (product_name);

create table gowshick_catalog (grade varchar(1) primary key,max_price number(10,2),min_price number(10,2));

insert into gowshick_catalog values('A',10000,1000);
insert into gowshick_catalog values('B',5000,500);
insert into gowshick_catalog values('C',3000,200);

select * from gowshick_catalog
 
select * from gowshick_product

select p.product_name , p.price , c.grade 
from gowshick_product p  , gowshick_catalog c
where p.price between c.max_price and c.min_price

select price from gowshick_product;

drop table gowshick_bill

create table gowshick_bill(bill_number number (5) primary key,bill_date date,amount number(10,2),cus_ref number(3))

select * from gowshick_bill

create sequence gowshick_seq start with 101 increment by 1 maxvalue 1000

insert into gowshick_bill values (gowshick_seq.nextval,sysdate,14500,108)

insert into gowshick_bill values (gowshick_seq.nextval,sysdate,15680,109)

insert into gowshick_bill values (gowshick_seq.nextval,sysdate,167900,110)

insert into gowshick_bill values (gowshick_seq.nextval,sysdate,157880,111)

update  gowshick_bill set cus_ref = cus_ref+100 where cus_ref >103

select * from gowshick_bill;


List of Bills on the same date as that of customer_ref =305

Select b.bill_number from gowshick_bill a, gowshick_bill b where a.cus_Ref=305 and a.bill_date=b.bill_date



create sequence gowshick_seq1 start with 101 increment by 1 maxvalue 1000

insert into gowshick_bill values(gowshick_seq1.nextval,sysdate,14580,101)

insert into gowshick_bill values(gowshick_seq1.nextval,sysdate,15896,102)

insert into gowshick_bill values(gowshick_seq1.nextval,sysdate,20546,103)

insert into gowshick_bill values(gowshick_seq1.nextval,sysdate,32568,105)

insert into gowshick_bill values(gowshick_seq1.nextval,sysdate,45623,106)

insert into gowshick_bill values(gowshick_seq1.nextval,to_date ('10-jan-2022')+5,52369,114)
insert into gowshick_bill values(gowshick_seq1.nextval,add_months( to_date ('10-jan-2022'),5),76519,115)


update gowshick_bill set cus_ref = cus_ref+100
update gowshick_bill set amount = amount+1000


select * from gowshick_bill;

 select b.bill_number,a.amount from gowshick_bill a, gowshick_bill b where a.cus_ref = 409 and a.bill_date = b.bill_date


create table Gowse_LoanApplication(application_number number(20),customer  REFERENCES gowse_customer(customer_id) ,loan_amount number(30))

create table Gowse_Customer (Customer_id number (20) primary key, customer_name varchar(20),Phone_number number(10), credit_score number(10),constraint "customer" check( credit_score>300 and credit_score<800))

select * from gowse_customer gc JOIN gowse_LoanApplication gl on gc.customer_id = gl.customer

select gc.customer_Name,gc.phone_number,gl.application_number,gl.loan_amount 
 from  gowse_customer gc,gowse_loanapplication gl where gc.customer_id = gl.customer;

select * from gowse_customer

select * from gowse_loanapplication













