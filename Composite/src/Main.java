
public class Main {

	public static void main(String[] args) {
		Komponentti cpu = new Cpu(500.0);
		Komponentti gpu = new Gpu(1000.0);
		Komponentti ram = new Ram(100.0);
		Komponentti verkko = new VerkkoKortti(50.0);
		Emolevy emolevy = new Emolevy(200.0);
		Kotelo kotelo = new Kotelo(150.0);
		emolevy.addKomponentti(ram);
		emolevy.addKomponentti(cpu);
		emolevy.addKomponentti(gpu);
		emolevy.addKomponentti(verkko);
		System.out.println(emolevy.GetHinta());
		kotelo.addKomponentti(emolevy);
		System.out.println(kotelo.GetHinta());
	}

}
