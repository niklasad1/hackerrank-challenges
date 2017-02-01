import java.io.*;
import java.util.*;

public class Day10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int max = 0; 
        int conseq = 0;

        while ( n != 0 ) {
            int rem = n % 2;
            n = n / 2;
            if (rem == 1) conseq++;
            else conseq = 0;
            if (conseq > max) max = conseq; 
        }
        System.out.println(max);
    }
}
