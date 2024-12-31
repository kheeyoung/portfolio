package com.portfolio.portfolio.resume;

import com.portfolio.portfolio.DB;
import com.portfolio.portfolio.PublicMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutionException;

@Controller
public class ResumeController {

    private final ResumeService rs;
    private final PublicMethod pm;

    // 생성자 주입
    public ResumeController(PublicMethod pm, ResumeService rs) {
        this.pm = pm;
        this.rs= rs;
    }
    @GetMapping("/resume") // URL 매핑
    public String showResumePage(Model model) throws ExecutionException, InterruptedException {
        String nextPage = "resume";

        model.addAttribute("headerImg", pm.getHeaderImg());
        model.addAttribute("introduction", rs.getIntro());
        return nextPage;
    }
}
