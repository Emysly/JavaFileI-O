package com.emysilva;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Output3 {
    public static void main(String[] args) throws IOException {

        try {
            FileOutputStream fos = new FileOutputStream("document3.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            String s = "3. buffered output stream";

            bos.write(s.getBytes());

            System.out.println("success!!!");

            bos.close();
            fos.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
