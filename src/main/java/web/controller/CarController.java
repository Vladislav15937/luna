package web.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import web.DAO.CarDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CarController {

    private final CarDAO carDAO;

    public CarController(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @GetMapping(value = "/cars")
    public String getCar (Model model, @RequestParam(value = "count", required = false) Integer id){
        if(id==null){
        model.addAttribute("spisokmashin",carDAO.getSpisok());
        } else {
            int gg = id;
            model.addAttribute("car",carDAO.odnaMashina(gg));
        }
return "/cars";
    }

}
