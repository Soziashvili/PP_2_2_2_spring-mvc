package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.UserServiceImp;

@Controller
@RequestMapping("/cars")
public class CarsController {
    private UserServiceImp userServiceImp;

    @Autowired
    public CarsController(UserServiceImp userServiceImp) {
        this.userServiceImp = userServiceImp;
    }

    @GetMapping()
    public String getCars(@RequestParam(name = "count", defaultValue = "5") int count, Model model) {
        if (count > -1 && count < 5) {
            model.addAttribute("cars", userServiceImp.getCarsQuantity(count));
        } else {
            model.addAttribute("cars", userServiceImp.listCars());
        }

        return "cars/cars";
    }
}
