package capgemini.assignments;
import java.util.*;
import java.io.*;

public class Loop2 {
    public static void main(String []argh){
       Scanner in = new Scanner(System.in);
        int sum=0,a,b,n;
        int t=in.nextInt();
       
            while(t>0)
            {

                a = in.nextInt();
                b = in.nextInt();
                n = in.nextInt();
                sum=a;
                for(int j=0;j<n;j++)
                {
                    sum+=(Math.pow(2,j))*b;
                   
                    System.out.print(sum+" ");
                }
                t--;
                 System.out.println();
                
            }      

            
       
        in.close();
    }
}





