package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.UserDao;
import web.models.Car;

import java.util.List;

@Component
public class UserServiceImp implements UserService {
    private UserDao carDao;

    @Autowired
    public UserServiceImp(UserDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> listCars() {
        return carDao.listCars();
    }

    @Override
    public List<Car> getListOfCars(int count) {
        if (count > -1 && count < 5) {
            return carDao.listCars().subList(0, count);
        }

        return carDao.listCars();
    }


}
