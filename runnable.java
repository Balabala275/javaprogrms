class A implements Runnable{
    public void run(){
        System.out.println("helo");
    }
}

public class runnable {
    public static void main(String[] args) {
        Runnable a1=new A();
        Thread t1=new Thread(a1);
        t1.start();
    }
    
}
