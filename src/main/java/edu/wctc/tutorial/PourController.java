package edu.wctc.tutorial;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class PourController {
    @RequestMapping("/pour")
    public String showPour() {
        return "pages/pour";
    }
}
