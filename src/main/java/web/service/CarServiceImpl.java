package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> cars;

    public CarServiceImpl() {
        cars = new ArrayList<>();
        cars.add(new Car("Audi","A5","Grey"));
        cars.add(new Car("BMW","Z4","Blue"));
        cars.add(new Car("Ford","Focus","Black"));
        cars.add(new Car("Skoda","Octavia","White"));
        cars.add(new Car("Mazda","MX-5","Grey"));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count >= cars.size()) {
            return new ArrayList<>(cars);
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }

    @Override
    public List<Car> getCars() {
        return cars;
    }
}
