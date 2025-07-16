                                  //this programe example for classes and object method
//creat classes in first
public  class laptop{
   //this line are used in class outside value or blueprint
   String lapname="";
   String lapprc="";
   int lapram=0;
   int lapprice=0;

    public static void main(String[] args){
        //this is object creating method ,these object is used on class structure gave the input
        laptop lap1=new laptop();
        lap1.lapname="lenovo";
        lap1.lapprc="i5 intel";
        lap1.lapram=16;
        lap1.lapprice=20000;
        System.out.println(lap1.lapprice);
        System.out.println(lap1.lapprc);
        System.out.println(lap1.lapram);
        //lap1 and lap2 using so many class and object in java progarm
        laptop lap2=new laptop();
        lap2.lapname="apple";
        lap2.lapprc="i9 intel";
        lap2.lapram=32;
        lap2.lapprice=200000;
        System.out.println(lap2.lapprice);
        System.out.println(lap2.lapprc);
        System.out.println(lap2.lapram);

    }

}