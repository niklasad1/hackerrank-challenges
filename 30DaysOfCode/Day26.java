import java.io.*;
import java.util.*;

public class Day26 {

  // assume the array size is always 6
  public static int calcRetAmount(int arr[]) {
    int diffDay = arr[0] - arr[3];
    int diffMonth = arr[1] - arr[4];
    int diffYear = arr[2] - arr[5];

    if (diffMonth == 0 && diffYear == 0 && diffDay >= 1) return 15*diffDay;
    else if (diffYear == 0 && diffMonth >= 1) return 500*diffMonth;
    else if (diffYear >= 1) return 10000;
    // book returned early
    else return 0;
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int[] input = new int[6];
    for(int i = 0; i < 6; i++) {
      input[i] = scan.nextInt();
    }
    System.out.println( calcRetAmount(input) );
  }
}
