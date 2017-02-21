import java.io.*;
import java.util.*;

public class Day25 {

    public static boolean isPrime(int n) {
      if ( n == 0 || n == 1) {
        return false;
      }
      
      for(int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) {
          return false;
        }
      }
      return true;
    }
  
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);  
      
      int n = scan.nextInt();    
      
      for(int i = 0; i < n; i++) {
        if( isPrime(scan.nextInt()) ) {
          System.out.println("Prime");
        }
        else {
          System.out.println("Not prime");
        }
      }
    }
}
