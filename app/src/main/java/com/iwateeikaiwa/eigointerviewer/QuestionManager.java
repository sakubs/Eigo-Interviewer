package com.iwateeikaiwa.eigointerviewer;

import java.util.ArrayList;

public class QuestionManager {
    private ArrayList<Question> mQuestions;
    private String mQuestionsFilePath;

    public QuestionManager() {
        this.mQuestions = new ArrayList<Question>();
        this.mQuestionsFilePath = "questions.txt";

    }

    public void addQuestion(String quesText, ArrayList<String> hints, ArrayList<String> categories) {
        Question newQuestion = new Question();
        newQuestion.setmQuestionText(quesText);
        newQuestion.setmCategories(categories);
        newQuestion.setmHints(hints);
        this.mQuestions.add(newQuestion);
    }

}
