// Created Interface of Runnable
interface Runnable {
    void myfun() throws MySpecialNumberException;
}

// Child class of exception
class MySpecialNumberException extends Exception {
    public MySpecialNumberException(String msg) {
        super(msg);
    }
}

// Class to use the parameterized constructor
class MySpecialNumber implements Runnable {
    private int x = 4; // You can initialize this with some value
    private int y[];

    MySpecialNumber(int[] y) {
        this.y = y;
    }

    public void myfun() throws MySpecialNumberException {

        // Exception Handling on the base of number comes which is divisible by 10, 20, 30, etc.
      try {
          //foreeach loop
            for (int i : y) {
                int vary = x++;
                if (vary % 10 == 0 || vary % 20 == 0) {
                    throw new MySpecialNumberException("Special Number Appeared here: " + vary + "\n");
                } else {
                    System.out.println("Number : " + vary);
                }
            }
        } catch (MySpecialNumberException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
            x = 11; // Reset x to 11
            for (int i = x; i < y.length; i++) {
                int vary = x++;
                System.out.println("Number : " + vary);
            }
        }
    }
}

// Driver Class
public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[20];
        for (int i = 0; i < 20; i++) {
            numbers[i] = i + 1;
        }

        MySpecialNumber specialNumber = new MySpecialNumber(numbers);

        try {
            specialNumber.myfun();
        } catch (MySpecialNumberException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
