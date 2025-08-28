package oop.file;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("Shreya.java");
    file1.createNewFile();
    }
}
