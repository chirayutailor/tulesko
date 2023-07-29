package Assignment.String.StringBuffer;

public class InsertMethod {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer( "Chirayu is learning Java" );

        sb1.insert( 8, "Tailor " );
        System.out.println( sb1 );
    }
}
