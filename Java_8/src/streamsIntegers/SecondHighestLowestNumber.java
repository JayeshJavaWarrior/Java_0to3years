package streamsIntegers;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class SecondHighestLowestNumber {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(5, 9, 11, 2, 8, 21, 29, 1);

		int x=list.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).findFirst().get();
		System.out.println("Second highest number: " + x)	;
		Optional<Integer> secondHighestNumber = list.stream().sorted(Collections.reverseOrder()).skip(1).findFirst();
		secondHighestNumber.ifPresent(s -> System.out.println("secondHighestNumber: " + s));
		
		int y=list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
		System.out.println("Second highest number: " + y)	;
          
		 int slc=list.stream().sorted().distinct().skip(1).findFirst().get();
		 System.out.println("Second Lowestt number: " + slc)	;
		
		
	}

}
