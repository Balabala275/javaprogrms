class animal{
     void eat()
     {
        System.out.println("this is animal");
     }
   }
   class dog extends animal{
    void brak(){
        System.out.println("bark!!!!!!");            //there are four type of inheritance using
    }                                                //1)single inheritance =extends for dog and animal                                                                                                                                                 
   }
    class puppy extends dog{                         //2)multilevel= extends for puppy,dog,eat
        void weep(){                                 // 3)hierarchical=extends for cat,puppy,dog,eat
                System.out.println("weep!!");        //  4)hybrid =all the class mixted method is called
        }
        
    }
    class cat extends animal{
        void meow(){
            System.out.println("meow");
        }
        
    }
public class example{
    //this program for "this "function or method
    /*
    String myname;
    example(){
        System.out.println("hello");
    }
    void setname(String myname){
        this.myname=myname;
    }
    */
   //this program represented by inheritance method
   
    public static void main(String[] args){
       // example obj1=new example();
        cat p1=new cat();
     //obj1.setname("mark");
        //System.out.println(obj1.myname);
        p1.brak();


    }
}