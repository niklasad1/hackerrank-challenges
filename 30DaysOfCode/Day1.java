import java.util.*;
import java.io.*;


public class Day1
{
 public static void main(String args[])
 {
  int i = 4; double d = 4.0; String s = "HackerRank ";
  Scanner scan = new Scanner(System.in);

  int i2 = scan.nextInt();
  double d2 = scan.nextDouble();
  scan.nextLine();
  String s2 = scan.nextLine();

  System.out.println(i + i2);
  System.out.printf("%.1f\n", d + d2);
  System.out.println(s + s2);

 }

}
