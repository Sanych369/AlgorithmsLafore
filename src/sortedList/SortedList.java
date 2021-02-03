package sortedList;

public class SortedList {
    private Link first;

    public SortedList() {
        this.first = null;
    }

    public void insert(Link link) {
        Link newLink = new Link(link.getLogin(), link.getPassword());
        Link previous = null;
        Link current = this.first;

        while (current != null && link.getLogin().compareTo(current.getLogin()) > 0) {
            previous = current;
            current = current.getNext();
        }
        if (previous == null) {
            first = newLink;
        } else {
            previous.setNext(newLink);
        }
        newLink.setNext(current);
    }

    public Link removeFirst() {
        Link temp = first;
        first = first.getNext();
        return temp;
    }

    public void displayList() {
        System.out.println("List");
        Link current = first;
        while (current != null) {
            System.out.println(current.toString());
            current = current.getNext();
        }
        System.out.println();
    }

    public Link getFirst() {
        return first;
    }

    public void setFirst(Link first) {
        this.first = first;
    }
}
