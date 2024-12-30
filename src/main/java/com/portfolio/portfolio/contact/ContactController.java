package com.portfolio.portfolio.contact;

import com.portfolio.portfolio.PublicMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactController {
    PublicMethod pm = new PublicMethod();
    @GetMapping("/contact") // URL 매핑
    public String showResumePage(Model model) {
        String nextPage = "contact";
        model.addAttribute("now", pm.getNowTime());
        return nextPage;
    }
}
