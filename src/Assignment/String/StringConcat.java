package Assignment.String;

public class StringConcat {
    public static void main(String[] args) {
        // JVM will first convert 100 into string and concate the same to "Tulesko".
        // Once that operation is complete, it will append 44 to existing string.
        // Hence will return "Tulesko10044"
        String str = "Tulesko" + 100 + 44;
        System.out.println( str );

        // Will return "100 Tulesko"
        str = 100 + " Tulesko";
        System.out.println( str );

        // Since operation is performed from left to right, and 1st and 2nd inputs are both integer,
        // JVM will first add them and later concate the result to 3rd input which is string
        // Hence output will be "144 Tulesko"
        str = 100 + 44 + " Tulesko";
        System.out.println( str );
    }
}
