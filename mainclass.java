/*
class person{
    public String  name;
    protected int age;
    private String socialsecuritynumber;
    String address;

    person(String name,int age,String ssn,String add){
        this.name=name;
        this.age=age;
        this.socialsecuritynumber=ssn;
        this.address=add;
    }
}
class employee extends person{
    employee(String name, int age,String ssn,String add){
        super(name,age,ssn,add);
    }
}



public class mainclass{
    public static void main(String[] args){
        employee e1=new employee("john",18,"xyt3","chennai");
        System.out.println(e1.name);
        System.out.println(e1.age);
        System.out.println(e1.socialsecuritynumber);
        System.out.println(e1.address);
        
    

    }
}
    */

class counter{
    static int count=0;//this program how to static program work
    int instancenumber=0;
    counter(){
        count=count+1;
        instancenumber=instancenumber+1;

    }
    void disp(){
        System.out.println("instancenumber"+instancenumber);
        System.out.println("count"+count);
    }
}
public class mainclass{
    public static void main(String[] args) {
        counter p1=new counter();
        p1.disp();
        counter p2=new counter();
        p2.disp();
        counter p3=new counter();
        p3.disp();
    }
    
    }
    

