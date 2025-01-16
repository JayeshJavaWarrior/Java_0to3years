package Functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Employee {
	String name;
	String location;
	String dept;

	public Employee(String name, String location, String dept) {

		this.name = name;
		this.location = location;
		this.dept = dept;
	}

}

public class PredicateJoining {

	public static void main(String[] args) {
		Employee e1 = new Employee("Stefen", "Pune", "It");
		Employee e2 = new Employee("Jayesh", "Sweden", "Dev");
		Employee e3 = new Employee("Ashok", "Pune", "Db");
		Employee e4 = new Employee("Akshu", "Sweden", "Dev");

		List<Employee> emps = Arrays.asList(e1, e2, e3, e4);

		/*
		 * Predicate<Employee> p1 = e -> e.location.equals("Sweden");
		 * Predicate<Employee> p2 = e -> e.dept.equals("Dev"); // Predicate Joining
		 * 
		 * Predicate<Employee> p = p1.and(p2);
		 * 
		 * for (Employee e : emps) {
		 * 
		 * if (p.test(e)) { System.out.println(e.name); }
		 * 
		 * }
		 */

		
		 List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
         list.stream()
             .filter(n -> n%2 == 0)
             .forEach(System.out::println);

         emps.stream().filter(p->p.location.equals("Sweden")).filter(p->p.dept.equals("Dev")).
         forEach(p-> System.out.println(p.name));
        		
		
		
		
	}

}
