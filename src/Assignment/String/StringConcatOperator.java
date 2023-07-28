package Assignment.String;

public class StringConcatOperator {
    public static void main(String[] args) {
        String s1 = "Chirayu";
        s1.concat( " Tailor" );

        // Will return "Chirayu" since the reference to new string created above is not assigned to any variable
        System.out.println( s1 );

        String s2 = "Chirayu".concat( " Tailor" );
        String s3 = "Chirayu Tailor";

        // Since concat() method is used, a new object is created within heap area
        // ( which will implicitly point to new string within SCP )
        System.out.println( s2 == s3 );
        // This will return true;
        System.out.println( s2.equals( s3 ) );
    }
}
