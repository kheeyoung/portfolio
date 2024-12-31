package com.portfolio.portfolio.resume;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResumeDTO {

    public ResumeDTO(String title, String txt) {
        this.title = title;
        this.txt = txt;
    }

    String title;
    String txt;

}
