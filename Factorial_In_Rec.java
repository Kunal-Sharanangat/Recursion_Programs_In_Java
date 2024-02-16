import java.util.*;
class Factorial
{
    int Return_Factorial(int num)
    {
        if(num==1)
        {
            return 1;
        }

        return num*Return_Factorial(num-1);

    }
}

public class Factorial_In_Rec {
    public static void main(String args[])
    {
        int num,result;
        
        Scanner S=new Scanner(System.in);

        System.out.println("enter the number:");
        num=S.nextInt();

        Factorial f=new Factorial();

        result= f.Return_Factorial(num);

       System.out.println("Factorial="+result);
        
    }
    
}
