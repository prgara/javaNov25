database ? -> collection of data
student, employee, bank account details


RDBMS -> Relation database management system - it stores data in form of rows and cols and maintains 
relationship b/w tables.
Oracle, h2, mysql, postgresql


SQL -> structured query language , it is not case-sensitive



show databases;

use employee_db;

create database students;
drop database student;  --- delete database
show tables; ------ used to show tables

select * from employees;   ----- view all the records from the emp table
select name,id,salary from employees;  ----- select particular col from table


Select * from employees where gender = 'MALE';  ----- condition based data search

SELECT distinct ADDRESS FROM employees;   ----- get unique rows from address table


-- record with address Canada and salary greater than 50K --


select * from employees where address = 'Canada' AND salary > 50000;

-- AND, OR, NOt ------

select * from employees where name = 'Canada' OR salary > 50000;

select * from employees where NOT gender = 'FEMALE';


select * from employees LIMIT 5; ---- limit to 5 records


alter table Gurmani rename column email TO  student_email; -- change any col name --


-- functions -> min, max, count, avg ----


select * from employees order by salary;

select max(salary) from employees;
select min(salary) from employees;

select count(name) from employees where address = 'CANADA' ;

-- find the count of employees whose salary is grater then 70K --

select count(name) from employees where salary>70000;
select count(*) from employees where salary > 70000;





