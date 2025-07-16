class student{
    int mark=0;
    static String techer="vijay";//static keyword is provide only direct class name using creat value
}


public class set{
    public static void main(String[] args) {
        student m1=new student();
        m1.mark=30;
        student m2=new student();
        m2.mark=60;
        System.out.println(m1.mark);
      student.techer="bala";
        System.out.println(student.techer);

        
    }
}