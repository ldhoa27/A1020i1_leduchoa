package demo;

import java.io.*;
public class Mine {
    public static void main(String argv[]){
        Mine m=new Mine();
        System.out.println(m.amethod());
    }
    public int amethod() {
        try {
            FileInputStream dis=new FileInputStream("Hello.txt");
        }catch (FileNotFoundException fne) {
            System.out.println("No such file found");
            return -1;
        }catch(IOException ioe) {
        } finally{
            System.out.println("Doing finally");
        }
        return 0;
    }
}





}
