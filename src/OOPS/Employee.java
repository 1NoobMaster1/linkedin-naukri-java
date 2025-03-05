package OOPS;

public class Employee {

    private String firstName;
    private String lastName;

    Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName() {
        this.lastName = lastName;
    }

    public String toString() {
        return(this.firstName + " : " + this.lastName);
    }

}

class ConstructorClass {
    public static void main(String[] args) {
        Employee e = new Employee("Ayan", "Khan");
        System.out.println(e.toString());
    }
}
