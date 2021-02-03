package treeNode;

public class Tree {
    private Node root;

    public Node findKey(String key) {
        Node current = root;
        while (!current.getName().equals(key)) {
            if (key.compareTo(current.getName()) < 0) {
                current = current.getLeftChild();
            } else {
                current = current.getRightChild();
            }
            if (current == null) {
                return null;
            }
        }
        return current;
    }

    public void insert(Node node) {
        Node newNode = new Node(node.getName(), node.getLastName());
        if (root == null) {
            root = newNode;
        } else {
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if (node.getName().compareTo(current.getName()) < 0) {
                    current = current.getLeftChild();
                    if (current == null) {
                        parent.setLeftChild(newNode);
                        return;
                    }
                } else {
                    current = current.getRightChild();
                    if (current == null) {
                        parent.setRightChild(newNode);
                        return;
                    }
                }
            }
        }
    }

    public void delete(String key) {

    }
}
