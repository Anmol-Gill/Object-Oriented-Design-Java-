
public final class Product {

	final String prodName;
	final String prodDes;
	final double prodPrice;
	final int maxQ;
	
	public Product(String prodName, String prodDes, double prodPrice, int maxQ) {
		this.prodName = prodName;
		this.prodDes = prodDes;
		this.prodPrice = prodPrice;
		this.maxQ = maxQ;		
	}

	public String getProdName() {
		return prodName;
	}
	
	public String getProdDes() {
		return prodDes;
	}
	
	public double getProdPrice() {
		return prodPrice;
	}
	
	public int maxQ() {
		return maxQ;
	}
	
	@Override
	public String toString() {
		return String.format(prodName + ", " + prodDes + ", " + prodPrice + ", " + maxQ);
	}

	/* 
	 * Tester
	public static void main(String[] args) {
		Product p1 = new Product("cereal","frosted flakes",12.0, 4);
		System.out.println(p1);
	}
	*/
}
