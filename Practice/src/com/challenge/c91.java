package com.challenge;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class c91 {
    public static void main(String[] args) throws IOException {
        String filename = "data/English.txt";
        BufferedReader in = new BufferedReader(new FileReader(filename));
        String ins = "";
        while (!ins.equals("endend")){
            ins = in.readLine();
            System.out.println(ins);
        }
    }
}
