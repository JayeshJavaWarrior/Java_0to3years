package Functional_interface;

@FunctionalInterface
interface FunctionalInterfaces {

	public void start(); // Only one Abstarct method

}

public class MyApp {

	public static void main(String[] args) {

		FunctionalInterfaces fit = () -> System.out.println("FunctionalInterfaces Starts ");
		fit.start();

	}

}
