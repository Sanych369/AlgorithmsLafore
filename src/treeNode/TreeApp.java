package treeNode;

public class TreeApp {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Node node1 = new Node("Node1", "LastNode1");
        Node node2 = new Node("Node2", "LastNode2");
        Node node3 = new Node("Node3", "LastNode3");
        Node node4 = new Node("Node4", "LastNode4");
        Node node5 = new Node("Avc", "Bca");
        Node node6 = new Node("Bat", "Moise");
        tree.insert(node2);
        tree.insert(node1);
        tree.insert(node3);
        tree.insert(node6);
        tree.insert(node4);
        tree.insert(node5);
        tree.insert(new Node("Param", "PamPam"));
        System.out.println(tree.findKey("Bat"));
    }
}
