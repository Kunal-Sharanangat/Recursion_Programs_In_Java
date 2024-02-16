
import java.util.*;
class Rec
{
  
    void ReturnSum(int i,int sum)
    {
        if(i<1)
        {
            System.out.println("sum="+sum);
            return;
        }

        ReturnSum(i-1,sum+i);
    }

}

public class Recursion_print_sum_of_N_Term {
    public static void main(String args[])
    {
        int num;

        Scanner s=new Scanner(System.in);
        System.out.println("enter the N tern:");
        num=s.nextInt();

        Rec r=new Rec();
        r.ReturnSum(num,0);

    }

    
}
