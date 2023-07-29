package SelfPractice.Array.Problem1;

import java.util.ArrayList;

public class SubArraySum {
    public static void main(String[] args) {
        System.out.println( subarraySum( new int[]{1, 2, 3, 7, 5}, 5, 12));
    }

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        int totalSum, startIndex;
        ArrayList<Integer> arrList = new ArrayList<Integer>();

        for (int counter = 0; counter < n; counter++) {
            totalSum = arr[counter];
            startIndex = counter;

            if( totalSum == s ) {
                arrList.add( ( counter + 1) );
                arrList.add( ( counter + 1) );
                return arrList;

            } else if ( totalSum > s ) {
                continue;
            }

            for (int innerCounter = (counter + 1); innerCounter < n; innerCounter++) {
                totalSum += arr[innerCounter];

                if (totalSum == s) {
                    arrList.add(startIndex + 1);
                    arrList.add(innerCounter + 1);
                    return arrList;

                } else if (totalSum > s) {
                    break;
                }
            }
        }

        arrList.add(-1);
        return arrList;
    }
}
