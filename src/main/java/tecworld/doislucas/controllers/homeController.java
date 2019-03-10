package tecworld.doislucas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@Controller
public class homeController {

    @RequestMapping("/")
    public String index(Model model) { return "index"; }

}
