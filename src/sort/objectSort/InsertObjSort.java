package sort.objectSort;

public class InsertObjSort {
    public void objSortAge(Person[] people) {
        int in, out;
        for (out = 1; out < people.length; out++) {
            Person temp = people[out];
            in = out;
            while (in > 0 && people[in - 1].getAge() >= temp.getAge()) {
                people[in] = people[in - 1];
                --in;
            }
            people[in] = temp;
        }
    }

    public void objSortFirstName(Person[] people) {
        int in, out;
        for (out = 1; out < people.length; out++) {
            Person temp = people[out];
            in = out;
            while (in > 0 && people[in - 1].getFirstName().compareTo(temp.getFirstName()) > 0) {
                people[in] = people[in - 1];
                --in;
            }
            people[in] = temp;
        }
    }

    public void objSortLastName(Person[] people) {
        int in, out;
        for (out = 1; out < people.length; out++) {
            Person temp = people[out];
            in = out;
            while (in > 0 && people[in - 1].getLastName().compareTo(temp.getLastName()) < 0) {
                people[in] = people[in - 1];
                --in;
            }
            people[in] = temp;
        }
    }
}
