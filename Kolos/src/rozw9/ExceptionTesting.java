package rozw9;

import java.util.Scanner;


public class ExceptionTesting extends SomeClass{
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                
                System.out.println(a/b);
                System.out.println("Koniec bloku chronionego");
                
        } catch (Throwable e) {
              e.printStackTrace();
       } finally {
                System.out.println("finally");
        }
        
        
        scanner.close();
        
        System.out.println("Koniec programu");
}
}
