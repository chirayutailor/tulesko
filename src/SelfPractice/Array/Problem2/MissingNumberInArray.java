package SelfPractice.Array.Problem2;

import java.util.Arrays;

public class MissingNumberInArray {
    public static void main(String[] args) {
        System.out.println( missingNumber( new int[]{1,2,3,5}, 5 ) );
        System.out.println( missingNumber( new int[]{6,1,2,8,3,4,7,10,5}, 10 ) );
        System.out.println( missingNumber( new int[]{2}, 2 ) );
        System.out.println( missingNumber( new int[]{1}, 2 ) );
        System.out.println( missingNumber( new int[]{1, 2, 3, 4}, 5 ) );
    }

    static int missingNumber(int array[], int n) {
        // Your Code Here

        Arrays.sort( array );
        int startValue = array[0];

        if( n == 2 ) {
            if( startValue == 1 ) {
                return 2;
            } else {
                return ( startValue - 1);
            }
        } else if( startValue == 2 ) {
            return 1;
        }

        for ( int i: array ) {
            if( startValue != i ) {
                break;
            }

            startValue++;
        }

        return startValue;
    }
}
