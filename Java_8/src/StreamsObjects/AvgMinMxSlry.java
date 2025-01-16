package StreamsObjects;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Employee1 {
	int id;
	String name;
	double salary;

	public Employee1(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
}

//Write a java program to get MAX, MIN and AVG salary from given Employee1s data using Stream API.
public class AvgMinMxSlry {

	public static void main(String[] args) {
		Employee1 e1 = new Employee1(1, "Robert", 26500.00);
		Employee1 e2 = new Employee1(2, "Abraham", 46500.00);
		Employee1 e3 = new Employee1(3, "Ching", 36500.00);
		Employee1 e4 = new Employee1(4, "David", 16500.00);
		Employee1 e5 = new Employee1(5, "Cathy", 25500.00);

		List<Employee1> list = Arrays.asList(e1, e2, e3, e4, e5);
		Optional<Employee1> max = list.stream().collect(Collectors.maxBy(Comparator.comparing(e -> e.salary)));
		if (max.isPresent()) {
			System.out.println("maxsalary " + max.get().salary);
		}
		Double avgesalary = list.stream().collect(Collectors.averagingDouble(e -> e.salary));
		System.out.println("avgesalary " + avgesalary);
		
		Optional<Employee1> minsalary=list.stream().collect(Collectors.minBy(Comparator.comparing(e ->e.salary)));
		if (minsalary.isPresent()) {
			System.out.println("minsalary " + minsalary.get().salary);
		}
		

	}

}
