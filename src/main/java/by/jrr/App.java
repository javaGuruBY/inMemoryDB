package by.jrr;

import by.jrr.bean.Book;
import by.jrr.bean.Car;
import by.jrr.bean.Person;
import by.jrr.bean.Plane;
import by.jrr.storage.InMemoryDB;

import static by.jrr.storage.InMemoryDB.save;

public class App {
    public static void main(String[] args) {
        Book book = new Book();
        book.setId("one");
        book.setName("myBook");

        save(book);

        Car car = new Car();
        car.setId("one");
        car.setModel("myCar");

        save(car);

        Plane plane = new Plane();
        plane.setCity("Vancuver");
        plane.setId("Third");

        save(plane);

        save(new Person());

        System.out.println(InMemoryDB.bookRepository.findAll());
        System.out.println(InMemoryDB.carRepository.findAll());
        System.out.println(InMemoryDB.planeRepository.findAll());
    }
}
