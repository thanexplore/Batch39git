package testing;

public class Gradingstudents {
    public static void main(String[] args) {
        //  hard coded data

        String[] stdName = {"raju", "rohan", "sam"};
        float[][] marks = {{70, 70, 70}, {85, 60, 90}, {98, 95, 99}};
        float[] avgOfMarks;
        char grade;
        avgOfMarks = new float[3];
        float[] attendance = {63, 75, 90};

        // calculating avg of marks
        for (int i = 0; i < avgOfMarks.length; i++) {
            avgOfMarks[i] = avgOfStudent(marks, avgOfMarks, i);
            //System.out.print(avgOfMarks[i]);
        }
        // Grade finding based on avg/attendance
        for (int i = 0; i < stdName.length; i++) {
            if (avgOfMarks[i] > 90 && attendance[i] > 85) {
                grade = 'A';
                System.out.println(stdName[i] + " Got " + grade);
            } else if (avgOfMarks[i] >= 80 && avgOfMarks[i] <= 89 && attendance[i] > 75) {
                grade = 'B';
                System.out.println(stdName[i] + " Got " + grade);
            } else if (avgOfMarks[i] >= 70 && avgOfMarks[i] <= 79 && attendance[i] > 65) {
                grade = 'C';
                System.out.println(stdName[i] + " Got " + grade);
            } else {
                grade = 'D';
                System.out.println(stdName[i] + " Got " + grade);
            }
        }

    }


// method for avg of marks

    public static float avgOfStudent(float [][] marks , float [] avgOfMarks, int i) {
        float[] sumOfMarks;

        sumOfMarks = new float[3];
        for (int x = 0; x < marks.length; x++) {
            for (int j = 0; j < marks[x].length; j++) {
                sumOfMarks[x] += marks[x][j];
            }
            avgOfMarks[x] = sumOfMarks[x] / 3;
        }
        if (i == 0) {
            return avgOfMarks[0];
        } else if (i == 1) {
            return avgOfMarks[1];
        } else {
            return avgOfMarks[2];
        }
    }

}

