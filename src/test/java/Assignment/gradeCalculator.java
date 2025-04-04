package Assignment;

public class gradeCalculator {
    public static void main(String[] args) {


        String studentName = "Iona";
        int[] marks = {91, 84, 75};
        int attendance = 90;
        char grade;
        float sum = 0;
        float average;

        for (int a : marks) {
            sum = sum + a;
        }
        average = sum / marks.length;

        if ((average > 90) && (attendance > 85)) {
            grade = 'A';
        } else if ((average >= 80) && (attendance > 75)) {
            grade = 'B';
        } else if ((average >= 70) && (attendance > 65)) {
            grade = 'C';
        } else {
            grade = 'D';
        }

        System.out.println("Student" + " " + studentName);
        System.out.println("Average Marks" + " " + average);
        System.out.println("Attendance" + " " + attendance + "%");
        System.out.println("Final grade" + " " + grade);


    }
}
