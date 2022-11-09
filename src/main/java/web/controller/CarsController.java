package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.DAO.CarDAO;

@Controller
public class CarsController {
    private CarDAO carDAO;

    public CarsController(CarDAO carDAO) {
        this.carDAO = carDAO;
    }
    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(defaultValue = "5", value = "count", required = false)int count, Model model){
    model.addAttribute("cars", carDAO.getCarList(count));
    return "cars";
    }
}
