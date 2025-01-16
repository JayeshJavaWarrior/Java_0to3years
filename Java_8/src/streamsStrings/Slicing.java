package streamsStrings;

import java.util.Arrays;
import java.util.List;

public class Slicing {

	public static void main(String[] args) {
	
		List<String> javacourses = Arrays.asList("core java", "adv java", "springboot","restapi","spring");
       
		javacourses.stream().limit(3).forEach(i->System.out.println(i));
		System.out.println(";;;;;;;;;;;;;;;;;;;;skip;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
		javacourses.stream().skip(3).forEach(i->System.out.println(i));
		
		System.out.println(";;;;;;;;;;;;;;;;;;;;Distinct;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
		
		List<String> names = Arrays.asList("raja", "rani", "ashok","raja","rani");
		names.stream().distinct().forEach(i->System.out.println(i));

	}
	}
