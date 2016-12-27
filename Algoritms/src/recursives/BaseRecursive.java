package recursives;

public class BaseRecursive {

	public static void main(String[] args) {
		//myMethod(5);
		myMethod1(3);
	}

	static void myMethod(int counter) {
		if (counter == 0)
			return;
		else {
			System.out.println("" + counter);
			myMethod(--counter);
			return;
		}
	}

	static void myMethod1(int counter) {
		if (counter == 0)
			return;
		else {
			System.out.println("hello" + counter);
			myMethod1(--counter);
			System.out.println("" + counter);
			return;
		}
	}

}
