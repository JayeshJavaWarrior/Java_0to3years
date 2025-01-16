package streamsIntegers;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class NumbersStartsWithPrefix2 {

	public static void main(String[] args) {

		List<Integer> lists = Arrays.asList(5, 29, 211, 2, 8, 21, 29, 1, 16, 44);

		List<String> Pre = lists.stream().map(e -> String.valueOf(e)).filter(e -> e.startsWith("2"))
				.collect(Collectors.toList());
		System.out.println("startsWith: " + Pre);
		List<Integer> xn = lists.stream().map(String::valueOf).filter(e -> e.startsWith("2"))
				.map(Integer::valueOf).collect(Collectors.toList());
		System.out.println("startsWith2: " + xn);
		
		//lists.stream().filter(num -> num.toString().startsWith("2")).forEach(num->System.out.println("startsWith2: " + num));
	}

}
