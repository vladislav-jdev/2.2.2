package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class DaoCarImpl implements CarDao {

    @Override
    public List<Car> getCars(int amount) {
        List<Car> list = new ArrayList<>();
        list.add(new Car(10124, "Mercedes", "Sedan"));
        list.add(new Car(11155, "Ford", "Hatchback"));
        list.add(new Car(11123, "Toyota", "Coupe"));
        list.add(new Car(11245, "Volkswagen", "Hatchback"));
        list.add(new Car(12423, "BMW", "Coupe"));
        if (amount == 5){
            return list;
        }
        return list.stream().limit(amount).collect(Collectors.toList());
    }
}
