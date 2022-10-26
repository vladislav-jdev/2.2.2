package web.service;

import web.dao.DaoCar;
import web.dao.DaoCarImpl;
import web.model.Car;
import java.util.List;

public class CarServiceImpl implements CarService{
    private final DaoCar daoCar = new DaoCarImpl();
    @Override
    public List<Car> getCars(int amount) {
        return daoCar.getCarList(amount);
    }
}
