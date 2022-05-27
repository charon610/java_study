package daily1_15;

public class Exid {
	static int counter = 0;
	private static int step = 1;
	private int id;
	
	public Exid() {
		id = counter += step;
	}
	
	public int getId() {
		return id;
	}
	
	public static int getStep() {
		return step;
	}
	
	public static int setStep(int s) {
		step = (s >= 1) ? s : 1;
		return step;
	}
	
	public static int getMaxId() {
		return counter;
	}
}
