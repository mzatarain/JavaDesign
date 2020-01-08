package singletonPattern;

public class SingletonPatternDemo {
	public static void main(String[]args) {
		//illegal construct
		//Compile time error: The constructor SingletonObject() is not visible
		//SingleObject object = new SingleObject();
		
		//get the only object available
		SingleObject object = SingleObject.getInstance();
		
		//show the message
		object.showMessage();
	}
}
