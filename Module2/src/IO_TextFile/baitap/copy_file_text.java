package IO_TextFile.baitap;

import java.io.*;

public class copy_file_text {
    public static void main(String[] args) {
        FileInputStream sourcefile = null;
        FileOutputStream  targetfile=null;
        try {
            sourcefile=new FileInputStream("D:\\A1020i1\\Module2\\src\\IO_TextFile\\baitap\\sourc.csv");

            targetfile=new FileOutputStream("D:\\A1020i1\\Module2\\src\\IO_TextFile\\baitap\\target.csv");
            int data;
            data=sourcefile.read();
            while (data!=-1){
                targetfile.write(data);
                data= sourcefile.read();
            }
            targetfile.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



