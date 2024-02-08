/**
 * 
 * @author 4a
 *
 */
public class Moto extends Veicolo {
	private int numRuote;
	private int tariffaGiornaliera;
/**
 * 
 * @param targa
 * @param marca
 * @param disabile
 * @param speseVigilanzaVeicolo
 * @param numRuote
 */
	public Moto(String targa, String marca, boolean disabile, float speseVigilanzaVeicolo, int numRuote) {
		super(targa, marca, disabile, speseVigilanzaVeicolo);
		this.numRuote = numRuote;
		tariffaGiornaliera = 5;
	}

	public String toString() {
		String s = "";
		s += "\ntarga=" + targa + "\nmarca=" + marca + "\ndisabile=" + disabile + "\nSpese Vigilanza Veicolo="
				+ speseVigilanzaVeicolo + "\n" + "Numero di Ruote=" + numRuote + "\nTariffa Giornaliera="
				+ tariffaGiornaliera ;
		return s;
	}
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		Veicolo v1 = new Veicolo("X9JXLP", "Mercedes", false, 7.99F);
		Auto a1 = new Auto("X9JXLP", "Mercedes", false, 7.99F, "Van");
		Moto m1 = new Moto("X9JXLP", "Mercedes", false, 7.99F, 5);
		System.out.println(v1);
		System.out.println(a1);
		System.out.println(m1);
	}

}
