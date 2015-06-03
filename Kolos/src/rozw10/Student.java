package rozw10;

public class Student extends Osoba {

    protected double stypendium;
    
    public Student(String imie, String nazwisko, int wiek, double stypendium) {
            super(imie, nazwisko, wiek);
            this.stypendium = stypendium;
    }

    public double getStypendium() {
            return stypendium;
    }
    
    @Override
    public double wydatekOsobowy() {
            return stypendium;
    }
}
