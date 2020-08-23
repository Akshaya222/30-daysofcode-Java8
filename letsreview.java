import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        scan.nextLine();
        for(int i=0;i<t;i++){
            String n=scan.nextLine();
             char[] mychar=n.toCharArray();
            for (int j = 0; j <mychar.length;j++)
           { 
               if (j % 2 == 0) 
                {
                    System.out.print(mychar[j]);
                }
           }
           System.out.print(" ");

            for (int j = 0; j <mychar.length;j++)
           { 
               if (j % 2!= 0) 
                {
                    System.out.print(mychar[j]);
                }
           }
            System.out.println(); 
        }
        scan.close();
    }
    
}

