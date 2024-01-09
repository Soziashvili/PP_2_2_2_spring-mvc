package web.service;

import web.models.Car;

import java.util.List;

public interface UserService {

    List<Car> listCars();

    List<Car> getListOfCars(int count);
}
