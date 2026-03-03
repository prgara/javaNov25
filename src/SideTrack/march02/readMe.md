# Recap 
rdbms, sql, how to create a db , create table, insert data in table, constraints as well as functions

Constraints -> NOT NULL, UNIQUE - every entry must be unique



CHECK -> specify a condition and it should satisfy


AGE > 18 

check (age > 18)
- modify existing table with your name and add a new field for check constraint and try to add some data

PRIMARY KEY -> Unique, NOT NULL, one entry per table

FOREIGN KEY -> primary key of other table, creates relationship b/w 2 tables.


primary key vs unique key
-primary will be one per table and unique key can be multiple per table
-primary have no null value and unique can have a null value

can we have unique key as foreign key


JOINS -> They are used to combine tables or when we want to fetch data from multiple tables.

INNER JOIN -> returns matching records only from both the tables
LEFT JOIN -> returns all records from left and matching records
RIGHT JOIN -> return all records form right table and matching records
FULL OUTER JOIN -> all the records form both tables

JOINS

how to get the second-highest salary ? -> sub query , offset -192   193

SELECT DISTINCT salary from employees
order by salary desc LIMIT 2 OFFSET 1;

create PROCEDURE getSalary() select salary from employees;

1 -100 2- 101-200 3- 201-300 4 5 6


STORED Procedures ->  precompiled sql blocks stored in db. 

functions, methods

select max(salary) from employees where salary < (select max(salary) from employees);

call getSalary();
