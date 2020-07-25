package com.emysilva;

import java.io.*;

public class Output1 {

    public static void main(String[] args) throws IOException {

        try {
            FileOutputStream fos = new FileOutputStream("document1.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            String s = "1. buffered output stream\n";

            bos.write(s.getBytes());

            System.out.println("success!!!");

            bos.close();
            fos.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
