/*this java progarm for basic java structure and example all topic ..
basic syntax,variable,datatype,operator(arithematic,ralational,logical )
then how to input and get a output,control statements if,if..else if,nested if,for loop,ternarry operator,type casting...
*/
import java.util.Scanner;
public class Hello{
    public static void main(String[] args)
    {
        
        int a=67;
        String b="welcome to java progrrm";
        System.out.println(a);
        System.out.println(b);
        System.out.println("hello world!!");
        System.out.println("enter your number:");
        Scanner bala= new Scanner(System.in);

        int num= bala.nextInt();
        System.out.println("your Entered number is "+num);
     //this programe for excierse
        System.out.println("enter your age");
        int num2=bala.nextInt();
        bala.nextLine();
        System.out.println("your age is"+num2);
    //name input
        System.out.println("Enter your name:");
        String name=bala.nextLine();
        System.out.println("your name is"+name);
    //next example addtion
    System.out.println("entered three variable values multiplied and addtion and division");
    int x=bala.nextInt();
    int y=bala.nextInt();
    int z=bala.nextInt();
    int e=x*y*z;
    int f=x+y+z;
    System.out.println(e/f);   

    //datatypes bytes,short,int,long,float,double,char,string,boolean,array,class object
    //if else ,comparision operater example
    System.out.println("if statement using this method program graterthan or not");
    int bol = bala.nextInt();
    int bol2 =bala.nextInt();
    if(bol>bol2){
        System.out.println("given is true");
    }else{
        System.out.println("given is not true");
    }
    //this program for my mark calculation
    System.out.println("mark details pass or fail");
int mark =bala.nextInt();
if(mark>=35){
    System.out.print("pass");
}else{
    System.out.print("fail");
}
// now learn logical oprater 
System.out.println("enter a number for divisiable by 3 and 5:");
int check=bala.nextInt();
if(check%3==0 && check%5==0){     //&& this operater is used by input two values true or not
    System.out.println("given number is divisible by 3 and 5");//|| this operater used by two value any one true output true
}else{
    System.out.println("given number is not divisible by 3 and 5");
}
//gievn number is odd or even
System.out.println("enter number for odd or even check");
int numbers=bala.nextInt();
if(numbers%2==0){
    System.out.println("given num is even");
}else{
    System.out.println("given num id odd");
}
// else if and nesed if examples
System.out.println("what is the score in game?");
int score =bala.nextInt();
if(score<50){
    System.out.println("you need impore");
}else if(score<=70 && score>51){
    System.out.println("good job!!");

}else if(score<=100){
    System.out.print("excelent");
}
System.out.println("this is example for subject five mark:");
int m1=bala.nextInt();
int m2=bala.nextInt();
int m3=bala.nextInt();
int m4=bala.nextInt();
int m5=bala.nextInt();
int totalmarks=m1+m2+m3+m4+m5;
double avg=totalmarks/5;

if(avg>=90){
    System.out.println("grade A");
}else if(avg>=80){
    System.out.println("grade B");
}else if(avg>=60){
    System.out.println("grade C");
}else if(avg>=40){
    System.out.println("grade D");
}else{
    System.out.print("weast !!");
}
//System.out.println(avg);
//nested if
System.out.println("enter a option a)kfc type true or false b)chicken c)pepise");
boolean kfc=bala.nextBoolean();
boolean chicken=bala.nextBoolean();
boolean pepise=bala.nextBoolean();
if(kfc){
    System.out.println("enterd shop");
    if(chicken){
        System.out.println("eating chicken");
        if(pepise){
            System.out.print("dring pepise");
        }//multiple condition gave this type
    }

}else{
    System.out.println("choose corret option");
}
//now learn for tarneary operator,syntax:variable=(condition)?"value":"value" this is optinal for if else
boolean rain=true;
String wether=rain?"you will taken an umberla":"you will enjoy the sunlight";
System.out.println(wether);
//next exampel
System.out.println("get inmpte for two numbers usinf terneary optrator");
int tr1=bala.nextInt();
int tr2=bala.nextInt();
String trs=tr1>tr2 ? "tr1 is graterthen tr2":"tr2 is grter then tr1";
System.out.println(trs);
//nextlearn for  loop,while,do while
System.out.println("get input for continuous print ");
System.out.println("enter a number1:");
int numb1=bala.nextInt();
System.out.println("enter number 2:");
int numb2=bala.nextInt();
for(int i=numb1;i<=numb2;i=i+1){
    System.out.println(i);
}
//print 1 to ten for loop and if loop
int count=0;
for(int i=1;i<=10;i=i+1){
    if(i%2==0){
        //System.out.println("even number is "+i);
    }else{
        count=count+1;//odd and even number found after total count if you want use like this
        System.out.println("odd numbers is "+i);
        System.out.println(count);
    }
}
System.out.println(count);
//print 1 to 100 number which one is divided by 3 and 5 find
System.out.println("for loop using divisible by 3 and 5");
for(int i=1;i<=100;i=i+1){
    if(i%3==0 && i%5==0){
        System.out.println("these number are divisiable by 3 and 5"+i);
    }

    }

}

}