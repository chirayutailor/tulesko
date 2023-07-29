package Assignment.String.StringBuffer;

public class StringBufferToStringBuilderConversion {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer( "Chirayu" );
        StringBuilder sb2 = new StringBuilder( "Tailor" );

        StringBuilder sb3 = new StringBuilder( sb1.toString() );
        StringBuffer sb4 = new StringBuffer( sb2.toString() );
    }
}
