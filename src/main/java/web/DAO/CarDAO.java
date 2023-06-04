package web.DAO;

import models.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarDAO {

    private List<Car> spisok;
    {
        spisok = new ArrayList<>();
        spisok.add(new Car("Audi", 1,1));
        spisok.add(new Car("Mercedes", 2,2));
        spisok.add(new Car("Honda",3,3));
        spisok.add(new Car("Tesla",4,4));
        spisok.add(new Car("Toyota", 5,5));
    }
    public List<Car> vseMashini(){
        return spisok;
    }
    public List<Car> odnaMashina(int id){
        if (id==1){
            return spisok.subList(0,1);
        } if (id==2){
            return spisok.subList(0,2);
        } if (id==3){
            return spisok.subList(0,3);
        } if(id==4){
            return spisok.subList(0,4);
        } if (id >= 5) {
            return spisok.subList(0,5);
        } else {
            return null;
        }
    }
    public List<Car> getSpisok() {
        return spisok;
    }

    public void setSpisok(List<Car> spisok) {
        this.spisok = spisok;
    }

}
