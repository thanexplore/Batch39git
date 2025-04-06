package nancytesting;

public class CharOccurrence {

    public static int count(String s, char c)
    {
        int result = 0;

        for (int i=0; i<s.length(); i++)
        {
            if (s.charAt(i) == c)
                result++;
        }
        return result;
    }

    public static void main(String[] args) {

        String str= "nancy";
        char c = 'n';
        System.out.println("Number of Occurrences: "+ count(str, c));
    }
}
