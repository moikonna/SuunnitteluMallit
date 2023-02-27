
public class Kebab extends PizzaDecorator implements Pizza {
	private static final int PRICE = 1;
	private static final String NAME = "kebab";
	public Kebab(Pizza p) {
		super(p);
	}
		
		public int getPrice() {
			return super.getPrice() + PRICE;
		}

		public String toString() {
			 
			return super.toString() +" "+ NAME;
			}
}
