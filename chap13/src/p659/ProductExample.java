package p659;

public class ProductExample {

	public static void main(String[] args) {
		Product<Tv, String> product1 = new Product<Tv, String>();
		product1.setkind(new Tv());
		product1.setmodel("스마트Tv");
		Tv tv = product1.getKind();
		String tvModel = product1.getmodel();
		
		Product<Car, String> product2 = new Product<Car, String>();
		product2.setkind(new Car());
		product2.setmodel("디젤");
		Car car = product2.getKind();
		String carModel = product2.getmodel();
		
	}
}
