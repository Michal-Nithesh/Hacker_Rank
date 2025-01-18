import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = Integer.toString(n);
        if(n <= 100 && -100 <= n){
            s = s;
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer");
        }
        in.close();
    }
}
