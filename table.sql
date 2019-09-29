create table Employee(employeeId varchar(10) primary key,firstname varchar(15),lastname varchar(15),email varchar(20),dob date,mobileno number(10),hiredate date,salary number(10),managerId varchar(10),hrid varchar(10),address varchar(20),password varchar(10),designation varchar(20));

insert into Employee values('E100','vamshi','vemula','vamshi@gmail.com','15-JAN-1997',9098989879,'19-AUG-19',27000,'M100','H100','malkajgiri','vamshi123','associate engineer');
insert into Employee values('E101','swapna','N','swapna@gmail.com','10-JAN-1996',9098988779,'19-AUG-19',27600,'M101','H101','hi-tech city','swapna123','associate engineer');
insert into Employee values('E102','gayatrhi','p','gayathri@gmail.com','01-JAN-1997',7098989879,'19-AUG-19',27900,'M100','H100','gachibowli','gayathri12','software engineer');

create table HR(hr_id varchar(10),firstname varchar(20),lastname varchar(20),designation varchar(10),email varchar(20),password varchar(10));

insert into HR values('H100','krishna','kiran','hr','krishna@gmail.com','krishna123');
insert into HR values('H101','sujhatha','avula','hr','sujhatha@gmail.com','sujhatha12');

create table manager(manager_id varchar(10),firstname varchar(20),lastname varchar(20),designation varchar(10),email varchar(20),password varchar(10));

insert into manager values('M100','kranthi','m','hr','kranthi@gmail.com','kranthi123');
insert into manager values('M101','arjun','reddy','manager','arjun@gmail.com','arjun123');

