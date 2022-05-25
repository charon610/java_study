package daily1_13;

public class Human1 {
	private String name;
	private double height;
	private double weight;

	Human1(String n, double h, double w){
		name = n; height = h; weight = w;
	}
	
	String getName() {return name;}
	double getHeight() {return height;}
	double getWeight() {return weight;}
	
	void gainWeight(double w) {weight += w;}
	void reduceWeight(double w) {weight -= w;}
}
