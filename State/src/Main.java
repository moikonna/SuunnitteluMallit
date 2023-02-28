
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Pelihahmo hahmo = new Pelihahmo();
        
        Charmander charmander = new Charmander();
        hahmo.setPelihahmoState(charmander);
        System.out.println(hahmo.getState().toString());
        charmander.Name();
        charmander.showAttack();
        System.out.println("\n");
        
        Charmeleon charmeleon = new Charmeleon();
        hahmo.setPelihahmoState(charmeleon);
        System.out.println(hahmo.getState().toString());
        charmeleon.Name();
        charmeleon.showAttack();
        System.out.println("\n");
        
        Charizard charizard = new Charizard();
        hahmo.setPelihahmoState(charizard);
        System.out.println(hahmo.getState().toString());
        charizard.Name();
        charizard.showAttack();
	}

}
