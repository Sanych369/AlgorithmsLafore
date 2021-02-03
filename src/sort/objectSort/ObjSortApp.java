package sort.objectSort;

import java.util.Arrays;

public class ObjSortApp {
    public static void main(String[] args) {
        Person[] people = new Person[5];
        InsertObjSort insertObjSort = new InsertObjSort();
        people[0] = new Person("Zero", "ZeroLast", 20);
        people[1] = new Person("One", "OneLast", 55);
        people[2] = new Person("Three", "TreeLast", 36);
        people[3] = new Person("Four", "FourLast", 49);
        people[4] = new Person("Five", "FiveLast", 60);

        System.out.println(Arrays.toString(people));
        insertObjSort.objSortAge(people);
        System.out.println(Arrays.toString(people));
//        insertObjSort.objSortFirstName(people);
        insertObjSort.objSortLastName(people);
        System.out.println(Arrays.toString(people));
    }
}
