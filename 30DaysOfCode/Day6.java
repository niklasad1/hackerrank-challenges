import java.util.Scanner;

public class Day6 {

  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    // dummy to read "\n"
    scan.nextLine();

    String[] str = new String[n];

    for (int i = 0; i < n; i++) {
      str[i] = scan.nextLine();
    }
    scan.close();

    for (int i = 0; i < n; i++) {

      char[] charArray = str[i].toCharArray();

      for(int j = 0; j < charArray.length; j += 2) {
        System.out.print(charArray[j]);
      }
      System.out.print(" ");
      for (int k = 1; k < n; k += 2) {
        System.out.print(charArray[k]);
      }
      System.out.println("");
    }
  
  }
}
