package Assignment.Array;

import java.util.Scanner;

public class JackedArray {
    public static void main(String[] args) {
        int [][][]arr = new int[2][][];

        Scanner scanner = new Scanner( System.in );
        int arraySize;

        for( int i = 0; i < arr.length; i++ ) {
            System.out.println( "Please mention the number of classes for School " + ( i+1) + " : ");
            arraySize = scanner.nextInt();

            arr[i] = new int[arraySize][];

            for( int j = 0; j < arr[i].length; j++ ) {
                System.out.println( "Please mention the number of students for School " + ( i+1) + " and class " + ( j + 1) + " : ");
                arraySize = scanner.nextInt();
                arr[i][j] = new int[arraySize];
            }
        }

        for( int i = 0; i < arr.length; i++ ) {
            for( int j = 0; j < arr[i].length; j++ ) {
                for( int x = 0; x < arr[i][j].length; x++ ) {
                    System.out.print( "Please mention mark for School " + ( i + 1 ) + " Class " + ( j + 1 ) + " Student " + ( x + 1 ) + " is " );
                    arr[i][j][x] = scanner.nextInt();
                }
            }
        }

        for( int i = 0; i < arr.length; i++ ) {
            for( int j = 0; j < arr[i].length; j++ ) {
                System.out.print( "Mark for students for School " + ( i + 1 ) + " Class " + ( j + 1 ) + " is " );
                for( int mark: arr[i][j] ) {
                    System.out.print( mark + " " );
                }
                System.out.println( "" );
            }
        }
    }
}
