package com.portfolio.portfolio.project;

import com.portfolio.portfolio.PublicMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class ProjectController {
    PublicMethod pm = new PublicMethod();
    @GetMapping("/project") // URL 매핑
    public String showResumePage(Model model) {
        String nextPage = "project";
        model.addAttribute("now", pm.getNowTime());
        return nextPage;
    }
}
