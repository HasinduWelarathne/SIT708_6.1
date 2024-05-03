package com.example.personalearn;

import java.util.List;

public class QuizQueDataModel {
    private int responseCode;
    private List<QuizQuestion> results;

    // Getters and setters
    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public List<QuizQuestion> getResults() {
        return results;
    }

    public void setResults(List<QuizQuestion> results) {
        this.results = results;
    }
}

class QuizQuestion {
    private String type;
    private String difficulty;
    private String category;
    private String question;
    private String correct_answer;
    private List<String> incorrect_answers;

    // Getters and setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
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

    public String getCorrectAnswer() {
        return correct_answer;
    }

    public void setCorrectAnswer(String correct_answer) {
        this.correct_answer = correct_answer;
    }

    public List<String> getIncorrectAnswers() {
        return incorrect_answers;
    }

    public void setIncorrectAnswers(List<String> incorrect_answers) {
        this.incorrect_answers = incorrect_answers;
    }
}
