
public class Charmeleon implements PelihahmoState {

    public void DragonBreath() {
        System.out.println("DragonBreath");
    }
    public void Flamethrower() {
        System.out.println("Flamethrower");
    }
    public void Slash() {
        System.out.println("Slash");
    }
    
    @Override
     public String toString() {
        return "Charmeleon state";
    }
	@Override
	public void Name() {
		// TODO Auto-generated method stub
		System.out.println("Charmeleon");
	}

	@Override
	public void showAttack() {
		// TODO Auto-generated method stub
		DragonBreath();
		Flamethrower();
		Slash();
	}

}
