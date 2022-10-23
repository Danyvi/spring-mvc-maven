package xyz.codeandlearn;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String goHome() {
        System.out.println("We are in HomeController");
        return "index"; // name of the view (we are mapping a view to a request for /home
    }


}
