package Seminar2;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Lesson2_teacher {
    public static void main(String[] args) {
        String str = "Hello world";

        File f = new File("hello.txt");
        FileWriter fw = null;
        try {
            fw = new FileWriter(f);
            fw.write(str);
        } catch (IOException e) {
            System.out.println("Error: " +e);
        }
        catch (Throwable e) {
            e.printStackTrace();

        }
        finally {
            try {
                fw.close();
            } catch (IOException e) {
                System.out.println("Error: " + e);
            }
        }
    }
}
