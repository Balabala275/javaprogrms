class person{
    String name;
    person(String name){
       this.name=name;
    }

}
class employee extends person{
    employee(){
        super("john");

    }
}
public class Mains{
    public static void main(String[] args){
        
        employee e1=new employee();
        


    }
}

