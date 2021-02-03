package orderedArray;

public class OrdArrayApp {
    public static void main(String[] args) {
        int maxSize = 100;
        OrdArray array = new OrdArray(maxSize);

        for (int i = 0; i < 15; i++) {
            array.insert((long) (Math.random() * 60));
        }
        array.display();
        System.out.println(array.size());

        int searchKey = 55;

        if (array.find(searchKey) != array.size()) {
            System.out.println("Found key " + searchKey);
        } else {
            System.out.println("Can't find " + searchKey);
        }

        array.delete(0);
        array.delete(20);
        array.delete(55);

        array.display();
        long maxValue = new OrdArray(10).getMax();

        System.out.println("Max value = " + maxValue);
    }
}
