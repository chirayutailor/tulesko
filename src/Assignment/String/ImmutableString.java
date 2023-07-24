package Assignment.String;

public class ImmutableString {
    public static void main(String[] args) {
        String s1 = "Tulesko";
        String s2 = "Tulesko";

        // This compares object reference. True value means both refer to same object
        System.out.println( s1 == s2 ); // true
        System.out.println( s1.equals( s2 ) ); // true

        // Normally when 2 reference variable refer to same object reference then any change made through one object
        // will also reflect in another object too. But in case of SCP, that's not the case
        s1 = "tulesko";
        System.out.println( s1 == s2 ); // false
        System.out.println( s1.equals( s2 ) ); // false
    }
}


