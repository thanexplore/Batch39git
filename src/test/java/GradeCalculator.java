public class GradeCalculator {

    public static void main(String[] args) {
        int marks[] = {92,91,98};
        int attendance=88;
        String name="John";
        float total=0, avg;

        for(int i=0; i<3; i++) {
            total = total + marks[i];
        }
        avg = (total/300)*100;
        System.out.println("Student Name:" + name);
        System.out.println("Student Mark:" + total);
        System.out.println("student Attendance:" + attendance);
        System.out.print("Student Grade: ");
        if(avg>=90 && attendance>=85)
        {
            System.out.print("A");
        }
        else if(avg>=80 && avg<=89 && attendance>=75)
        {
            System.out.print("B");
        }
        else if(avg>=70 && avg<=79 && attendance>=65)
        {
            System.out.print("C");
        }
        else
        {
            System.out.print("D");
        }
    }
}
