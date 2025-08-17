package com.neelu.day_8;

public class Question {

	private String questionText;
	private String[] options;
	private int correctOption;
	public Question(String questionText, String[] options, int correctOption) {
		super();
		this.questionText = questionText;
		this.options = options;
		this.correctOption = correctOption;
	}
	public String getQuestionText() {
		return questionText;
	}
	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}
	public String[] getOptions() {
		return options;
	}
	public void setOptions(String[] options) {
		this.options = options;
	}
	public int getCorrectOption() {
		return correctOption;
	}
	public void setCorrectOption(int correctOption) {
		this.correctOption = correctOption;
	}
		
}
