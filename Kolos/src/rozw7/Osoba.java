package rozw7;

public class Osoba {

    private String imie;
    
    private String nazwisko;
    
    private double wiek;

    public String getImie() {
            return imie;
    }

    public String getNazwisko() {
            return nazwisko;
    }

    public double getWiek() {
            return wiek;
    }

	public Osoba(String imie, String nazwisko, double wiek) {
		super();
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.wiek = wiek;
	}

 
}
