package icu.mianshi.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class HelloWorld {
    public static void main(String[] args) {
        int i = 1;
        int b = 1029;
        System.out.println("Hello world:" + (i + b));
    }
    public int readFile(String fileName) throws IOException {
        FileReader fr = new FileReader(new File(fileName));
        return fr.read();
    }
}