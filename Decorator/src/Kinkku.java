
public class Kinkku extends PizzaDecorator implements Pizza {
	private static final int PRICE = 3;
	private static final String NAME = "kinkku";
	public Kinkku(Pizza p) {
		super(p);
	}
		
		public int getPrice() {
			return super.getPrice() + PRICE;
		}

		public String toString() {
				return super.toString() +" "+ NAME;
			}
}
