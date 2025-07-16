import java.util.InputMismatchException;
import java.util.Scanner;
class NoValidException extends Exception {
    public NoValidException(String a){
            super(a);
    }
}
public class Mainclass{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        /* 
        String name;
        
        try{
             name=scan.nextLine();
             throw new InputMismatchException("your entered wrong!!");
        }catch(ArithmeticException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }finally{
            System.out.println("program ended");
        }
        
        //System.out.println("final answer is:"+name);
        */
        try {
            int age =scan.nextInt();
            if(age<18 && age>1){
                throw new NoValidException("you are not eligible for vote");//how do custom own exception???? learn it
            }else if(age<1){
                throw new IllegalArgumentException("ok");
            }
        }catch(NoValidException e){
            System.out.println(e);

        }catch (Exception e) {
           System.out.println(e);
        }finally{
            System.out.println("program Ended....");
        }


    }
}