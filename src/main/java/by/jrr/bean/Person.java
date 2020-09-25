package by.jrr.bean;

public class Person extends Entity{

    String login;

    public void setName(String name) {
        this.login = login;
    }

    public String getName() {
        return login;
    }

    @Override
    public String toString() {
        return "Person{" +
                "login='" + login + '\'' +
                '}';
    }
}
