package technoserve.c2tc.b5.service;

import technoserve.c2tc.b5.entities.Employee;

public interface EmployeeService
{
	public void addEmployee(Employee employee);
    public void updateEmployee(Employee employee);
	public void deleteEmployee(int id);
	public Employee SearchEmployee(int id);

}
