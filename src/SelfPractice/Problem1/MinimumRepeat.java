package SelfPractice.Problem1;

public class MinimumRepeat {
    static int minRepeats(String A, String B) {
        // code here
        int counter = 1;
        int maxLen = B.length() * 3;
        String tempA = A;

        while( A.length() <= maxLen ) {
            if( A.length() >= B.length() && -1 != A.indexOf( B ) ) {
                return counter;
            }

            A += tempA;
            counter++;
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println( "Result 1 : " + minRepeats( "abcd", "cdabcdab" ) );
        System.out.println( "Result 2 : " + minRepeats( "ab", "cab" ) );
        System.out.println( "Result  : " + minRepeats( "pmjpmj", "pmjpmj" ) );
        System.out.println( "Result  : " + minRepeats( "wwwwwwww", "wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww" ) );
        System.out.println( "Result  : " + minRepeats( "abcde", "cdea" ) );
    }
}
