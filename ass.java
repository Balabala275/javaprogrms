class teacher{
    protected String t_name="bala";//private dont using ouside class but function using possible 
    void exam(){   //public using all the class and program outside
        System.out.println(t_name);
   }
}
class doctor{
   public String name;
    public String d_place;
    void exam(String name,String d_String ){
        this. name =name;
        this. d_place=d_place;

    }

}


class ass extends teacher{//protector is using main class extends compelsory use.......
    public static void main(String[] args) {//default is using all types
        teacher tech=new teacher();

        //System.out.println(t_name);
        System.out.println(tech.t_name);
        doctor eng=new doctor();
        ///eng.name="bala";
       // eng.d_place="nagai";
        eng.exam("balla","nagga");
        //System.out.println(nammm);
    }
}
//this program using outside package connet method so pratices is very importance in other compailer