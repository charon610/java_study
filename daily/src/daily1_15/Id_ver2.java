package daily1_15;

public class Id_ver2 {
	private static int counter = 0;
	private int id;
	
	public Id_ver2() {
		id = ++counter;
	}
	
	public int getId() {return id;}
	
	public static int getMaxId() {
		return counter;
	}
}
