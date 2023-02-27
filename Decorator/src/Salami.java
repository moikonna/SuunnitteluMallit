
public class Salami extends PizzaDecorator implements Pizza {
	private static final int PRICE = 2;
	private static final String NAME = "salami";
	public Salami(Pizza p) {
		super(p);
	}
		
		public int getPrice() {
			return super.getPrice() + PRICE;
		}

		public String toString() {
			 
			return super.toString() +" "+ NAME;
			}
}
