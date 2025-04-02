package testing;

public class Charactercounter {
    public static void main(String[] args) {
        String str = "aabcd";
        char srch = 'a';
        int count =0;
        for (int i=0;i<str.length();i++){
            if((str.charAt(i)==srch)){
                count++;

            }
        }
        System.out.println(srch+" occurance is "+count+" times");
    }
}
