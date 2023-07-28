package Assignment.String.StringBuffer;

public class AppendMethod {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer( "Chirayu" );
        StringBuffer sb3 = new StringBuffer( 30 );

        System.out.println(sb1.capacity() );     // Will be 16 ( default )
        System.out.println(sb2.capacity() );     // Will be 16 + 7 = 23 ( default capacity + size of String )
        System.out.println(sb3.capacity() );     // Will be 30 ( as passed in argument )

        sb1.append( "Chirayu Tailor is learning Java" );
        sb2.append( " Tailor is learning Java" );
        sb3.append( "Chirayu Tailor is learning Java" );

        // Formula of capacity increase = ( 2 x previous capacity ) + 2
        System.out.println( "----------------\nNew Capacity\n----------------");
        System.out.println(sb1.capacity() );     // Will be 34 ( ( 16 x 2 ) + 2 )
        System.out.println(sb2.capacity() );     // Will be 48 ( ( 23 x 2 ) + 2 )
        System.out.println(sb3.capacity() );     // Will be 62 ( ( 30 x 2 ) + 2 )

    }
}
