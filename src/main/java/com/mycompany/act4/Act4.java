
package com.mycompany.act4;

import java.util.Scanner;



public class Act4 {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter your Entrance Exam Score: ");
        double entranceScore = scn.nextDouble();
        
        System.out.println("Enter your GPA: ");
        double gpa = scn.nextDouble();
 
        double entranceCriteria = 75;
        double gpaCriteria = 3.0;
        
        if (entranceScore >= entranceCriteria) {
        if (gpa >= gpaCriteria) {
            System.out.println("Congratulations! You have met the requirements for admission to the university."); }
        
        else {
            System.out.println("Sorry, you're not eligible for admision as your GPA does not meet the required criteria!"); }
        
        }else {
            System.out.println("Sorry, you're not eligible for admision as your Entrance Exam Score does not meet the required criteria!"); 
                }
            
    }
        
    }

