package com.challenge;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class c91 {
    public static void main(String[] args) throws IOException {
        String filename = "data/English.txt";
        BufferedReader in = new BufferedReader(new FileReader(filename));
        String ins;
        do {
            List<String> res = new ArrayList<>();
            int b = 0;
            ins = in.readLine();
            for (int i = 0; i < ins.length(); i++) {
                if (ins.charAt(i) == '#') {
                    res.add(ins.substring(b, i));
                    b = i + 1;
                }
            }
//            System.out.println(res);
        }
        while (!ins.equals("endend"));
    }
}
