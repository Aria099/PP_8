package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;


@Controller
@RequestMapping("/cars")
public class CarController {

    private final CarServiceImpl carServiceImpl;

    @Autowired
    public CarController(CarServiceImpl carServiceImpl) {
        this.carServiceImpl = carServiceImpl;
    }

    @GetMapping
    public String CountCars(@RequestParam(value = "count", defaultValue = "5") Integer count, Model model) {
        model.addAttribute("cars", carServiceImpl.CountCars(count));
        return "cars";
    }
}
