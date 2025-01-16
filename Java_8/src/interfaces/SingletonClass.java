package interfaces;

public class SingletonClass {
	private static SingletonClass instance;

	// Private constructor
	private SingletonClass() {
	}

	// Method to get the single instance
	public static SingletonClass getInstance() {
		if (instance == null) {
			instance = new SingletonClass();
		}
		return instance;
	}
}