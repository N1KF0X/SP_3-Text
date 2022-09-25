package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);

        String symbols;
        String symbolsWithoutSpace;
        String words;
        String text = "";

        FileWriter writer = new FileWriter("inputText.txt");

        writer.write(in.nextLine());
        writer.flush();

        BufferedReader reader = new BufferedReader (new FileReader("inputText.txt"));

        String line;
        while ((line = reader.readLine()) != null) {
            text += line;
        }

        symbols = "Всего символов в тексте " + text.length();
        symbolsWithoutSpace = "Всего символов в тексте без пробелов " + text.replaceAll(" ", "").length();
        words = "Всего слов в тексте " + text.split(" ").length;

        writer = new FileWriter("outputText.txt");
        writer.write(symbols + "\n" + symbolsWithoutSpace + "\n" + words + "\n");
        writer.flush();

        System.out.print(symbols + "\n" + symbolsWithoutSpace + "\n" + words + "\n");
    }
}
