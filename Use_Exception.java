package Exception;
import java.util.Scanner;
public class Use_Exception {
    public static void main(String[] args)
    {

        Use_Exception obj=new Use_Exception ();
        try
        {
            obj.demo();
        }
        catch (Ragini_Exception e)
        {
            System.out.println("MSG="+e.getMessage());
        }

    }

    public void demo() throws Ragini_Exception
    {
        int num1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Numbers : ");
        num1=sc.nextInt();
        if(num1>0)
        {
            throw new Ragini_Exception("It is an Positive Number");
        }
        else
        {
            throw new Ragini_Exception("It is an Negative Number");
        }
    }

}

