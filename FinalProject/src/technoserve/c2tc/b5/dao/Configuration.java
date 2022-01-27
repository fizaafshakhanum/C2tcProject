package technoserve.c2tc.b5.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

	public class Configuration {
	     private static EntityManager entitymanager;
	     private static  EntityManagerFactory entitymanagerfactory;
	     static {
	    	 entitymanagerfactory=Persistence.createEntityManagerFactory("JPA-PU");
	     }
	     public static EntityManager createEntityManager()
	     {
	    	 entitymanager= entitymanagerfactory.createEntityManager();
	    	 return entitymanager;
	    	 }
		
}
