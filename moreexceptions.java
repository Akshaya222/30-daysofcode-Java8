import java.util.*;
import java.io.*;
 
class Calculator{
    int n,p;
    int value=1;
    int power(int n,int p) throws Exception{
        if(n>=0 && p>=0){
        int i=p;
        while (i != 0)
        {
            value *= n;
            --i;
        }
            return value;
        }else{
            throw new Exception("n and p should be non-negative");
        }
    }
    
}

class Solution{

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}

