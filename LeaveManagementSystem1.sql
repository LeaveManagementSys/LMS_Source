create table Leaves(leave_Id integer primary key,emp_Id varchar(10),foreign key(emp_Id) references Employee(employee_Id),
leave_Type varchar2(20),from_Date date,to_Date date,designation varchar2(20),leave_Desc varchar2(40),leave_Balances integer,leave_Status varchar2(20)); 

insert into Leave values('501','E100','CasualLeave','02-OCT-2019','02-OCT-2019','associate engineer','Nill',20,'Approved');
insert into Leave values('503','E101','CasualLeave','05-OCT-2019','05-OCT-2019','associate engineer','Nill',14,'Approved');

select * from Leave;


create table employees(employee_Id varchar(10) primary key,first_name varchar(15),
last_name varchar(15),email varchar(20),dob date,mobileno number(10),salary number(10),
job_location varchar(10),address varchar(20),designation varchar(20));

ALTER TABLE employees rename column mobileno to mobile_no;

select * from employees;

insert into employees values('E100','vamshi','vemula','vamshi@gmail.com','15-JAN-1997',9098989879,27000,'hyderabad','malkajgiri','associate engineer');
insert into employees values('E101','swapna','N','swapna@gmail.com','10-JAN-1996',9098988779,27600,'chennai','hi-tech city','associate engineer');
insert into employees values('E102','gayatrhi','p','gayathri@gmail.com','01-JAN-1997',7098989879,27900,'banglore','gachibowli','software engineer');

create table humanresource(hr_id varchar(10),first_name varchar(20),last_name varchar(20),designation varchar(10),email varchar(20));

insert into humanresource values('H100','krishna','kiran','hr','krishna@gmail.com');
insert into humanresource values('H101','sujhatha','avula','hr','sujhatha@gmail.com');

create table lmanager(manager_id varchar(10),first_name varchar(20),last_name varchar(20),designation varchar(10),email varchar(20));

insert into lmanager values('M100','kranthi','m','hr','kranthi@gmail.com');
insert into lmanager values('M101','arjun','reddy','manager','arjun@gmail.com');

create table login(user_Id varchar2(40),password varchar(40));

insert into login values('E100','vvk@1997');
insert into login values('E100','ns@1996');
insert into login values('H100','pg@1997');
insert into login values('M100','prk@626');

select * from login;