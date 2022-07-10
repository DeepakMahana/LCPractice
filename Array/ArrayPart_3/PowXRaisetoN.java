// Problem Link :- https://leetcode.com/problems/powx-n/

package Array.ArrayPart_3;

public class PowXRaisetoN {

    public static double getPowerOf(double x, int n){
        double res = 1.0;
        long nn = n;
        // Make -ve raiseto as +ve and store it in long to avoid int overflow
        if(nn < 0) nn = -1 * nn;
        while(nn>0){
            if(nn%2==1){
                res = res * x;
                nn = nn - 1;
            }else{
                x = x * x;
                nn = nn / 2;
            }
        }
        // If neg in raiseto then convert x raiseto -n --> to --> 1 / x raiseto n 
        if (n<0) res = (double)(1.0) / (double)(res);
        return res;
    }

    public static void main(String[] args) {
        double x = 2.0000;
        int n = 10;
        System.out.println(getPowerOf(x, n));    
    }
    
}
