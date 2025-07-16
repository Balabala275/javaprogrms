                       //this java programe fuction all method
import java.util.Scanner;
public class demo{
    
    void greeding(){
        System.out.println("welcome!!");
    }
    void man(){
        System.out.println("i am man...");
    }
    void add(int a,int b){
        //int a=10;
        //int b=20;
        System.out.println(a+b);
    }
    //how to work return method 
    int sum(int a,int b){
       int c=a+b;
        return c;
    }
    String getname(String n){
        
       return n;
      // System.out.println("my name is  "+n);
    }
    
   void find(int num)
   {
    if(num%2==0){
        System.out.println(num+" "+"given number is even");
    }else{
        System.out.println(num+"given number is odd");
    }
   }
   */
   String passorfail(int mark)
   {
        if(mark>35){
            return "pass";
        }else{
            return "fail";
        }
   }
    public static void main(String[] args){
       
        //to creat the object because get the class value
        demo obj1=new demo();
        obj1.greeding();
        obj1.man();
        obj1.add(10,2);
      // int value=obj1.sum(10,2);
       System.out.println(value);
       String names=obj1.getname("bala");
       System.out.println(names);

        
        Scanner scan=new Scanner(System.in);
        //int num=scan.nextInt();
        //demo obj2=new demo();
       // obj2.find(num);
       int mark=scan.nextInt();
       demo obj2=new demo();
       String marks=obj2.passorfail(mark);
       System.out.println(marks);
        
    

    


    }
}