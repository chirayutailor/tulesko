package Assignment.String;

public class StringCompareToOperator {
    public static void main(String[] args) {
        String s1 = "Tulesko";
        String s2 = "Tulesko";
        String s3 = "TuLesko";
        String s4 = "Navin";

        // Returns 0 since the 2 strings are identical
        System.out.println( s1.compareTo( s2 ) );
        // Returns 32 since the ascii difference between "l" and "L" is 32.
        // The moment the operator identifies a difference, it stops comparing further charactor
        System.out.println( s1.compareTo( s3 ) );
        // Returns -32 since the ascii difference between "L" and "l" is -32.
        System.out.println( s3.compareTo( s1 ) );
        // Returns 0 since the 2 strings are identical ( on ignoring case )
        System.out.println( s1.compareToIgnoreCase( s3 ) );
        // Returns 6 since the ascii difference between "T" and "N" is 6
        System.out.println( s1.compareTo( s4 ) );
    }
}
