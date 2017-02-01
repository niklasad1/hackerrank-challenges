import java.io.*;
import java.util.*;

public class Day9 {
  
    public static int factorial(int n) {

      if (n < 2) return 1;
      else {
        return factorial(n-1)*n;
      }
    }
  
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(factorial(n));
    }
}
