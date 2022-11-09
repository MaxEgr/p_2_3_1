package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.DAO.CarDAO;
import web.models.Car;

import java.util.List;

@Controller
public class CarsController {
    private CarDAO carDAO;

    public CarsController(CarDAO carDAO) {
        this.carDAO = carDAO;
    }
    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(defaultValue = "5", value = "count", required = false)
                              Integer count, Model model){
        List<Car> carList2;
        if (count == null){
           carList2 = carDAO.getCarList();
        } else if (count < 0) {
            carList2 = carDAO.getCarList();
        } else {
            carList2 = carDAO.getCarList(count);
        }
        model.addAttribute("cars", carList2);
    return "cars";
    }
}
