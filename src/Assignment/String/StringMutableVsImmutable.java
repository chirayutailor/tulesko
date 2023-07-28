package Assignment.String;

public class StringMutableVsImmutable {
    public static void main(String[] args) {
        String s1 = "Tulesko";
        String s2 = s1;

        StringBuffer sb1 = new StringBuffer( "Tulesko" );
        StringBuffer sb2 = sb1;

        System.out.println( "-----------------------------------------------\nHascode Display\n-----------------------------------------------");
        System.out.println( s1.hashCode() );
        System.out.println( sb1.hashCode() );

        System.out.println( "-----------------------------------------------\nCompating objects\n-----------------------------------------------");
        System.out.println( s1.hashCode() == s2.hashCode() );       // true
        System.out.println( sb1.hashCode() == sb2.hashCode() );     // true

        // Since String is immutable, assigning new value will change the reference point of s1 variable
        s1 = "Chirayu";
        // Since StringBuffer is mutable, it allows change of value within the same reference point
        sb1.replace( 0, sb1.length(), "Chirayu" );

        System.out.println( "-----------------------------------------------\nRechecking Hascode\n-----------------------------------------------");
        System.out.println( s1.hashCode() );
        System.out.println( sb1.hashCode() );

        System.out.println( "-----------------------------------------------\nRechecking Hashcode object\n-----------------------------------------------");
        // Comparing the String and StringBuffer objects once again
        System.out.println( s1.hashCode() == s2.hashCode() );       // false
        System.out.println( sb1.hashCode() == sb2.hashCode() );     // true
    }
}
