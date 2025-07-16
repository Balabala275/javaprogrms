import java.io.BufferedWriter;
import java.io.FileWriter;

public class write_file{
    public static void main(String[] args) {
        try {
            FileWriter fw=new FileWriter("output.text");
            BufferedWriter bw=new BufferedWriter(fw);
                 //fw.append("hello world");
                 //fw.close();
                 bw.write("heyy");
                 bw.newLine();
                 bw.write("ok");
                 bw.close();
                 System.out.println("sucess");

            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
    }
}