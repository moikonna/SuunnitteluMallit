
public class Jalopeno extends PizzaDecorator  implements Pizza {
	private static final int PRICE = 2;
	private static final String NAME = "jalopeno";
	public Jalopeno(Pizza p) {
		super(p);
	}
		
		public int getPrice() {
			return super.getPrice() + PRICE;
		}

		public String toString() {
			 
			return super.toString() +" "+ NAME;
			}
}
