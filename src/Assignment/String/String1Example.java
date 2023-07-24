package Assignment.String;

public class String1Example {
    public static void main(String[] args) {
        String str1 = "Tulesko";                        // Directly references to String Constant Pool address
        String str2 = "Tulesko";                        // Directly references to String Constant Pool address

        /*
         *  When "new" keyword is used, object is created within Heap area which implicitly creates internal reference
         * to String Constant Pool address. JVM returns heap area reference to variable in place of
         * String Constant Pool address.
         *
         * Also two memories get allocated. One in the heap area ( outside String Constant Pool ) and another within
         * String Constant Pool ( which is implicitly created )
         */

        String str3 = new String( "Tulesko" );
        String str4 = new String( "Tulesko" );

        // "==" compares object reference
        // equals() compares actual object value

        System.out.println( str1.equals( str2 ) );      // true
        System.out.println( str1.equals( str3 ) );      // true

        System.out.println( str1 == str2 );             // true
        System.out.println( str1 == str3 );             // false

        System.out.println( str4.equals( str3 ) );      // true
        System.out.println( str4 == str3 );             // false
    }
}
