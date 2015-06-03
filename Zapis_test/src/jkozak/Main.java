
package jkozak;
 
import java.io.*;
/**
 *
 * @author Natalia Potoczniak
 */
//   implements Serializable Trzeba doda� wsz�dzie, aby m�c
//                           zapisywa� obietky do pliku.
class Towar implements Serializable{
    private String nazwa;
    private float cena;
   
    public Towar(String nazwa,float cena){
        this.nazwa=nazwa;
        this.cena=cena;
    }
    public Towar(){
        nazwa="brak";
        cena=0.0f;
    }
    public void zmiencene(float cena){
        this.cena=cena;
    }
    public float dajCene(){
        return cena;
    }
 
    public void zmiennazwe(String nazwa){
        this.nazwa=nazwa;
    }
    public String dajNazwe(){
        return nazwa;
    }
    public void odcz(){
        System.out.format("towar: %s, cena: %.2f \n", nazwa, cena);
    }
 
    @Override
    public String toString(){
        return String.format("towar:%s,cena: %.2f \n",nazwa,cena);
    }
 
}
class ElemZam  implements Serializable{
    private Towar towar;
    private int ile;
 
    public ElemZam(Towar towar,int ile){
        this.towar=towar;
        this.ile=ile;
    }
 
    public ElemZam(Towar towar){
        this.towar=towar;
        ile=1;
    }
    public float kosztZamow(){
        return ile * towar.dajCene();
    }
    public void odcz(){
        System.out.format("\tnazwa: %s, cena:%.2f, liczba sztuk:%d, koszt zam�wienia:%.2f \n", towar.dajNazwe(),towar.dajCene(),ile,kosztZamow());
    }
 
    @Override
    public String toString(){
        return String.format("nazwa: %s, cena:%.2f, liczba sztuk:, koszt zam�wienia:%.2f \n", towar.dajNazwe(),towar.dajCene(),ile,kosztZamow());
    }
 
}
class Zamowienie  implements Serializable{
    private int liczPozZ;
    private ElemZam[]tab;
 
    public Zamowienie(){
        tab=new ElemZam[100];
        liczPozZ=0;
    }
    public void dodaj(ElemZam el){
        tab[liczPozZ] = el;
        liczPozZ++;
    }
 
    public float kosztCalegoZamow(){
        float suma=0;
        for(int i=0; i<liczPozZ; i++){
            suma+=tab[i].kosztZamow();
        }
 
 
        return suma;
    }
 
    public void odcz(){
        System.out.format("Koszt ca�ego zam�wienia wynosi %.2f z�, a na jego poszeg�lne cz�ci sk�ada si�:\n", kosztCalegoZamow());
        for(int i=0; i<liczPozZ; i++){
            tab[i].odcz();
        }
    }
 
 
}
 
public class Main {
 
    // Zapisuje dok�adnie jeden obiekt do pliku
    public static void zapis(String nazwaPl, Zamowienie z)throws IOException{
        ObjectOutputStream pl=null;
        try{
            pl=new ObjectOutputStream(new FileOutputStream(nazwaPl));
            pl.writeObject(z);
            pl.flush();
        }
        finally{
            if(pl!=null)
                pl.close();
        }
    }
 
    // Odczytuje dok�adnie jeden obiekt z pliku i wy�wietla o nim informacj�
    public static void odczyt(String nazwaPl)throws IOException,ClassNotFoundException{
        ObjectInputStream pl2=null;
        Zamowienie z = null;
        try{
            pl2=new ObjectInputStream(new FileInputStream(nazwaPl));
            z=(Zamowienie)pl2.readObject();
 
            z.odcz();
 
        } catch (EOFException ex) {
            System.out.println("Koniec pliku");
        }
 
        finally{
            if(pl2!=null)
                pl2.close();
        }
 
 
    }
 
