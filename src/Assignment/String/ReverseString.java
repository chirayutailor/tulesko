package Assignment.String;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println( "Reverse of \"Chirayu\" is : " + reverseString( "Chirayu") );
    }

    static String reverseString( String str ) {
        char[] chr = str.toCharArray();
        String s = "";

        for (int i = ( chr.length - 1 ); 0 <= i ; i-- ) {
            s += chr[i];
        }

        return s;
    }
}
