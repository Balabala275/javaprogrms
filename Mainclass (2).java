import java.util.Scanner;
public class Mainclass{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter your name : ");
         String name=scanner.nextLine();
         System.out.print("enter your age :");
        int age=scanner.nextInt();
         //group 1
         if(name==""){
            System.out.println("pls enter your name");
         }//else if(name){
           // System.out.println("your name is : "+name);
         //}

        //group 2 caluclate the age in differnt type
        if(age>=65){
            System.out.println("you are senior🤓");
        }else if(age>=18){
            System.out.println("you are a young man ");
        }else if(age<=18){
            System.out.println("you are a child");
        }else if(age<0){
            System.out.println("you say wrong");
        }else if(age<=0){
            System.out.println("you are a baby");
        }else{
            System.out.println("choose current age");
        }
       

    }
}