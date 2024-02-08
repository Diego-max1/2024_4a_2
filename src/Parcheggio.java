/**
 * 
 * @author 4a
 *
 */
public class Parcheggio {
	private String indirizzo;
	private Veicolo[] Veicoli;
	private int maxCap;
/**
 * 
 * @param indirizzo indirizzo del parcheggio
 * @param maxCap capacità massima
 */
	public Parcheggio(String indirizzo, int maxCap) {
		this.indirizzo = indirizzo;
		Veicoli = new Veicolo[maxCap];
	}
/**
 * 
 * @param v
 * @return
 */
	boolean addVeicolo(Veicolo v) {
		if (maxCap < Veicoli.length) {
			Veicoli[maxCap++] = v;
			return true;
		}
		return false;
	}
/**
 * 
 * @return
 */
	String visTutti() {
		String s = "";
		for (int i = 0; i < maxCap; i++)
			s += Veicoli[i] + "\n";
		return s;
	}
/**
 * 
 * @param targa
 * @param marca
 * @return
 */
	boolean modificaMarca(String targa, String marca) {
		for (int i = 0; i < maxCap; i++)
			if (Veicoli[i].targa.equalsIgnoreCase(targa)) {
				Veicoli[i].marca = marca;
				return true;
			}
		return false;
	}
/**
 * 
 * @param targa
 * @return
 */
	boolean uscitaVeicolo(String targa) {
		for (int i = 0; i < maxCap; i++)
			if (Veicoli[i].targa.equalsIgnoreCase(targa)) {
				for (int a = 0; a < maxCap; a++)
					Veicoli[a] = Veicoli[a + 1];
				   maxCap--;
				return true;
			}
		return false;
	}
/**
 * 
 */
	public String toString() {
		String s = "";
		for (int i = 0; i < maxCap; i++)
			s += Veicoli[i] + "\n";
		return s;
	}
/**
 * 
 * @param args argomenti
 */
	public static void main(String[] args) {
		Parcheggio p1 = new Parcheggio("Via delle stelle", 5);
		Veicolo v1 = new Veicolo("X9JXLP", "Mercedes", false, 3.99F);
		Auto a1 = new Auto("X9JXQW", "Mercedes", true, 1.99F, "Van");
		Moto m1 = new Moto("X9JXPU", "Mercedes", false, 9.99F, 2);
		p1.addVeicolo(v1);
		p1.addVeicolo(a1);
		p1.addVeicolo(m1);
		System.out.println(p1);
		System.out.println("-------------------------------");
		System.out.println(p1.visTutti());
		p1.modificaMarca("X9JXPU", "Bmw");
		System.out.println("-------------------------------");
		System.out.println(m1);
		System.out.println("-------------------------------");
		System.out.println(p1.uscitaVeicolo("X9JXLP"));
	}

}
