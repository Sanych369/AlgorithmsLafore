package treeNode;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapping {
    public static void main(String[] args) {
        Node node = new Node("50", "50");
        Node node1 = new Node("50", "60");
        Node node2 = new Node("50", "55");
        Comparator<Node> comparator = new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        };
        TreeMap<Node, String> treeMap = new TreeMap<>(comparator);
        treeMap.put(node, "Node");
        treeMap.put(node1, "Node1");
        treeMap.put(node2, "Node2");

        System.out.println(treeMap.keySet());
        System.out.println(treeMap.values());

    }
}
