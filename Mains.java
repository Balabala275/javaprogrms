interface  A  {
    void disp();
}

public class  Mains{
    public static void main(String[] args) {
       // A sum=new A() {
       //     void disp(){
        //        System.out.println("hello world");
        //    }
       // };
       A sum=()->{
            System.out.println("hellow");
        };
       
       sum.disp();
        
    }
}