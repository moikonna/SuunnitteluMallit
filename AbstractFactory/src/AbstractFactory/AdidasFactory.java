package AbstractFactory;

public class AdidasFactory extends AbstractFactory {

	@Override
	public Vaate createLippis() {
		return new AdidasLippis();
	}

	@Override
	public Vaate createPaita() {
		return new AdidasPaita();
	}

	@Override
	public Vaate createFarkut() {
		return new AdidasFarkut();
	}

	@Override
	public Vaate createKengat() {
		return new AdidasKengat();
	}

}
