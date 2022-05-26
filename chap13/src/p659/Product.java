package p659;

public class Product<T, M> {
	private T kind;
	private M model;
	
	public T getKind() {return this.kind;}
	public M getmodel() {return this.model;}
	
	public void setkind(T kind) {this.kind = kind;}
	public void setmodel(M model) {this.model = model;}
	
	
}
