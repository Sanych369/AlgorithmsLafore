package link;

public class LinkApp {
    public static void main(String[] args) {
        Link link = new Link("Log", "Pass");
        Link link1 = new Link("log1", "pass1");
        Link link2 = new Link("log20", "pass2");
        Link link3 = new Link("log3", "pass3");
        LinkList linkList = new LinkList();
        linkList.insertFirst(link);
        linkList.insertFirst(link1);
        linkList.insertFirst(link2);
        linkList.insertFirst(link3);
        linkList.display();
        linkList.deleteFirst();
        linkList.display();

    }
}
