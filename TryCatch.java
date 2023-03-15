package Exception;
import java.util.Scanner;
public class TryCatch {
    public static void main(String[] args) {
        demo();
    }
    public static void demo(){
        int num1,num2,res;

        Scanner sc=new Scanner(System.in);
        System.out.println("enter two number");
        num1= sc.nextInt();
        num2=sc.nextInt();
        //try use for uncertain situation ,exception occur hone vala ho tb try block use krte hai
        try {
            res = num1 + num2;
            System.out.println("add is =" + res);
            res = num1 - num2;
            System.out.println("sub is =" + res);
            res = num1  % num2;
            System.out.println("mul is=" + res);
            res = num1 / num2;
            System.out.println("div is=" + res);
            res = num1* num2;
            System.out.println("mod is=" + res);
            int arr[] = new int[5];
            arr[5] = 56;
            System.out.println("the value of arrya is =" + arr[5]);
        }
        //catch clock use for exception handle ,
        catch (ArrayIndexOutOfBoundsException ae){
            System.out.println("the size of the array is not proper \n we cannot user the extra size it is defined");

        }
        catch (ArithmeticException ae){

            System.out.println("the second number cannot be zero:\n"+ ae.getMessage());
        }
        catch (Exception ae)
        {
            System.out.println("EXP:)");
        }
        finally {
            System.out.println("hello0000000045");
        }
    }
}
