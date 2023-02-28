
public class Charizard implements PelihahmoState {
    public void Inferno() {
        System.out.println("Inferno");
    }
    public void Ember() {
        System.out.println("Ember");
    }
    public void HeatWave() {
        System.out.println("HeatWave");
    }
    
    @Override
     public String toString() {
        return "Charizard state";
    }
	@Override
	public void Name() {
		// TODO Auto-generated method stub
		System.out.println("Charizard");
	}

	@Override
	public void showAttack() {
		// TODO Auto-generated method stub
		Inferno();
		Ember();
		HeatWave();
	}

}
