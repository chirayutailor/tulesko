package Assignment.String;

public class StringPlusOperator {
    public static void main(String[] args) {
        String s1 = "Chirayu";
        String s2 = "Chirayu" + " Tailor";
        // Whenever you use reference variable within concatenation
        String s3 = s1 + " Tailor";
        String s4 = "Chirayu Tailor";

        System.out.println( s2 );
        System.out.println( s3 );
        // Will return false since s3 hold non-pool heap area reference
        System.out.println( s2 == s3 );
        // Will return true since s2 and s4 variable refer to same reference within String Pool
        System.out.println( s2 == s4 );
    }
}
