package rozw11;

public class WritingThread extends Thread {

    private int id;

    private Object semafor;
    
    public WritingThread(int id, Object semafor) {
            super();
            this.id = id;
            this.semafor = semafor;
    }

    @Override
    public void run() {
            synchronized(semafor) {
                    for (int i=1; i<=4;i++) {
                            try {
                                    Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                    // TODO Auto-generated catch block
                                    e.printStackTrace();
                            }
                            System.out.println("W¹tek: "+id+", komunikat nr: "+i);
                    }
            }
    }
}

