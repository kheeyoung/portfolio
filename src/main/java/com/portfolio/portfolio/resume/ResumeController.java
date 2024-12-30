package com.portfolio.portfolio.resume;

import com.portfolio.portfolio.PublicMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@Controller
public class ResumeController {
    PublicMethod pm = new PublicMethod();
    @GetMapping("/resume") // URL 매핑
    public String showResumePage(Model model) {
        String nextPage = "resume";
        model.addAttribute("now", pm.getNowTime());
        return nextPage;
    }
}
