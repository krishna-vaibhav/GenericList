package com.yash.projectdemo.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import com.yash.projectdemo.domain.Address;
import com.yash.projectdemo.domain.Employee;
import com.yash.projectdemo.domain.Person;

public class TestDemo {
	
	static List<Employee> employeeList = new ArrayList<Employee>();
	static List<Person> personList = new ArrayList<Person>();
	static List<Address> addressList = new ArrayList<Address>();

	static <T> List<Object> genericDisplay(List<T> element, String fieldName) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{

		Class c = null;
		List<Object> list = new ArrayList<>();
		
		for (Object t : element) {
			c = t.getClass();
			break;
		}

		Method method = c.getDeclaredMethod("get" + fieldName);

		for (Object o : element) {
			list.add((Object) method.invoke(o));
		}

		return list;
	}

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException  {

		employeeList.add(new Employee(1, "emp1", 1234));
		employeeList.add(new Employee(2, "emp2", 1235));
		employeeList.add(new Employee(3, "emp1", 1236));
		employeeList.add(new Employee(4, "emp2", 1237));
		employeeList.add(new Employee(5, "emp1", 1238));

		personList.add(new Person(1, "p1", "xyz", 3000));
		personList.add(new Person(2, "p2", "abc", 6000));
		personList.add(new Person(3, "p3", "xyz", 9000));
		personList.add(new Person(4, "p4", "abc", 5000));
		personList.add(new Person(5, "p5", "xyz", 3000));

		addressList.add(new Address(1, "200002", "pqr"));
		addressList.add(new Address(2, "200003", "prr"));
		addressList.add(new Address(3, "200004", "p1r"));
		addressList.add(new Address(4, "200005", "aqr"));
		addressList.add(new Address(5, "200006", "bqr"));

		String field = "pId";
		List<Object> list = genericDisplay(personList, field);

		for (Object object : list) {
			System.out.println(field + " is " + object);
		}

	}
}
