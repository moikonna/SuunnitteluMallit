package AbstractFactory;

public class BossFactory extends AbstractFactory {
	@Override
	public Vaate createLippis() {
		return new BossLippis();
	}

	@Override
	public Vaate createPaita() {
		return new BossPaita();
	}

	@Override
	public Vaate createFarkut() {
		return new BossFarkut();
	}

	@Override
	public Vaate createKengat() {
		return new BossKengat();
	}
}
