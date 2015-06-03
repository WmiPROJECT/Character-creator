package save_read;
import java.io.*;
 
public class ManyObjects
{
    public static void main(String[] args)
    {
        boolean pisz=true;
        if(args.length>0)
        {
            pisz=false;
        }
        new ManyObjects(pisz);
    }
    //------------------------
    public ManyObjects(boolean pisz)
    {
        if(pisz)
        {
            String plik="Persons.dat";
            try
            {
                FileOutputStream f=new FileOutputStream(plik,true);
                ObjectOutputStream str=new ObjectOutputStream(f);
                str.writeObject(new Person("Kowalski",33));
                str.writeObject(new Person("Nowak",44));
                str.flush();
                f.close();
            }
            catch(IOException e)
            {
                System.out.println(e);
            }
        }
        else
        {
            String plik="Persons.dat";
            try
            {
                FileInputStream f=new FileInputStream(plik);
                ObjectInputStream str=new ObjectInputStream(f);
                boolean przeczytane=false;
                while(!przeczytane)
                {
                    Person p=(Person)str.readObject();
                    if(p==null)
                    {
                        przeczytane=true;
                    }
                    else
                    {
                        System.out.println(p.getName());
                    }
                }
                f.close();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
//------------------------------------------------
class Person implements Serializable
{
    private String name;
    private int wiek;
    //-----------------------
    Person(String name,int wiek)
    {
        this.name=name;
        this.wiek=wiek;
    }
    //------------------------
    public String getName()
    {
        return name;
    }