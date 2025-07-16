class A extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
             System.out.println("hey hello");
             try {
                Thread.sleep(10);
                
             } catch (Exception e) {
                System.out.println(e);
             }
                
        }
    }
       
}
class B extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
             System.out.println("wlcome to my progarm");
             try {
                Thread.sleep(10);
             } catch (Exception e) {
                System.out.println(e);
             }
        }
    }
    
}

public class thead_ex{
    public static void main(String[] args) {
        A p1=new A();
        B p2=new B();
        p1.setPriority(10);
        p2.setPriority(8);
        p1.start();
        p2.start();
        /*
         * try{
         *   p1.join();
         * 
         * }catch{
         * sunthing happend
         * }
         * 
         * 
         */

        
    }
 }