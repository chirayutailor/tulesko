package SelfPractice.Problem2;

public class LongestUniqueSubString {
    static int longestUniqueSubsttr( String S ){

        int longestLength = 0;
        int stringMidLength = ( int ) Math.ceil( S.length() / 2 );

        for( int counter = 0; counter < stringMidLength; counter++ ) {
            var nextRepeatingCharacterIndex = S.indexOf( S.charAt( counter ), ( counter + 1) );
            if( -1 != nextRepeatingCharacterIndex ) {
                var length = nextRepeatingCharacterIndex - counter;
                if( longestLength < length ) {
                    longestLength = length;
                }
            }
        }

        return longestLength;
    }

    public static void main(String[] args) {
        System.out.println( "Result of 1st call = " + longestUniqueSubsttr( "geeksforgeeks" ) );
        System.out.println( "Result of 2nd call = " + longestUniqueSubsttr( "abdefgabef" ) );
    }
}
