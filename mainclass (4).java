class animal{
    String name;
    int age;
    void makesound()
    {
        System.out.print("this animal can make the sound");
    }
}
class Dog extends animal{
        String breed;
        //override
        void makesound(){
            System.out.println("dog barks");
        }
        void fetch(){
            System.out.println("dog is fetching");
        }
    }
 class cat extends animal{
        String color;
        void makesound(){
            System.out.println("cat makes meow");
        }
        void climb(){
            System.out.println("cat id climbing");
        }
    }


public class mainclass{
    public static void main(String[] args){
        Dog d1=new Dog();
        d1.name="xyz";
        d1.age=6;
        d1.breed="golden";
        d1.makesound();
        d1.fetch();

        cat c1=new cat();
        c1.name="timmy";
        c1.age=8;
        c1.color="white";
        c1.makesound();
        c1.climb();
    }
}