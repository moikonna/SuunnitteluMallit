
public class Charmander implements PelihahmoState {
    public void Slash() {
        System.out.println("Slash");
    }
    public void Flamethrower() {
        System.out.println("Flamethrower");
    }
    public void FireSpin() {
        System.out.println("FireSpin");
    }
    
    @Override
     public String toString() {
        return "Charmander state";
    }
	@Override
	public void Name() {
		// TODO Auto-generated method stub
		System.out.println("Charmander");
	}

	@Override
	public void showAttack() {
		// TODO Auto-generated method stub
		Slash();
		Flamethrower();
		FireSpin();
	}

}
