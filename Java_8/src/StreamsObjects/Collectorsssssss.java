package StreamsObjects;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collectorsssssss {

	public static void main(String[] args) {

		Person p1 = new Person("John", "USA");
		Person p2 = new Person("Steve", "JAPAN");
		Person p3 = new Person("Ashok", "INDIA");
		Person p4 = new Person("Ching", "CHINA");
		Person p5 = new Person("Kumar", "INDIA");

		List<Person> person = Arrays.asList(p1, p2, p3, p4, p5);

		List<Person> indians = person.stream().filter(i -> i.country.equals("INDIA")).collect(Collectors.toList());
		System.out.println(indians);

		person.stream().filter(i -> i.country.equals("INDIA")).collect(Collectors.toList())
				.forEach(i -> System.out.println(i));

		//// collect names of persons who are belongs to india and store into names
		

		System.out.println("collect names of persons who are belongs to india and store into names");
		person.stream().filter(i -> i.country.equals("INDIA")).map(i -> i.name).collect(Collectors.toList())
				.forEach(i -> System.out.println(i));

	}

}
