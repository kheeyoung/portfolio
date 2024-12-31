package com.portfolio.portfolio.contact;

import com.portfolio.portfolio.PublicMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ContactController {
    private final PublicMethod pm;

    // 생성자 주입
    public ContactController(PublicMethod pm) {
        this.pm = pm;
    }


    @GetMapping("/contact") // URL 매핑
    public String showContactPage(Model model) {
        String nextPage = "contact";
        model.addAttribute("headerImg", pm.getHeaderImg());
        return nextPage;
    }
}
