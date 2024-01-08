package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoImp implements UserDao {
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("Volvo", "S80", "white"));
        cars.add(new Car("Audi", "A4", "green"));
        cars.add(new Car("BMW", "7", "black"));
        cars.add(new Car("Mercedes", "S-class", "blue"));
        cars.add(new Car("Honda", "Accord", "red"));
    }

    @Override
    public List<Car> listCars() {
        return cars;
    }

}
