import java.util.Scanner;
import java.io.IOException;

interface Myfactorial extends Runnable {
    void run();
}

class Myfact implements Myfactorial {
    final long n;
    public Myfact(long n){
        this.n = n;
    }
    @Override
    public void run() throws IllegalArgumentException {
        if(n<0){
            throw new  IllegalArgumentException("Factorial is not possible for Negative Number.");
        }
        else{
            long factorial = 1;
             for(int i=1; i<=n ; i++){
                 factorial = factorial * i;
             }
             System.out.println("Factorial of a Given Number is: " + factorial);
        }
    }
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        try{
             System.out.print("Enter a non-negative integer to calculate its factorial: ");
            int num = Integer.parseInt(scanner.nextLine());
            
            Myfact myobj = new Myfact(num);
            myobj.run();
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid non-negative integer.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}
