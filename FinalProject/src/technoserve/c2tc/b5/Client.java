package technoserve.c2tc.b5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import technoserve.c2tc.b5.entities.Employee;
import technoserve.c2tc.b5.entities.Item;
import technoserve.c2tc.b5.service.EmployeeService;
import technoserve.c2tc.b5.service.EmployeeServiceImplementation;
import technoserve.c2tc.b5.service.ItemService;
import technoserve.c2tc.b5.service.ItemServiceImplementation;

public class Client {
public static void main(String[] args) throws ParseException {
	String str="27-01-2022";
	String str1="27-09-2024";
	SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
	Date date= format.parse(str);
	SimpleDateFormat format1=new SimpleDateFormat("dd-MM-yyyy");
	Date date1= format1.parse(str1);
	
	Item i =new Item();
	ItemService is=new ItemServiceImplementation();
	is.updateItem(i);
	EmployeeService service=new EmployeeServiceImplementation();
	Employee e=new Employee();
	
	e.setId(01);
	e.setName("Max");
	e.setAddress("Banglore");
	e.setDesignation("Accountant");
	e.setDob(date);
	e.setSalary(50000);
	e.setShop("Unique Products");
	
	
	i.setName("Fogg");
	i.setPrice(900);
	i.setUid(1102);
	i.setManufacturing(date);
	i.setExpiry(date1);
	i.setCat(null);
	//is.addItem(i);
	//System.out.println(is.SearchItem(1101));
	//is.updateItem(i);
	//is.deleteItem(1102);
}
}
