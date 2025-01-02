package com.portfolio.portfolio.project;

import com.portfolio.portfolio.PublicMethod;
import com.portfolio.portfolio.resume.ResumeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjectController {
    private final PublicMethod pm;

    // 생성자 주입
    public ProjectController(PublicMethod pm) {
        this.pm = pm;
    }

    @GetMapping("/project") // URL 매핑
    public String showProjectPage(Model model) {
        String nextPage = "project";
        model.addAttribute("headerImg", pm.getHeaderImg());
        model.addAttribute("profileImg", pm.getProfileImg());
        return nextPage;
    }
}
