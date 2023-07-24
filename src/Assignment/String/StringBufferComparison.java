package Assignment.String;

public class StringBufferComparison {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer( "Tulesko" );
        StringBuffer sb2 = new StringBuffer( "Tulesko" );

        System.out.println( sb1.toString() );
        System.out.println( sb2.toString() );

        System.out.println( sb1.equals( sb2 ) );                        // Returns false
        System.out.println( sb1.toString().equals( sb2.toString() ) );  // Returns true
    }
}
