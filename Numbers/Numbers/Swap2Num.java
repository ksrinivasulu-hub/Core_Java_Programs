// Swa[ping two number in five different ways
import java.util.*;
class SwapNumbers{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(" Before Swapping  a="+a+"\n"+"b="+b);

       // logic 1- #rd variable
        /*int swap;
        swap=a;
        a=b;
        b=swap;*/
      // Logic 2 only 2 variables used +,-
       /* a=a+b;
        b=a-b;
        a=a-b;*/

    // Logic 3 using *,/ operators Conditions: a,b!=0
    /* a=a*b;
        b=a/b;
        a=a/b;*/
    
    // Logic 4 using XOR operator
    /*a=a^b;
    b=a^b;
    a=a^b;*/
    // Logic 5 single statement
        a=a+b-(b=a);
    
        System.out.println(" After swapping a="+a+"\n"+"b="+b);
    }
}