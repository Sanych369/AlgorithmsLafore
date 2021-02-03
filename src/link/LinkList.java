package link;

public class LinkList {
    private Link first;

    public LinkList() {
        first = null;
    }

    public Link getFirst() {
        return first;
    }

    public void setFirst(Link first) {
        this.first = first;
    }

    public void insertFirst(Link link) {
        Link newLink = new Link(link.getLogin(), link.getPassword());
        newLink.next = first;
        first = newLink;
    }

    public Link deleteFirst() {
        Link temp = first;
        first = first.getNext();
        return temp;
    }

    public void display() {
        System.out.println("List");
        Link current = first;
        while (current != null) {
            System.out.println(current.toString());
            current = current.getNext();
        }
        System.out.println();
    }
}
