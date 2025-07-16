import java.util.Scanner;
class divisionexample{
    void divisiblenumber(int num,int den){
        try {
            int result=num/den;
            System.out.println("result id:"+result);
        } catch (ArithmeticException e) {
            System.out.println("cannot div byzero");
        }

    }

}


public class examples{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n1=scan.nextInt();
        int n2=scan.nextInt();
        divisionexample d1=new divisionexample();
        d1.divisiblenumber(n1,n2);
        
    }
}