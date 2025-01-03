package com.portfolio.portfolio.project;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProjectDTO {
    String title;
    String contents;
    String url;

    public ProjectDTO(String title, String contents, String url) {
        this.title = title;
        this.contents = contents;
        this.url = url;
    }



}
