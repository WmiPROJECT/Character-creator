package rozw10;


public class Pracownik extends Osoba implements Premiowany {

        protected double pensja;
        
        public Pracownik(String imie, String nazwisko, int wiek, double pensja) {
                super(imie, nazwisko, wiek);
                this.pensja = pensja;
        }

        public double getPensja() {
                return pensja;
        }
        
        @Override
        public double wydatekOsobowy() {
                return pensja*1.2;
        }

        @Override
        public void ustalPremie(double premia) {
                this.pensja += 200;
        }
}