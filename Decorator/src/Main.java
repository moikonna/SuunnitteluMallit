
public class Main {

	public static void main(String[] args) {
		Pizza kebabpizza = new Kebab(new Kinkku (new Jalopeno (new PizzaPohja())));
		Pizza salamipizza = new Salami(new Kinkku (new Jalopeno (new PizzaPohja())));
		Pizza kinkkupizza = new Kinkku(new Salami (new Jalopeno (new PizzaPohja())));
		PizzaDecorator menu = new PizzaDecorator(kebabpizza,salamipizza,kinkkupizza);
		System.out.println(menu);
	}

}
