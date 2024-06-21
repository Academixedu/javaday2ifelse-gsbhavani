package com.example;

import java.util.Scanner;

public class StudentGradeEvaluation {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        String name=scanner.nextLine();
        System.out.println("Enter your name is:"+name);

        // Prompt the user to enter their age
        System.out.println("Enter your age:");
        int age=scanner.nextInt();
        System.out.println("Enter your age is:"+age);
        // Prompt the user to enter their exam score
        System.out.println("Enter your score:");
        int score=scanner.nextInt();
        System.out.println("Enter your score is:"+score);
        System.out.println("Name="+name);
        System.out.println("Age="+age);
        System.out.println("Score="+score);
        
        // Determine the grade
        String grade;
        
        if(score>=90)
        {
            System.out.println("grade A");
        }
        else if(score>=80&&score<90)
        {
            System.out.println("grade B");
        }
        else if (score>=70&&score<80)
        {
            System.out.println("grade c");
        }
        else if (score>=60&&score<70)
        {
            System.out.println("grade D");
        }
        else {
            System.out.println("Fail");
        }
        // Print the student's details
        

       
    }
}
