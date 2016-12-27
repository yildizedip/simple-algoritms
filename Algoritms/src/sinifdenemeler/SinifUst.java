package sinifdenemeler;

public class SinifUst {

	SinifB b;
	String c;

	public SinifUst(SinifB b, String cc) {

		this.b = b;
		c=cc;

	}

	public static void main(String[] args) {

		SinifB b = new SinifB();
		SinifUst sinifUst = new SinifUst(b,new String("dd"));
		String dddd=sinifUst.c;
		SinifB bbb=sinifUst.b;
		sinifUst=null;
		
		System.out.println();
	}

}
