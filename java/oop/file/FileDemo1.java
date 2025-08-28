package oop.file;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
        File dir = new File("C:\\Users\\Sk Azmaail\\Desktop\\Person");
        dir.mkdir();
        String d = dir.getAbsolutePath();
        System.out.println(d);
        if (dir.delete()){
            System.out.println("File has been deleted.");
        }
    }
}
