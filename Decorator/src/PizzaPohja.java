
public class PizzaPohja implements Pizza {
	
	private String NAME = "Pizza pohja";
	private int PRICE = 5;

	@Override
	public int getPrice() {
		return PRICE;
	}

	@Override
	public String toString() {
		return NAME;
	}

	

}
