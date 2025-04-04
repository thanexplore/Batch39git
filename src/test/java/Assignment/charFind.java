package Assignment;

public class charFind {
    public static void main(String[] args) {
        String input="programming";
        char find='z';
        int count=0;

        for(int i=0;i<input.length();i++)
        {
            if(input.charAt(i)==find)
            {
                count++;
            }

        }
        System.out.println("The character"+" "+find +" "+"appears"+" "+count+"times in programming");
    }
}


