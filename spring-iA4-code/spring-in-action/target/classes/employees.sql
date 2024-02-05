
CREATE DATABASE testdb;

USE testdb;

CREATE TABLE `Employee` (
  `id` int(11) unsigned NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  `role` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO Employee VALUES(1, 'VINOD', 'ADMIN');

COMMIT;

SELECT * FROM Employee;

select e.emp_no, e.first_name, sum(s.salary) from employees e join salaries s on e.emp_no = s.emp_no group by emp_no order by sum(salary) desc limit 1;


select e.emp_no, e.first_name, s.salary from employees e left outer join salaries s on e.emp_no = s.emp_no where s.emp_no is null;
    
select * from employees where emp_no not in  ( select emp_no from salaries);