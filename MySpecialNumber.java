interface Runnable {
    void myfun();
}

class MySpecialNumberException extends Exception {
    public MySpecialNumberException(String msg) {
        super(msg);
    }
}

class MySpecialNumber implements Runnable {
    private static final int x = 0; // You can initialize this with some value
    private int y[];

    MySpecialNumber(int[] y) {
        this.y = y;
    }

    public void myfun() {
        try {
            for (int i : y) {
                x = x + 1;
                System.out.println("Number : " + x);
                if (x % 10 == 0) {
                    throw new MySpecialNumberException("Special Number Appeared here.\n");
                }
            }
        } catch (MySpecialNumberException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        MySpecialNumber specialNumber = new MySpecialNumber(numbers);
        specialNumber.myfun();
    }
}
