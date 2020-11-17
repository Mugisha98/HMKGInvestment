package hmkg.investment.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AboutUsController {

    @GetMapping("/about-Us")
    public String aboutUs(){

        return "/about_us.html";
    }
}
