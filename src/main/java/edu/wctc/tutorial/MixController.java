package edu.wctc.tutorial;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class MixController {
    @RequestMapping("/mix")
    public String showMix() {
        return "pages/mix";
    }
}
