class person{
    String name;
    person(String name){
       this.name=name;
    }

}
class employee extends person{
    employee(String name){
        super(name);

    }
}
public class Mains{
    public static void main(String[] args){
        
        employee e1=new employee("name");
        


    }
}

