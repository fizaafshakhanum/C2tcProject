package technoserve.c2tc.b5.dao;

import technoserve.c2tc.b5.entities.Employee;

public interface EmployeeDao {
	 public void addEmployee(Employee employee);
	 public void updateEmployee(Employee employee);
		public void deleteEmployee(int id);
		public Employee SearchEmployee(int id);
	    public void startTransaction();
	    public void EndTransaction();
		
	    

}
