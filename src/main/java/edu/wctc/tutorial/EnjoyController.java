package edu.wctc.tutorial;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class EnjoyController {
    @RequestMapping("/enjoy")
    public String showEnjoy() {
        return "pages/enjoy";
    }
}
