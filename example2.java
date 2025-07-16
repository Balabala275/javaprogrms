import java.util.Scanner;

class InvaliedAgeExpception extends Exception{
    public InvaliedAgeExpception(String message){
        super(message);
    }
}
class Agevalidator{
    void check(int age){
        try {
        if (age<0 || age>150){
            throw new InvaliedAgeExpception("age id invalid");
        }else{
            System.out.println("valid age");
        }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
public class example2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int age=scan.nextInt();
        Agevalidator a1=new Agevalidator();
        a1.check(age);

        
    }
}
