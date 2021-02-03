package person;

public class PersonDataArray {
    private Person[] people;
    private int elements;

    public PersonDataArray(int max) {
        people = new Person[max];
        elements = 0;
    }

    public Person find(String searchName) {
        int j;
        for (j = 0; j < elements; j++) {
            if (people[j].getLastName().equals(searchName))
                break;
        }
        if (j == elements) {
            return null;
        } else {
            return people[j];
        }
    }

    public void insert(String first, String last, int age) {
        people[elements] = new Person(first, last, age);
        elements++;
    }

    public void delete(String searchName) {
        int j;
        for (j = 0; j < elements; j++) {
            if (people[j].getLastName().equals(searchName)) {
                break;
            }
        }
        if (j == elements) {
        } else {
            for (int i = j; i < elements; i++) {
                people[i] = people[i + 1];
            }
            elements--;
        }
    }

    public void displayPeople() {
        for (int i = 0; i < elements; i++) {
            people[i].displayPerson();
        }
    }
}
