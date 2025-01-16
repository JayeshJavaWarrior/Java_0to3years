package StreamsObjects;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeData {
	public static void main(String[] args) {

		List<Employee> emps = new ArrayList<Employee>();

		emps.add(new Employee(1, "Jhansi", 32, "Female", "HR", 2011, 25000.0));
		emps.add(new Employee(2, "Smith", 25, "Male", "Sales", 2015, 13500.0));
		emps.add(new Employee(3, "David", 29, "Male", "Infrastructure", 2012, 18000.0));
		emps.add(new Employee(4, "Orlen", 28, "Male", "Development", 2014, 32500.0));
		emps.add(new Employee(5, "Charles", 27, "Male", "HR", 2013, 22700.0));
		emps.add(new Employee(6, "Cathy", 43, "Male", "Security", 2016, 15000.0));
		emps.add(new Employee(7, "Ramesh", 35, "Male", "Finance", 2010, 27000.0));
		emps.add(new Employee(8, "Suresh", 31, "Male", "Development", 2015, 34500.0));
		emps.add(new Employee(9, "Gita", 24, "Female", "Sales", 2016, 11500.0));
		emps.add(new Employee(10, "Mahesh", 38, "Male", "Security", 2015, 11000.5));
		emps.add(new Employee(11, "Gouri", 27, "Female", "Infrastructure", 2014, 15700.0));
		emps.add(new Employee(12, "Nithin", 25, "Male", "Development", 2016, 28200.0));
		emps.add(new Employee(13, "Swathi", 27, "Female", "Finance", 2013, 21300.0));
		emps.add(new Employee(14, "Butter", 24, "Male", "Sales", 2017, 10700.5));
		emps.add(new Employee(15, "Ashok", 23, "Male", "Infrastructure", 2018, 12700.0));
		emps.add(new Employee(16, "Sanvi", 26, "Female", "Development", 2015, 28900.0));

		// 1. How many male and female employees are there in the organization?

		Map<String, Long> mp = emps.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(" 1 )male and female employees are there in the organization   " + mp);

		// 2. Print the name of all departments in the organization.
		List<String> str = emps.stream().map(i -> i.department).distinct().collect(Collectors.toList());
		// .forEach(i -> System.out.println("2)name of all departments in the
		// organization " + i));

		System.out.println(" Print the name of all departments in the organization. " + str);

		// 3. What is the average age of male and female employees?

		Map<String, Double> mp1 = emps.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
		System.out.println("3) average age of male and female employees = " + mp1);

		// 4. Get the details of the highest-paid employee in the organization.

		Optional<Employee> HpdEmplyee = emps.stream()
				.collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		if (HpdEmplyee.isPresent()) {
			System.out.println("maxsalary " + HpdEmplyee.get());
		}

		// Get the names of all employees who have joined after 2015.
		emps.stream().filter(i -> i.yearOfJoining > 2015).forEach(i -> System.out.println(i.name));

		// 6. Count the number of employees in each department
		Map<String, Long> mps = emps.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println("6) the number of employees in each department = " + mps);
		// 7. What is the average salary of each department?

		Map<String, Double> salary =

				emps.stream().collect(Collectors.groupingBy(Employee::getDepartment,
						Collectors.averagingDouble(Employee::getSalary)));

		System.out.println("7) What is the average salary of each department? = " + salary);
		// Get the details of the youngest male employee in the development department.
		Optional<Employee> youngEmplyee = emps.stream().filter(e -> e.gender.equals("Male"))
				.filter(e -> e.department.equals("Development"))
				.collect(Collectors.minBy(Comparator.comparing(Employee::getAge)));
		if (youngEmplyee.isPresent()) {
			System.out.println(
					"8)details of the youngest male employee in the development department. " + youngEmplyee.get());
		}

		// 9. Who has the most working experience in the organization?
		Optional<Employee> ExpEmployee = emps.stream()
				.collect(Collectors.minBy(Comparator.comparing(Employee::getYearOfJoining)));
		if (ExpEmployee.isPresent()) {
			System.out.println("9)most working experience in the organization. " + ExpEmployee.get());
		}
		// 10. How many male and female employees are there in the sales and marketing
		// team
		Map<String, Long> num = emps.stream().filter(e -> e.department.equals("Sales"))
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println("10. How many male and female employees are there in the sales and marketing team. " + num);
		// 11. What is the average salary of male and female employees?
		Map<String, Double> avg = emps.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println("11. What is the average salary of male and female employees? = " + avg);

	}

}
