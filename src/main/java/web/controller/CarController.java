package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;

@Controller
public class CarController {
    public CarService carService = new CarServiceImpl();

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "amount", defaultValue = "5") int amount, ModelMap model) {
        model.addAttribute("list", carService.getCars(amount));
        return "cars";
    }
}
