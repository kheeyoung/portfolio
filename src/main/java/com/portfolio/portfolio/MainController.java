package com.portfolio.portfolio;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@Controller
public class MainController {
    PublicMethod pm = new PublicMethod();
    @GetMapping("/main") // URL 매핑
    public String showMainPage(Model model) {
        String nextPage = "main_page";
        model.addAttribute("now", pm.getNowTime());
        return nextPage;
    }



}