package com.iwateeikaiwa.eigointerviewer;

import java.util.ArrayList;

public class Question {
    private String mQuestionText;
    private ArrayList<String> mCategories;
    private ArrayList<String> mHints;

    public void setmQuestionText(String mQuestionText) {
        this.mQuestionText = mQuestionText;
    }

    public String getmQuestionText() {
        return mQuestionText;
    }

    public void setmCategories(ArrayList<String> mCategories) {
        this.mCategories = mCategories;
    }

    public void addCategory(String category) {
        this.mCategories.add(category);
    }

    public ArrayList<String> getmCategories() {
        return mCategories;
    }

    public void setmHints(ArrayList<String> mHints) {
        this.mHints = mHints;
    }

    public void addHint(String hint) {
        this.mHints.add(hint);
    }

    public ArrayList<String> getmHints() {
        return mHints;
    }
}
