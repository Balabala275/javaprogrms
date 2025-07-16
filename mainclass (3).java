//this example for multiple iheritence method and interface using implements..............
interface readable{
    void read();
}
interface writable{
    void write();
}
interface storable{
    void store();
}
class file implements readable,writable,storable{
    //create a over write or override method
    public void read(){
        System.err.println("this is read");
    }
    public void write(){
        System.out.println("this is write");
    }
   public  void store(){
        System.out.println("this is store");
    }
}
public class mainclass{
    public static void main(String[] args) {
        file p1=new file();
        p1.read();
        p1.write();
        p1.store();
        
    }
}