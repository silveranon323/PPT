# Write your MySQL query statement below
SELECT Employeeuni.unique_id,Employees.name FROM employees
LEFT JOIN EmployeeUNI
ON employees.id=employeeuni.id;
