import java.io.*;
import java.util.*;

public class Solution {
  public static void main(String args[]){
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner in = new Scanner(System.in);
    int i = 0;
    while(in.hasNext()){
      String line = in.nextLine();
      System.out.println(i + " " + line);
      i++;
    }
  }
}
