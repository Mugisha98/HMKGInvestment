package hmkg.investment.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class AboutUsController {

    @GetMapping("/about-Us")
    public String aboutUs(){

        return "/about_us.html";
    }
}
