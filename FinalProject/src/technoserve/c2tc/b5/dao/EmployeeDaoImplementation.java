package technoserve.c2tc.b5.dao;

import javax.persistence.EntityManager;

import technoserve.c2tc.b5.entities.Employee;


public class EmployeeDaoImplementation implements EmployeeDao {
	EntityManager em;
	
	public EmployeeDaoImplementation() {
	   em=Configuration.createEntityManager();
	}

	@Override
	public void addEmployee(Employee employee) {
		em.persist(employee);
		
	}

	@Override
	public void updateEmployee(Employee employee) {
		em.merge(employee);
		
	}

	@Override
	public void deleteEmployee(int id) {
		Employee employee=SearchEmployee(id);
		em.remove(employee);
		
	}

	@Override
	public Employee SearchEmployee(int id) {
		Employee employee=em.find(Employee.class,id);
          return employee;
	}

	@Override
	public void startTransaction() {
		em.getTransaction().begin();
		
	}

	@Override
	public void EndTransaction() {
		em.getTransaction().commit();
		
	}

}
