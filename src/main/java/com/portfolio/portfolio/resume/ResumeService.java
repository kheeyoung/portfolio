package com.portfolio.portfolio.resume;

import com.portfolio.portfolio.DB;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.ExecutionException;

@Service
public class ResumeService {

    DB db = new DB();

    public List<ResumeDTO> getIntro() throws ExecutionException, InterruptedException {
        return db.getIntroduction();
    }


}
