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

    public List<Car> getCarsQuantity(int count) {
        return carDao.listCars().subList(0, count);
    }


}
