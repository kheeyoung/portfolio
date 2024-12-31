package com.portfolio.portfolio;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.*;
import com.google.firebase.cloud.FirestoreClient;
import com.portfolio.portfolio.resume.ResumeDTO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

@Component
public class DB {


    //자기소개서 가져오기
    public ArrayList<ResumeDTO> getIntroduction() throws ExecutionException, InterruptedException {
        ArrayList<ResumeDTO> result = new ArrayList<>();

        List<QueryDocumentSnapshot> documents = FirestoreClient.getFirestore().collection("introduction").get().get().getDocuments();
        
        for (QueryDocumentSnapshot document : documents) {
            ResumeDTO sd = new ResumeDTO(document.get("title").toString(), document.get("txt").toString());
            result.add(sd);
        }
        return result;

    }

    //프로필 이미지 가져오기
    public String getProfileImg() throws ExecutionException, InterruptedException {

        return FirestoreClient.getFirestore().collection("image").document("profile").get().get().getData().get("url").toString();
    }

    //헤더 이미지 가져오기
    public String getHeaderImg() throws ExecutionException, InterruptedException {
        return FirestoreClient.getFirestore().collection("image").document("header").get().get().getData().get("url").toString();

    }
}
