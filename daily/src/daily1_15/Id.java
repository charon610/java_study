package daily1_15;

class Id {
	static int counter = 0;
	private int id;

	public Id() {
		id = ++counter;
	}

	public int getId() {
		return id;
	}
}
