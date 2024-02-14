
import java.util.*;
class Rec{
    void print(int i,int num)
    {
           if(i<=num)
           {

            System.out.println(i);
                 i=i+1;

                 print(i,num);
           }

           return;
    }
}

public class Recursion_print_1_to_n {
    public static void main(String args[])
    {
        int num;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the range");
        num=s.nextInt();

        Rec R1=new Rec();

        R1.print(1, num);


    }
    
}
