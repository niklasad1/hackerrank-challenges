import java.io.*;
import java.util.*;

public class Day29 {
  public static int maxLessThanK(int n, int k) {
    int max = -1;
    for(int a = 1; a <= n; a++) {
      for(int b = 1; b <= n; b++) {
        int bitwiseAnd = a & b;
        if((a < b) && (bitwiseAnd > max) && (bitwiseAnd < k)) {
          max = bitwiseAnd;
        }
        if(max == k-1) return max;
      }
    }
    return max;
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    for(int i = 0; i < x; i++) {
      int n = scan.nextInt();
      int k = scan.nextInt();
      System.out.println(maxLessThanK(n, k));
    }
  }
}
