package streamsIntegers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;


public class FindMaxMinNumbers {

	public static void main(String[] args) {

		List<Integer> lists = Arrays.asList(5, 29, 211, 2, 8, 21, 29, 2, 16, 44);

		int maxNum = lists.stream().max(Comparator.comparing(Integer::valueOf)).get();

		System.out.println("MaxNumber: " + maxNum);

		int maxMin = lists.stream().min(Comparator.comparing(Integer::valueOf)).get();

		System.out.println("maxMin: " + maxMin);

		
		
		Optional<Integer> max = lists.stream().max(Integer::compareTo);
		Optional min = lists.stream().min(Integer::compareTo);
		System.out.println(max.get());
		System.out.println(min.get());
	}

}
