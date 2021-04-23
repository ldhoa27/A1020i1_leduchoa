package IO_TextFile.baitap;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class readFile {
    public static void readfile(String path) {


        FileInputStream fis = null;
        try {
            fis = new FileInputStream(path);
            int data= fis.read();
            while (data!=-1) {
                System.out.println((char)data);
                data=fis.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static void main(String[] args) {

        readfile("D:\\A1020i1\\Module2\\src\\IO_TextFile\\baitap\\country.csv");
    }
}
