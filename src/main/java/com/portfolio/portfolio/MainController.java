package com.portfolio.portfolio;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@Controller
public class MainController {
    private final PublicMethod pm;

    // 생성자 주입
    public MainController(PublicMethod pm) {
        this.pm = pm;
    }

    @GetMapping("/main") // URL 매핑
    public String showMainPage(Model model) {
        String nextPage = "main_page";
        model.addAttribute("headerImg", pm.getHeaderImg());
        model.addAttribute("profileImg", pm.getProfileImg());
        return nextPage;
    }



}