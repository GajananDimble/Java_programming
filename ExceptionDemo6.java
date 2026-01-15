import java.util.*;

class ExceptionDemo6
{
    public static void main(String A[])
    {
        Scanner sobj=new Scanner(System.in);

        int iNo1=0,iNo2=0,iAns=0;

        System.out.println("Enter First Number :");
        iNo1=sobj.nextInt();

        System.out.println("Enter Second Number :");
        iNo2=sobj.nextInt();

        try
        {
            System.out.println("Inside try Block");
            iAns=iNo1/iNo2;
        }
        catch(Exception eobj)                     //Generic Catch
        {
            System.out.println("Inside Generic Catch");
        }
        // Error Due to Catch Sequenc
        catch(ArithmeticException aobj)            //Specific catch
        {
            System.out.println("Inside catch Block");
            System.out.println(aobj);
        }
        System.out.println("Division is:"+iAns);
    }
}