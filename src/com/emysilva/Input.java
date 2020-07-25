package com.emysilva;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class Input {
    public static void main(String[] args) {
        try{
            FileInputStream fin1 = new FileInputStream("document1.txt");
            FileInputStream fin2 = new FileInputStream("document2.txt");
            FileInputStream fin3 = new FileInputStream("document3.txt");
            FileOutputStream fos = new FileOutputStream("anotherfile.txt");

            Vector v = new Vector<>();
            v.add(fin1);
            v.add(fin2);
            v.add(fin3);

            Enumeration e = v.elements();

            SequenceInputStream sin = new SequenceInputStream(e);
            int i;
            while((i=sin.read()) != -1) {
                fos.write(i);
            }
            sin.close();
            fin1.close();
            fin2.close();
        }catch(Exception e){System.out.println(e);
        }
    }
}
