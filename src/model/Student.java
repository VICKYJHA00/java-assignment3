package model;

public class Student {
    private int rollNumber;
    private String studentName;
    private int[] marks;

    public Student(int rollNumber, String studentName, int[] marks) {
        this.rollNumber = rollNumber;
        this.studentName = studentName;
        this.marks = marks;
    }

    public void validateMarks() throws InvalidMarksException {
        // TODO: check each mark is between 0 and 100
        // if not, throw new InvalidMarksException("message here");
    }

    public double calculateAverage() {
        // TODO: compute and return average of 3 marks
        return 0.0;
    }

    public void displayResult() {
        // TODO: print roll, name, marks, average and Pass/Fail
    }

    public int getRollNumber() {
        return rollNumber;
    }
}
