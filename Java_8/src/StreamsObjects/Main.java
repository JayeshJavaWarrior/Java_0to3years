package StreamsObjects;

import java.util.*;
import java.util.stream.*;



public class Main {
    public static void main(String[] args) {
        List<Emplo> employees = Arrays.asList(
            new Emplo("John", 50000),
            new Emplo("Jane", 60000),
            new Emplo("Jack", 45000)
        );

        List<String> sortedNames = employees.stream()
                                            .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))  // Sort by salary descending
                                            .map(Emplo::getName)  // Extract names
                                            .collect(Collectors.toList());  // Collect into a list
        List<String> sortedNames1 = employees.stream()
                .sorted(Comparator.comparingDouble(Emplo::getSalary).reversed())  // Sort by salary descending
                .map(Emplo::getName)  
                .collect(Collectors.toList());
        System.out.println(sortedNames);
    }
    
}
class Emplo {
    String name;
    double salary;

    Emplo(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}