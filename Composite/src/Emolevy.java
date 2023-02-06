import java.util.ArrayList;
import java.util.List;

public class Emolevy implements Komponentti {
	Double hinta;
	private List <Komponentti> komponenttiLista;
	public Emolevy (Double hinta) {
		this.hinta = hinta;
		this.komponenttiLista = new ArrayList<>();
	}
	public void addKomponentti(Komponentti k) {
		komponenttiLista.add(k);
	}
	@Override
	public Double GetHinta() {
		Double sum = hinta;
		for(int i = 0;komponenttiLista.size()>i;i++) {
			sum = sum+ komponenttiLista.get(i).GetHinta();
		}
		return sum;
	}

}
