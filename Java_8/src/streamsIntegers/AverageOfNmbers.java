package streamsIntegers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AverageOfNmbers {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(5, 9, 11, 2, 8, 21, 29, 1);

		double avg = list.stream().mapToInt(e -> e).average().getAsDouble();
		System.out.println("AverageOfNmbers: " + avg);

		double average = list.stream().collect(Collectors.averagingDouble(Integer::doubleValue));

		System.out.println("The average is: " + average);
		
		
		
	}
	
	
	

}
