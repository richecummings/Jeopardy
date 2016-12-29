package com.jeopardy.beans;

public class Question implements java.io.Serializable {
    
    private String picked = "";
    private String category = null;
    private String question = null;
    private String answer1 = null;
    private String answer2 = null;
    private String answer3 = null;
    private String answer4 = null;
    private int correctAnswer = 0;
    private int questionValue = 0;
    
    public Question() {
    }

    public String getPicked() {
        return picked;
    }

    public void setPicked(String picked) {
        this.picked = picked;
    }
    
    public String getCategory() {
        return category;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }
    
    public String getQuestion() {
        return question;
    }
    
    public void setQuestion(String question) {
        this.question = question;
    }
    
    public String getAnswer1() {
        return answer1;
    }
    
    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }
    
    public String getAnswer2() {
        return answer2;
    }
    
    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }
    
    public String getAnswer3() {
        return answer3;
    }
    
    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }
    
    public String getAnswer4() {
        return answer4;
    }
    
    public void setAnswer4(String answer4) {
        this.answer4 = answer4;
    }
    
    public int getCorrectAnswer() {
        return correctAnswer;
    }
    
    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
    
    public int getQuestionValue() {
        return questionValue;
    }
    
    public void setQuestionValue(int questionValue) {
        this.questionValue = questionValue;
    }
}