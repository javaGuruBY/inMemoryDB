package by.jrr.storage;

import by.jrr.bean.*;
import by.jrr.service.RepoSerice;
import by.jrr.service.Repository;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class InMemoryDB {
    private static Map<String, Car> CARS = new HashMap<String, Car>();
    private static Map<String, Book> BOOKS = new TreeMap<String, Book>();
    private static Map<String, Plane> PLANES = new LinkedHashMap<String, Plane>();
    private static Map<String, Person> PERSON = new LinkedHashMap<String, Person>();

    public static RepoSerice<Book> bookRepository = new RepoSerice<Book>(InMemoryDB.BOOKS);
    public static RepoSerice<Car> carRepository = new RepoSerice<Car>(InMemoryDB.CARS);
    public static RepoSerice<Plane> planeRepository = new RepoSerice<Plane>(InMemoryDB.PLANES);
    public static RepoSerice<Person> personRepository = new RepoSerice<Person>(InMemoryDB.PERSON);

    public static void save(Entity t) {
        if (t instanceof Book) {
            bookRepository.save((Book) t);
        }
        if (t instanceof Car) {
            carRepository.save((Car) t);
        }
        if (t instanceof Plane) {
            planeRepository.save((Plane) t);
        }
        if (t instanceof Person) {
            personRepository.save((Person) t);
        }
    }
}
