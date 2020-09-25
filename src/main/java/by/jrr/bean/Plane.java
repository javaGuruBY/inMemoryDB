package by.jrr.bean;

public class Plane extends Entity {

    String city;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "city='" + city + '\'' +
                '}';
    }
}