   // Odczytuje wiele obiekt�w z pliku (wszystkie) i wy�wietla o nim informacj�
    public static void odczytCalego(String nazwaPl)throws IOException,ClassNotFoundException{
        ObjectInputStream pl2=null;
        Zamowienie z = null;
        try{
            pl2=new ObjectInputStream(new FileInputStream(nazwaPl));
            int l=1;
            while(true){
                z=(Zamowienie)pl2.readObject();
                System.out.println("\nZam�wienie " + l++);
                z.odcz();
            }
 
        } catch (EOFException ex) {
            System.out.println("Koniec pliku");
        }
 
        finally{
            if(pl2!=null)
                pl2.close();
        }
 
 
    }
 
    // Dopisywanie do pliku
    public static void dopisanie(String nazwaPl, Zamowienie z)throws IOException, ClassNotFoundException{
        // Najwpierw odczytujemy z plkiu to, co by�o tam wcze�niej
        Zamowienie[] tab = new Zamowienie[100]; // do tablicy
        ObjectInputStream pl2=null;
        try{
            pl2=new ObjectInputStream(new FileInputStream(nazwaPl));
            int l=0;
            while(true)
                tab[l++]=(Zamowienie)pl2.readObject();
 
        } catch (EOFException ex) {
            // Program przeskakuje w to miejsce, kiedy dojdzie do ko�ca pliku,
            // czyli kiedy wszystko ju� odczyta.
            // Teraz zamykamy plik, otwieramy w trybie zapisu i wpisujemy
            // do niego wszystko oraz dopisujemy to, co ma by� dodane
            if(pl2!=null)
                pl2.close();
 
            ObjectOutputStream pl=null;
            try{
                pl=new ObjectOutputStream(new FileOutputStream(nazwaPl));
                // Wpisujemy do pliku to, co w nim ju� by�o
                for(int i=0; tab[i]!=null; i++)
                    pl.writeObject(tab[i]);
 
                // i dopisujemy nowy obiekt
                pl.writeObject(z);
                pl.flush();
            }
            finally{
                if(pl!=null)
                    pl.close();
            }
        }
    }
 
    public static void main(String[] args)throws IOException,ClassNotFoundException {
        Towar T=new Towar("mleko",2.29f);
        Towar T2=new Towar();
        Towar T3= new Towar("proszek do pieczenia",0.50f);
        Towar T4= new Towar("jajko", 0.20f);
        T.zmiencene(2.15f);
        T4.zmiencene(0.25f);
        T3.zmiencene(T3.dajCene()*1.1f); // podniesienie ceny o 10%
        T.zmiennazwe("kakao");
        T3.dajNazwe();
        T.odcz();
        T3.odcz();
 
        ElemZam el = new ElemZam(T, 10);
        ElemZam el2 = new ElemZam(T2);
        ElemZam el3= new ElemZam(T3,2);
        el.odcz();
        el2.odcz();
        el.kosztZamow();
        el3.kosztZamow();
 
        Zamowienie z = new Zamowienie();
        z.dodaj(el);
        z.dodaj(el2);
        z.dodaj(el3);
 
        System.out.println(z.kosztCalegoZamow());
 
        System.out.println("\n\n************ ZAPIS DO PLIKU");
        zapis("plik.dat", z);
 
        System.out.println("\n\n************ ODCZYT Z PLIKU");
        odczyt("plik.dat");
 
        System.out.println("\n\n************ DOPISYWANIE DO PLIKU");
        zapis("plik2.dat", z);
 
        Zamowienie z2 = new Zamowienie();
        z2.dodaj(el);
        z2.dodaj(el);
        z2.dodaj(el3);
        z2.dodaj(el3);
 
        dopisanie("plik2.dat", z2);
 
        Zamowienie z3 = new Zamowienie();
        z3.dodaj(el3);
        z3.dodaj(el3);
        z3.dodaj(el);
        z3.dodaj(el3);
 
        dopisanie("plik2.dat", z3);
 
        System.out.println("\n\n************ ODCZYT Z PLIKU KILKU OBIEKT�W");
        odczytCalego("plik2.dat");
    }
}


