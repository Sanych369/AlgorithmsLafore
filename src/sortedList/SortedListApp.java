package sortedList;

public class SortedListApp {
    public static void main(String[] args) {
        Link link = new Link("log40", "Pass");
        Link link1 = new Link("log10", "pass1");
        Link link2 = new Link("log20", "pass2");
        Link link3 = new Link("log35", "pass3");
        SortedList sortedList = new SortedList();
        sortedList.insert(link);
        sortedList.insert(link1);
        sortedList.insert(link2);
        sortedList.insert(link3);
        System.out.println(sortedList.getFirst().toString());
        sortedList.displayList();
        sortedList.removeFirst();
        sortedList.displayList();
    }
}
