package Assignment.String;

public class StringConcat {
    public static void main(String[] args) {
        String str = "Tulesko" + 100 + 44;
        System.out.println( str );

        str = 100 + " Tulesko";
        System.out.println( str );

        str = 100 + 44 + " Tulesko";
        System.out.println( str );
    }
}
