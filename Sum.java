abstract class vehicle{//abstracte using onlyfor condithon because call and function  using same name
    abstract void speed();
    void num(){
        System.out.println("xyz");
    }
    
}
class bike extends vehicle{
    void speed(){
        System.out.println("super speed");
    }
}
class car extends vehicle{
    void speed(){
        System.out.println("super");

    }
}
public class Sum{
    public static void main(String[] args) {
    car ca=new car();
    ca.speed();
}
}
