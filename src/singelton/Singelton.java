package singelton;

public class Singelton {

	static Singelton obj = null;

	private Singelton() {

	}

	public static Singelton getInstance() {
		if (obj == null) {
			obj = new Singelton();
		}
		return obj;
	}

}
