package sayilar;

public class Clonal {

	public static void main(String[] args) {
		try {
			Test test= new Test();
			Test test2=  (Test) test.clone();
			
			if(test.equals(test2)) System.out.println("ok");
			else if(test==test2) System.out.println("ff");
			System.out.println("not equal");
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		} 
	}
}
