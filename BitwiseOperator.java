import java.util.Scanner;

public class BitwiseOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( " enter the first number ");
        int p = sc.nextInt();
        System.out.println(" enter the second number ");
        int q = sc.nextInt();
        // BITWISE OR
        System.out.println( p | q ); 
        // BITWISE AND 
        System.out.println( p & q );
        // BITWISE EXCLUSIVE OR 
        System.out.println( p ^ q );
        // LEFT SHIFT
        System.out.println( p << 1 );
        System.out.println( p << 2 );
        // RIGHT SHIFT
        System.out.println( q >> 1 );
        System.out.println( q >> 2 );
    }
}
