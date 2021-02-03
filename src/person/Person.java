package person;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void displayPerson() {
        System.out.println("FirstName = " + firstName);
        System.out.println("LastName = " + lastName);
        System.out.println("Age = " + age);
        System.out.println();
    }

    public String getLastName() {
        return lastName;
    }
}
