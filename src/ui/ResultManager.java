package ui;

import java.util.Scanner;
import model.Student;
import model.InvalidMarksException;

public class ResultManager {
    private Student[] students;
    private int count;
    private Scanner sc;

    public ResultManager(int size) {
        students = new Student[size];
        count = 0;
        sc = new Scanner(System.in);
    }

    public void addStudent() {
        // TODO: read roll, name, 3 marks with Scanner
        // construct Student, call validateMarks()
        // handle InvalidMarksException and InputMismatchException with try-catch
    }

    public void showStudentDetails() {
        // TODO: read roll, search in array, call displayResult()
    }

    public void mainMenu() {
        // TODO: implement loop with menu 1-Add, 2-Show, 3-Exit
        // use try-catch for invalid choices
        // use finally to close Scanner or print closing message
    }

    public static void main(String[] args) {
        ResultManager manager = new ResultManager(50);
        manager.mainMenu();
    }
}
