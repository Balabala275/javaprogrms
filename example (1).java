/* 
abstract class vehicle{
    final void startengine(){
        System.out.println("engine stared");
    }
    static String getvehicletype(){
        return "generic vehicle";
    }
    abstract void drive();

    
}
class car extends vehicle{
    void drive(){
        System.out.println("drive a car");
    }
}
class bike extends vehicle{
    void drive(){
        System.out.println("drive a bike");
    }
}


public class example{
    public static void main(String[] args){
        car p1=new car();
        p1.drive();
        System.out.println(vehicle.getvehicletype());//note this type ?????

    }
}
    */
     interface animal {
        int mark=10;
        void sound();
    }
    class cat implements animal{
        public void sound(){
            System.out.println("meoww");
        }
    }


   public  class example{
    public static void main(String[] args){
        cat p2=new cat();
        p2.sound();
        System.out.println(animal.mark);

    }
   }