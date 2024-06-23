public class Employee {
    private String name;
    private String email = "не заждан";
    private int number;

    public Employee(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Employee(String name, String email, int number) {
        this.name = name;
        this.email = email;
        this.number = number;
    }

    public void printInfoEmpl(){

        System.out.println("Name: " + name );
        System.out.println("Email " + email);
        System.out.println("nomer " + ((number > 0) ? number : "незадан") + "\n");
    }
}
