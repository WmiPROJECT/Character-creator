package rozw12;

public class Faktura {

    private double wartoscNetto;

    private double podatek;

    public Faktura(double wartoscNetto, double podatek) {
            super();
            this.wartoscNetto = wartoscNetto;
            this.podatek = podatek;
    }

    public double podajNetto() {
            return wartoscNetto;
    }

    public double podajBrutto() {
            return wartoscNetto * (1 + podatek);
    }

}
