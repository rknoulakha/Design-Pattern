package singelton;

public class Main {

	public static void main(String args[]) {
		Singelton s1, s2;
		s1 = Singelton.getInstance();
		System.out.println(s1);
		s2 = Singelton.getInstance();
		System.out.println(s2);
	}

}
