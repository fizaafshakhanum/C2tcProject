package technoserve.c2tc.b5.service;

import technoserve.c2tc.b5.dao.EmployeeDao;
import technoserve.c2tc.b5.dao.EmployeeDaoImplementation;
import technoserve.c2tc.b5.entities.Employee;


public class EmployeeServiceImplementation implements EmployeeService {
	EmployeeDao ed;
	
	public EmployeeServiceImplementation()
	{
		ed=new EmployeeDaoImplementation();
		
		
	}

	@Override
	public void addEmployee(Employee employee) {
		ed.startTransaction();
		ed.addEmployee(employee);
		ed.EndTransaction();
	}

	@Override
	public void updateEmployee(Employee employee) {
		ed.startTransaction();
		ed.updateEmployee(employee);
		ed.EndTransaction();
	}

	@Override
	public void deleteEmployee(int id) {
		ed.startTransaction();
		ed.deleteEmployee(id);
		ed.EndTransaction();
	}

	@Override
	public Employee SearchEmployee(int id) {
		Employee employee=ed.SearchEmployee(id);
		return employee;
	}
	

}
