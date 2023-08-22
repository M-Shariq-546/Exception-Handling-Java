class myException extends Exception{
    public myException(String msg) {
        super(msg);
    }
}

class Person {
    private int autoId;
    private String username;
    private String password;
    private String gender;

    public Person(int autoId, String username, String password, String gender) {
        this.autoId = autoId;
        this.username = username;
        this.password = password;
        this.gender = gender;
    }

    public String getUsername() {
        return username;
    }
}

class Main {
    public static void main(String[] args) {
        try {
            // Getting the instance of the class
            Person person = null;
            if (person == null) {
                person = new Person(1, "Shariq", "password123", "Male");
            } else {
                 throw new myException("Object is already created. ");
            }

            // Displaying the object value
            System.out.println("Object Value: " + person);

            // Displaying the username
            System.out.println("\nUsername: " + person.getUsername());
        } catch (myException e) {
            System.out.println("Exception : " + e.getMessage());
        }
    }
}
