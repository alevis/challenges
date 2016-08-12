import java.util.Scanner;
import java.lang.Math.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;
public class Solution
{  
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        NumberFormat formatter=new DecimalFormat("#0.00");
        double n = (double)sc.nextInt();
        double math=0.0,physics=0.0,chem=0.0,i=0.0;
        double sum1=0.0,sum2=0.0,sum3=0.0,msum=0.0,psum=0.0;
        double csum=0.0,rmath_phy=0.0,sqsum_m=0.0,sqsum_p=0.0;
        double sqsum_c=0.0,rphy_chem=0.0,rchem_math=0.0;
        double prSum1=0.0,prSum2=0.0,prSum3=0.0;
        while(i++ <n){
            math = sc.nextInt();physics = sc.nextInt();chem = sc.nextInt();
           
            sum1+=math*physics; sum2+=physics*chem; sum3+=math*chem;

            msum+=math;psum+=physics;csum+=chem;

            sqsum_m+=math*math; sqsum_p+=physics*physics;sqsum_c+=chem*chem;
             
        }
        rmath_phy = (n*sum1-msum*psum)/(Math.sqrt(n*sqsum_m-msum*msum)*Math.sqrt(n*sqsum_p-(psum*psum)));
        rphy_chem = (n*sum2-psum*csum)/(Math.sqrt(n*sqsum_p-psum*psum)*Math.sqrt(n*sqsum_c-(csum*csum)));
        rchem_math =(n*sum3-csum*msum)/(Math.sqrt(n*sqsum_c-csum*csum)*Math.sqrt(n*sqsum_m-(msum*msum)));
        System.out.println(formatter.format(rmath_phy));
        System.out.println(formatter.format(rphy_chem));
        System.out.println(formatter.format(rchem_math));
    }
}