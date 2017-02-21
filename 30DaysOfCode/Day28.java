import java.io.*;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;

public class Day28 {
  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String pattern = "[a-z]{1,20}\\s[a-z\\.]{1,40}@gmail\\.com";
    Pattern r = Pattern.compile(pattern);
    int n = scan.nextInt();
    ArrayList<String> names = new ArrayList<String>();

    // dummy to get rid of \n
    scan.nextLine();

    for(int i = 0; i < n; i++) {
      String line = scan.nextLine();
      String[] strs = line.split(" ");
      if ( strs.length != 2) {throw new IllegalArgumentException("Invalid Input Line");}
      Matcher m = r.matcher(line);
      if( m.find() ) {
        names.add(strs[0]);
      }
    }
    // sort
    Collections.sort(names);

    for(String name: names) {
      System.out.println(name);
    }

  }
}
