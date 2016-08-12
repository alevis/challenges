import java.util.Scanner;
import java.lang.Math.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;
class Solution{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double n=(double)sc.nextInt();
    int m=sc.nextInt(); int i = 0;
    double a,b,k;double ave=0.0;NumberFormat formatter=new DecimalFormat("#0");
    while(i<m){a=(double)sc.nextInt();b=(double)sc.nextInt();k=(double)sc.nextInt();
        ave += (((b-a)+1)*k)/n;i++;
        }System.out.println(formatter.format(Math.floor(ave)));
    }
}