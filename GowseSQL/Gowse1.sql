create table GowshickBook(book_Number number (5) PRIMARY KEY ,book_Name varchar2(20),author VARCHAR2(20),price number(5,2));
DESCRIBE GowshickBook


create table GowshickStudent(Student_Name VARCHAR2 (20),Student_RollNumber NUMBER (5) primary key,Department VARCHAR2(20),Score number(10));
DESCRIBE gowshickStudent


CREATE TABLE  Gowse_Author(Phone_Number number(10)primary key,First_Name Varchar2(20),Second_Name Varchar2(20),City Varchar2(20),PinCode number(8));


CREATE TABLE  Gowse_Book(Phone_Number number(10) primary key ,Book_Name varchar2(20),Price number(10,2),Author_Ref number(10) REFERENCES Gowse_Author(phone_Number),City VArchar(20),PinCode number(7));
DESCRIBE Gowse_Book

DESCRIBE gowshick_product

CREATE TABLE gowse_member(Member_Id number (10) PRIMARY KEY ,Membership_type VARCHAR2(20));


CREATE TABLE  Gowse_Books(Book_No number (5),Book_Name VARCHAR2(20)	,Author_name VARCHAR2(10),Cost number (15),Category VARCHAR2(20));

CREATE TABLE Gowse_Issues(Lib_Issue_Id number (10),Book_No number(10),Member_Id VARCHAR2(30),Issue_Date date,Return_date date);

DESCRIBE gowse_member

DESCRIBE gowse_Books

DESCRIBE gowse_issues


drop table gowse_member;