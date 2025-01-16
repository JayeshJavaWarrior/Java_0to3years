package Functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {

		Predicate<Integer> p = i -> i >= 10;
//		p.test(6);
		System.out.println(p.test(10));

		System.out.println("-------------------------------;;;;;;;;;;;;;;;;;;-----------------------");
		String[] names = { "Akshu", "Ajay", "Akshay", "Akay" };

		Predicate<String> t = name -> name.charAt(0) == 'Z';

		for (String name : names) {
			if (t.test(name)) {
				System.out.println(name);

			}else {
				System.out.println("False");
			}
		}
		System.out.println("-------------------------------;;;;;;;;;;;;;;;;;;-----------------------");
		
		
		
	}

}
