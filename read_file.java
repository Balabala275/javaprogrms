import java.io.BufferedReader;
import java.io.FileReader;

public class read_file {
    public static void main(String[] args){
        try {
            FileReader fr=new FileReader("output.text");
            BufferedReader br=new BufferedReader(fr);
            String line=br.readLine();
             //int c= fr.read(); 
           //System.out.println((char)c);
           //while(c!=-1){
           // System.out.print((char)c);
           // c=fr.read();
          // fr.close();
          while(line!=null){
            System.out.println(line);
            line=br.readLine();
            br.close();
             }
           
           
        } catch (Exception e) {
            System.out.println(e);
        }


    
       
    }
 }


