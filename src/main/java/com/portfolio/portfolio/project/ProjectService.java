package com.portfolio.portfolio.project;

import com.portfolio.portfolio.DB;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.ExecutionException;

@Service
public class ProjectService {
    DB db = new DB();

    List<ProjectDTO> getWeb() throws ExecutionException, InterruptedException {
        return db.getWebProject();
    }

    List<ProjectDTO> getApp() throws ExecutionException, InterruptedException {
        return db.getAppProject();
    }

    List<ProjectDTO> getEtc() throws ExecutionException, InterruptedException {
        return db.getEtcProject();
    }
}
