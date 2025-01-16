package StreamsObjects;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class EmployeeNew {
	String name;
	int age;
	double salary;

	public EmployeeNew(String name, int age, double salary) {

		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeNew [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

}

public class EmpWithAgeSlrgt {
//Task : Print Emp Name with Emp age whose salary is >= 50,000 using Stream API.
	public static void main(String[] args) {

		EmployeeNew e1 = new EmployeeNew("John", 35, 55000.00);
		EmployeeNew e2 = new EmployeeNew("David", 25, 45000.00);
		EmployeeNew e3 = new EmployeeNew("Buttler", 35, 35000.00);
		EmployeeNew e4 = new EmployeeNew("Steve", 45, 65000.00);
       List<EmployeeNew>emp=Arrays.asList(e1, e2, e3, e4);
    		   
		Stream<EmployeeNew> stream = Stream.of(e1, e2, e3, e4);

		stream.filter(i -> i.salary >= 50000.00).forEach(i -> System.out.println(i.name + "-" + i.age));

	}

}
