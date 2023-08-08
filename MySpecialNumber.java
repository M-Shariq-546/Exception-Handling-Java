interface Runnable {
    void myfun();
}
//child class of exception
class MySpecialNumberException extends Exception {
    public MySpecialNumberException(String msg) {
        super(msg);
    }
}
//class to use the parameterized constructor 
class MySpecialNumber implements Runnable {
    private int x = 4; // You can initialize this with some value
    private int y[];

    MySpecialNumber(int[] y) {
        this.y = y;
    }

    public void myfun() {
        
        //Exception Handling on the base of number comes which is divisible by 10
        try {
            for (int i : y) {
                int vary = x++;
                if (vary % 10 == 0) {
                    throw new MySpecialNumberException("Special Number "+vary +" Appeared here.");
                }
                else{
                    System.out.println("Number : " + vary);
                }
            }
        } catch (MySpecialNumberException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

}
//Driver Class
public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        MySpecialNumber specialNumber = new MySpecialNumber(numbers);
        specialNumber.myfun();
    }
}
