package streamsIntegers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOddNumbers {

	public static void main(String[] args) {

		List<Integer> lists = Arrays.asList(5, 9, 11, 2, 8, 21, 29, 1);

		List<Integer> EvenNumbesr = lists.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());

		System.out.println("EvenNumbers: " + EvenNumbesr);

	//	lists.stream().filter(e -> e % 2 == 0).forEach(e -> System.out.println("EvenNumbers: " + e));

		List<Integer> Oddnumber = lists.stream().filter(e -> e % 2 != 0).collect(Collectors.toList());
		System.out.println("Oddnumber: " + Oddnumber);
    

  List<Integer>myoddnubersssss=lists.stream().filter(e->e%2!=0).collect(Collectors.toList());
  
	System.out.println("myoddnubersssss: " + myoddnubersssss);
}
}