package hmkg.investment.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class AnalysisController {

    @GetMapping("/analysis")
    public String getAnalysis()
    {
        return"/analysis.html";
    }
}
