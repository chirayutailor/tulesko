package Assignment.String.StringBuffer;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println( "Reverse of \"Chirayu\" is : " + reverseString( "Chirayu") );
    }

    static String reverseString( String str ) {
        StringBuffer sb = new StringBuffer( str );
        sb.reverse();

        return sb.toString();
    }
}
