package rozw10;

public abstract class Osoba {
	protected String imie;
    
    protected String nazwisko;
    
    protected int wiek;

    public String getImie() {
            return imie;
    }

    public String getNazwisko() {
            return nazwisko;
    }

    public int getWiek() {
            return wiek;
    }

    public abstract double wydatekOsobowy();
    
    public Osoba(String imie, String nazwisko, int wiek) {
            super();
            this.imie = imie;
            this.nazwisko = nazwisko;
            this.wiek = wiek;
    }
}
