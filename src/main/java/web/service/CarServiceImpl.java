package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    private static int CARS_COUNT;
    private static List<Car> listCars = new ArrayList<>();

    static {
        listCars.add(new Car(++CARS_COUNT, "Model1", 111));
        listCars.add(new Car(++CARS_COUNT, "Model2", 222));
        listCars.add(new Car(++CARS_COUNT, "Model3", 333));
        listCars.add(new Car(++CARS_COUNT, "Model4", 444));
        listCars.add(new Car(++CARS_COUNT, "Model5", 555));
    }

    public List<Car> CountCars(int count) {
        return listCars.stream().limit(count > 0 & count < 6 ? count : 5).toList();
    }
}