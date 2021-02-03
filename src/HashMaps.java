import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap();
        for (int i = 0; i < 10; i++) {
            hm.put(i, i * 10);
        }

        for (Map.Entry<Integer, Integer> m : hm.entrySet()) {
            if (m.getKey() > 5) {
                System.out.print(m.getKey() + " ");
            }
        }
        System.out.println();

        for (Integer n : hm.keySet()) {
            if (n < 5) {
                System.out.println(hm.get(n));
            }
        }

        for (Map.Entry<Integer, Integer> s : hm.entrySet()) {
            if (s.getValue() == 10) {
                System.out.println(s.getKey());
            }
        }

        System.out.println(hm.entrySet());
        System.out.println(hm.keySet());
        System.out.println(hm.values());

        HashMap <String, String> hm2 = new HashMap<>();
        String name = "name";
        String name2 = "name";
        String value = "I";
        String value2 = "II";
        hm2.put(name, value);
        hm2.put(name2, value2);
        System.out.println(hm2.get("name"));
        System.out.println(hm2.keySet());
        System.out.println(hm2.values());

        System.out.println(name.equals(name2));
        System.out.println(value.equals(value2));
    }
}
