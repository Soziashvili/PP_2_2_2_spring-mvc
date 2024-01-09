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
    private UserService userService;

    @Autowired
    public CarsController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public String getCars(@RequestParam(name = "count", defaultValue = "5") int count, Model model) {
        model.addAttribute("cars", userService.getListOfCars(count));
        
        return "cars/cars";
    }
}
