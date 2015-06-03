package rozw11;

public class TestThreads {

    public static void main(String[] args) {

            Object semafor = new Object();

            for (int i = 1; i<=5; i++) {
                    new WritingThread(i, semafor).start();
            }
            
            System.out.println("Koniec programu");
            
    }

}