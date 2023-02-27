import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PizzaDecorator implements Pizza {
	private List<Pizza> pizzas;
	private int price;

	public PizzaDecorator(Pizza... pizzas) {
		this.pizzas = Arrays.asList(pizzas);
	}

	public static String menuItemFromPizza(Pizza pizza) {
		return pizza.toString() + " Price: " + pizza.getPrice() + "€";
	}
	@Override
	public int getPrice() {
		return this.price;
	}
	@Override
	public String toString() {
		return pizzas.stream().map(PizzaDecorator::menuItemFromPizza).collect(Collectors.joining("\n"));
	}

}
