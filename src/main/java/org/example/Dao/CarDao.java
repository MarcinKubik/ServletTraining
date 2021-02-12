package org.example.Dao;

import org.example.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDao {

    public List<Car> getCars(){


        Car car1 = new Car("Volkswagen", "Caddy");
        Car car2 = new Car("Audi", "A4");
        Car car3 = new Car("Skoda", "Fabia");

        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        return cars;
    }


}
