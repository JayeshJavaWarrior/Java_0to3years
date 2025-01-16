package streamsIntegers;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumbers {

	public static void main(String[] args) {
		List<Integer> lists = Arrays.asList(5, 29, 211, 2, 8, 21, 29, 2, 16, 44);

		// lists.stream().sorted().forEach(e->System.out.println("MaxNumber: " + e));

		List<Integer> sortedAscendingList = lists.stream().sorted().collect(Collectors.toList());
		System.out.println("sortedAscendingList: " + sortedAscendingList);
		
		
		List<Integer> sortedDcendingList = lists.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println("sortedDcendingList: " + sortedDcendingList);
	}

}
