package Functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Person {
	String name;
	int age;

	public Person(String name, int age) {

		this.name = name;
		this.age = age;
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// Predicate<Integer> p = i -> i >= 10;

		Person p1 = new Person("Jayesh", 26);
		Person p2 = new Person("Akshu", 25);
		Person p3 = new Person("Renuka", 29);
		Person p4 = new Person("Krishna", 16);
		Person p5 = new Person("Radha", 16);

		List<Person> persons = Arrays.asList(p1, p2, p3, p4, p5);

		/*
		 * Predicate<Person> predicate = p -> p.age >= 18;
		 * 
		 * for (Person person : persons) { if (predicate.test(person)) {
		 * 
		 * System.out.println(person.name);
		 * 
		 * } }
		 */
		
		persons.stream().filter(p->p.age>=18).forEach(p->System.out.println(p.name));

	}

}
