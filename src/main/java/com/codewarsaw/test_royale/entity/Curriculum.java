package com.codewarsaw.test_royale.entity;

import java.util.ArrayList;
import java.util.List;

public class Curriculum {
    private List<Question> questionsDataStore = new ArrayList<>();
    private static Curriculum instance = null;

    private Curriculum(){}

    public Curriculum getInstance(){
        if(instance == null) {
            instance = new Curriculum();
        }
        return instance;
    }

    private void fillList(){
        questionsDataStore.add(new Question());
    }
}
