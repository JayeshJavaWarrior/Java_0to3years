package streamsIntegers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitNumbersAdditions {
//get first 5 numbers and it additons
	public static void main(String[] args) {
		List<Integer> lists1 = Arrays.asList(1,2,3,4,5,6);
	
		
         Integer sum= 
        		 lists1.stream().limit(5).reduce((p,q)->p+q).get();
         System.out.println("first 5 numbers and it additons: " + sum);
         
         Integer sum1= 
        		 lists1.stream().skip(5).reduce((p,q)->p+q).get();
         System.out.println("first 5 numbers and it additons: " + sum1);
		
	}

}
