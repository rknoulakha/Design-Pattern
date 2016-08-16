package builder;

public class Phone {
	
	private String os;
	private String processor;
	private int ram;
	private double display;
	private int battery;
	
	
	public Phone(String os, String processor, int ram, double display, int battery) {
		super();
		this.os = os;
		this.processor = processor;
		this.ram = ram;
		this.display = display;
		this.battery = battery;
	}


	@Override
	public String toString() {
		return "Phone [os=" + os + ", processor=" + processor + ", ram=" + ram + ", display=" + display + ", battery="
				+ battery + "]";
	}
	
	

}
