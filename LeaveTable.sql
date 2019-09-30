create table audit_student_info(
audit_id number primary key,
transaction_type varchar2(40),
transaction_time date,
user_name varchar2(40)
);

create or replace trigger
StudentInsertTrigger
after insert
on student_info
for each row
begin
insert into audit_student_info values(1,'insert',sysdate,'HR');
end;

insert into student_info values(STUDENTSEQ.nextval,'Chirag');

select * from audit_student_info;