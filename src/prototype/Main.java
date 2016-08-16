package prototype;

public class Main {

	public static void main(String args[]) throws CloneNotSupportedException {
		Prototype p1,p2;
		p1=new Prototype();
		p2=p1.getClone();
		System.out.println(p1);
		System.out.println(p2); 
	}

}
