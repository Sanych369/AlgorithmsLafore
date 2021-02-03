package duplicatesSearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Dupl {
    public static void main(String[] args) {
        String str = "ПпППприввввет СсССссбееееррр";
        System.out.println(str.charAt(13));
        System.out.println(str.charAt(14));
        System.out.println(str.charAt(14) - str.charAt(13));
        System.out.println(str.charAt(1) - str.charAt(0));
        System.out.println(Dupl.compress(str));
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        System.out.println(arrayList.size());
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        System.out.println(linkedList.size());
        System.out.println(Arrays.toString(arrayList.toArray()));
        System.out.println(Arrays.toString(linkedList.toArray()));
    }

    static String compress(String str) {
        StringBuilder compressed = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                compressed.append(str.charAt(i));
            }
        }

        return compressed.length() < str.length() ? compressed.toString() : str;
    }

}
