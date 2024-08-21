//package classmethod;
//
//import java.util.Scanner;
//
//class student{
//    String name;
//    int[] marks = new int[5];
//    double average;
//    String grade;
//
//    void inputMarks() {
//        Scanner scanner = new Scanner(System.in);
//        for (int i= 0; i < marks.length; i++){
//            System.out.println("Enter marks for subject " + (i+1) + ":");
//            marks[i] = scanner.nextInt();
//            int total = marks[i];
//        }
//    }
//
//    void calculateGrade(){
//        double total = 0;
//        average = total / 5.0;
//        if (average >= 90) grade = "A";
//        else if (average >= 80) grade = "B";
//        else if ( average >= 70) grade = "C";
//        else if ( average >= 60) grade = "D";
//        else grade = "F";
//    }
//    void displayResult() {
//        System.out.println("Student Name:" + name);
//        //double total;
//        //System.out.println("Total:" + total);
//        System.out.println("Average:" + average);
//        System.out.println("Grade:" + grade);
//    }
//}
//
//
//public class studentsgrade {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        Student student = new Student();
//
//        System.out.println("Enter the student's name: " );
//        studemt.name = scanner.nextLine();
//
//        student.inputMarkks();
//        student.calculateGrade();
//        student.displayResult();    }
//}
