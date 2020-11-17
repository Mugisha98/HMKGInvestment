package hmkg.investment.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class TradingHoursController {

    @GetMapping("/trading-hours")
    public String tradingHours(){

        return "/trading_hours.html";
    }
}
