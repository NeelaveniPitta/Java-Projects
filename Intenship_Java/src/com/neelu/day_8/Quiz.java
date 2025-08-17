package com.neelu.day_8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {

	private List<Question> questions;
	private int score;
	
	public Quiz() {
		questions=new ArrayList<>();
		score=0;
		loadQuestions();
	}

	private void loadQuestions() {
		questions.add(new Question("Which language is used for Android development?",new String[]{"1. Python", "2. Java", "3. C++", "4. Kotlin"}, 4));
        questions.add(new Question("Which company developed Java?",new String[]{"1. Microsoft", "2. Sun Microsystems", "3. Google", "4. Oracle"}, 2));
        questions.add(new Question("What is the size of int in Java?",new String[]{"1. 2 bytes", "2. 4 bytes", "3. 8 bytes", "4. Depends on OS"}, 2));
    }
	
	public void start() {
        Scanner sc = new Scanner(System.in);

        for (Question q : questions) {
            System.out.println(q.getQuestionText());
            for (String option : q.getOptions()) {
                System.out.println(option);
            }
            System.out.print("Enter your answer (1-4): ");
            int answer = sc.nextInt();

            if (answer == q.getCorrectOption()) {
                score++;
                System.out.println("Correct!\n");
            } else {
                System.out.println("Wrong! Correct answer: " + q.getCorrectOption() + "\n");
            }
        }

        System.out.println("Quiz Over! Your Score: " + score + "/" + questions.size());
    }
}
