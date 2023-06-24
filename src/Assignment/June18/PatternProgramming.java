package Assignment.June18;

public class PatternProgramming {
    public static void main(String[] args) {
        int n = 11;

        for( int i = 0; i < n; i++ ) {
            AlphabetA( i, n );
            System.out.println("");
        }
    }

    static void AlphabetA( int i, int n ) {
        int intMidValue = n / 2;

        for( int j = 0; j < n; j++ ) {
            if(
                ( i == 0 && j == intMidValue )
                || ( i == ( n - 1 ) && ( j == 0 || j == ( n - 1 ) ) )
                || ( i == intMidValue && ( ( n-1 ) / 4 ) <= j && j <= ( ( 3 * n ) / 4 ) )
                || ( i <= intMidValue && i + j == intMidValue )
                || ( ( i > intMidValue ) && ( i + j == ( n - 1 ) ) )

            ) {
                System.out.print( "*" );
            } else {
                System.out.print( " " );
            }
        }
    }

    void AlphabetC( int i, int n ) {

    }

    void AlphabetE( int i, int n ) {

    }

    void AlphabetH( int i, int n ) {

    }

    void AlphabetI( int i, int n ) {

    }

    void AlphabetK( int i, int n ) {

    }

    void AlphabetL( int i, int n ) {

    }

    void AlphabetO( int i, int n ) {

    }

    void AlphabetR( int i, int n ) {

    }

    void AlphabetS( int i, int n ) {

    }

    void AlphabetT( int i, int n ) {

    }

    void AlphabetU( int i, int n ) {

    }

    void AlphabetY( int i, int n ) {

    }
}
