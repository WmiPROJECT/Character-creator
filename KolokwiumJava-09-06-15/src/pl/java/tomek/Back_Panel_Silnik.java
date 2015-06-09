package pl.java.tomek;

import javax.swing.JPanel;



abstract class Bilet{
	
	protected int ilosc;
	protected double cena;
	
	public Bilet(){
		
}

	public void ZmienCene(double c) {
		cena = c;
	}
	public void ZmienIlosc(int i){
		ilosc = i;	

	}
	public void ShowInfo(){
		System.out.println("Cena: " + cena);
		System.out.println("Ilosc: " + ilosc);
		
	}
}
	class Ulgowy extends Bilet {
		public Ulgowy(Double c, int i){
			
			ilosc=i;
			cena=c;
			
		}
		
	}
	class Tygodniowy extends Bilet {
		public Tygodniowy(Double c, int i){
			
			ilosc=i;
			cena=c;
			
		}
		
	}
	class Studencki extends Bilet {
		public Studencki(Double c, int i){
			
			ilosc=i;
			cena=c;
			
		}
		
	}
	class Normalny extends Bilet {
		public Normalny(Double c, int i){
			
			ilosc=i;
			cena=c;
			
		}
		
	}
public class Back_Panel_Silnik extends JPanel {

	/**
	 * Create the panel.
	 */
	public Back_Panel_Silnik() {

		
		
		
		
		
	}

}
