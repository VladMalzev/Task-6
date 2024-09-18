package web.service;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService{
    public List<Car> cars;

    public CarServiceImpl(){
        cars=new ArrayList<>();
        cars.add(new Car("BMW","porple", 5));
        cars.add(new Car("Bugati","green", 9));
        cars.add(new Car("Lada","red", 2019));
        cars.add(new Car("Dodge","orenge", 2001));
        cars.add(new Car("Opel","white", 2012));
    }

    @Override
    public List<Car> getCars(Integer count){
if(count==null || count >= cars.size() || count <0){
    return cars;
}
        return cars.subList(0,count);
    }
}
