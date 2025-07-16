//this program gives array structure,array methods,array using for loop,nested for looop,while using random number generate,do while.....
import java.util.Scanner;
import java.util.Random;
class learn{
    public static void main(String[] args){
        Scanner array=new Scanner(System.in);
      
        String[] playlist=new String[10];
         System.out.println("enter num 1:");
        playlist[0]=array.nextLine();
        System.out.println("enter num 2:");
        playlist[1]=array.nextLine();
        System.out.println("enter num 3:");
        playlist[2]=array.nextLine();
        System.out.println("enter num 4:");
        playlist[3]=array.nextLine();
        System.out.println(playlist[2]);
        
     int[]integerarr=new int[4];
     integerarr[0]=array.nextInt();
     integerarr[1]=array.nextInt();
     integerarr[2]=array.nextInt();
     System.out.println("the store array intex is:"+integerarr[0]);
     
    //array using for loop examples
    int[] mark=new int[5];
    for(int i=1;i<=4;i=i+1){
        mark[i]=array.nextInt();
    }
    for(int i=1;i<=4;i=i+1){
        System.out.println("given store number in array : "+mark[i]);
    }
    
   int[] numbers={1,2,3,4,5,6,7,8,9,10};
   for(int i=0;i<numbers.length;i=i+1){
    System.out.println("this number is storge in array :"+numbers[i]);
   }
   
  //creat any table table print
  System.out.println("Enter a table you want ?  :");
  int table=array.nextInt();
  for(int i=1;i<=16;i=i+1){
System.out.println(i+"x"+table+"="+i*table);
  }
  
  
 // program for nested for examples
 for(int i=1;i<=10;i=i+1){
   for(int j=1;j<i;j=j+1){
    System.out.print("*");
   }
   System.out.println();
 }
 

 for(int i=1;i<=10;i=i+1){
   for(int j=1;j<i;j=j+1){
    System.out.print("*");
   }
   System.out.println();
 }
 
//while loop and so while ioops
int i=1;
while(i<=10){
  System.out.print(i);
  i=i+1;
}
//random  number generated method
Random rand=new Random();
int newnum=0;
while(newnum!=5){
  newnum=rand.nextInt(11);
  System.out.println(newnum);
}
//do while method
int i=1;
do{
  System.out.println("john");
  i=i+1; 
}while(i<=10);
//small do while understand number
int count=0;
do{
  System.out.println("enter the nuber>10 ");
  count=array.nextInt();
 // System.out.println(count);
}while(count<10);   
  }
}


















