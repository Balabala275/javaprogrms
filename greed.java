// this progarm all declear function overloading ,constructor ,constructor overloading ........
public class greed{
    //function overloading method called
    void sum(String s)
    {
        System.out.println(s);
    }

     void sum(int a,int b){
        System.out.println(a%b);
        System.out.print("welcome");
     }  //this type function called function overloading   //same fucntion name but parameter passing differnt condition


//this type how do called constretor in java same function overloading method
    greed(){
        System.out.println("hello");
    }
    greed(int a, int b){            
        System.out.println(a+b);   
    }



    public static void main(String[] args){
        greed obj1=new greed();
        greed obj2=new greed(20,10);
        obj1.sum(10,20);//same fuction name but diferent codintion using
        obj1.sum("bala ");


    }
}