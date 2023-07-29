package Assignment.String.StringBuffer;

public class ReplaceAndDeleteMethod {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer( "Chirayu Tailor is learning Java" );

        sb.replace( 8, 14, "Taylor" );
        System.out.println( sb );

        sb.replace( 8, 9, "Tailor " );
        System.out.println( sb );

        sb.delete( 15, 21 );
        System.out.println( sb );
    }
}
