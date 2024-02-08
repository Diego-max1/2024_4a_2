/**
 * 
 * @author 4a
 *
 */
public class Auto extends Veicolo {
	private String tipo;
	private int tariffaGiornaliera;
/**
 * 
 * @param marca Marca dell'auto
 * @param disabile se ha disabilità
 * @param speseVigilanzaVeicolo spese
 * @param tipo Tipologia della Macchina
 */
	public Auto(String targa, String marca, boolean disabile, float speseVigilanzaVeicolo, String tipo) {
		super(targa, marca, disabile, speseVigilanzaVeicolo);
		this.tipo = tipo;
		tariffaGiornaliera = 10;
	}
/**
 * @param targa targa della macchina
 */
	public String toString() {
		String s = "";
		s += "targa=" + targa + "\nmarca=" + marca + "\ndisabile=" + disabile
				+ "\nSpese Vigilanza Veicolo="
				+ speseVigilanzaVeicolo + "\n" + "tipo=" + tipo + "\nTariffa Giornaliera=" + tariffaGiornaliera;
		return s;
	}
/**
 * 
 * @param args il main
 */
	public static void main(String[] args) {
		Veicolo v1 = new Veicolo("X9JXLP", "Mercedes", false, 7.99F);
		Auto a1 = new Auto("X9JXLP", "Mercedes", false, 7.99F, "Van");
		System.out.println(v1);
		System.out.println(a1);
	}

}
