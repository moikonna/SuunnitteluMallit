package AbstractFactory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractFactory jasper = FactoryProducer.getFactory("Boss");
		System.out.println(jasper.createFarkut() +", " + jasper.createLippis()+", "+jasper.createPaita() +", " + jasper.createKengat());
	}

}
