package link;

public class Link {
    private String login;
    private String password;
    public Link next;

    public Link(String login, String password) {
        this.login = login;
        this.password = password;
    }

    @Override
    public String toString() {
        return "link" +
                "login='" + login + '\'' +
                ", password='" + password + "\n";
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Link getNext() {
        return next;
    }

    public void setNext(Link next) {
        this.next = next;
    }
}
