package rozw10;

public class Doktorant implements Premiowany{
    protected double stypendium; 
    
    @Override
    public void ustalPremie(double premia) {
            stypendium += 100;
    }
}
