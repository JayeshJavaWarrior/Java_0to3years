package interfaces;

interface interfaceChanges {
	public void start();

	public String getdata();

	public default void clean() {

		System.out.println("Car Clean successfully with default method ");
	}

	public default String getnewData() {
		String str = "Java 8 started with interface ";

		return str;
	}

	public static void cleaning() {
		System.out.println("Car Clean successfully with static method ");
	}

}

public class Car implements interfaceChanges {

	@Override
	public void start() {

		System.out.println("Car Started");

	}

	@Override
	public String getdata() {
		String str = "new java progarmm for java 8";
		return str;

	}

	public static void main(String[] args) {
		Car c = new Car();
		c.start();
		interfaceChanges.cleaning();
		c.clean();

		System.out.println(c.getdata());

		String data = c.getnewData();
		System.out.println(data);

	}

}
