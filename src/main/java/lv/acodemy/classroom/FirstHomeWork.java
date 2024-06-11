package lv.acodemy.classroom;

public class FirstHomeWork {
    public static void main(String[] args) {

        // easy peasy
        int numA = 17;
        if (numA >= 0) {
            System.out.println("Positive number");
        }
        // Odd or even
        int numB = 18;
        if (numB % 2 == 0) {
            System.out.println("Even number");
        }
        // Age group classifier
        int age = 2;
        if (age >= 0 && age < 18) {
            System.out.println("Teenager");
        } else if (age >= 18) {
            System.out.println("Adult");
        }
        // Lear year checker
        int year = 2000;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 && year % 100 == 0) {
            System.out.println("Leap year");
        }
        // multiple conditions
        int numC = -6;
        if (numC >= 0 && numC % 2 == 0 && numC < 100) {
            System.out.println("Valid number");
        }
        // nested conditions
        int numD = 56;
        if (numD >= 0) {
            if (numD % 2 == 0) {
                System.out.println("Positive and even");
            }
        }
        // Vowel
        char letter = 'a';
        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'y' || letter == 'w') {
            System.out.println("Vowel");
        }
        // Bmi calculator (height must be in meters)
        double weight = 95.00;
        double height = 1.78;
        double bmi = weight / (height * height);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Normal weight");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Overweight");
        } else if (bmi >= 30) {
            System.out.println("Obese");
        }
        // Average scores for final grades
        int mathScores = 55;
        int scienceScores = 77;
        int englishScores = 45;
        int averageScores = (mathScores + scienceScores + englishScores) / 3;
        if (averageScores >= 90) {
            System.out.println("A");
        } else if (averageScores < 90 && averageScores >= 80) {
            System.out.println("B");
        } else if (averageScores < 80 && averageScores >= 70) {
            System.out.println("C");
        } else if (averageScores < 70 && averageScores >= 60) {
            System.out.println("D");
        } else if (averageScores < 60) {
            System.out.println("F");
        }
        // extension checker
        String file = "filename.exe";
        if (file.endsWith(".txt") || file.endsWith(".doc") || file.endsWith(".pdf")) {
            System.out.println("Valid file extension");
        } else {
            System.out.println("Invalid file extension");
        }
    }
}
