package StreamsObjects;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class Person {

	String name;
	String country;

	public Person(String name, String country) {
		this.name = name;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", country=" + country + "]";
	}

}

public class MatchingOps {

	public static void main(String[] args) {
		Person p1 = new Person("John", "USA");
		Person p2 = new Person("Steve", "CANEDA");
		Person p3 = new Person("Ashok", "INDIA");
		Person p4 = new Person("Ching", "CHINA");

		List<Person> persons = Arrays.asList(p1, p2, p3, p4);

		boolean status = persons.stream().anyMatch(i -> i.country.equals("INDIA"));

		System.out.println("Any Indian Available ? :: " + status);

		boolean status1 = persons.stream().allMatch(i -> i.country.equals("INDIA"));
		System.out.println("ALL Indian Available ? :: " + status1);

		boolean st = persons.stream().noneMatch(i -> i.country.equals("Pakistan"));
		System.out.println("IS NONE Available ? :: " + st);

		persons.stream().filter(P -> P.country.equals("INDIA"))
				.forEach(P -> System.out.println(P.name + "-" + P.country));

		Optional<Person> findfirst = persons.stream().filter(P -> P.country.equals("INDIA")).findAny();
		if (findfirst.isPresent()) {
			System.out.println(findfirst.get());
		}
	}

}
