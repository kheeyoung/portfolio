package com.portfolio.portfolio.project;

import com.portfolio.portfolio.PublicMethod;
import com.portfolio.portfolio.resume.ResumeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.concurrent.ExecutionException;

@Controller
public class ProjectController {
    private final PublicMethod pm;
    private final ProjectService ps;

    // 생성자 주입
    public ProjectController(PublicMethod pm, ProjectService ps) {
        this.pm = pm;
        this.ps=ps;
    }

    @GetMapping("/project") // URL 매핑
    public String showProjectPage(Model model) throws ExecutionException, InterruptedException {
        String nextPage = "project";
        model.addAttribute("headerImg", pm.getHeaderImg());
        model.addAttribute("profileImg", pm.getProfileImg());
        model.addAttribute("Web", ps.getWeb());
        return nextPage;
    }
}
