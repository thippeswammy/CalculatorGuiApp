/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Strings {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char ch = 0;
        String mer = "";
        int number = 5000;
        for (int d = 1; d <= 1000000; d++) {
            if (1 == 1) {
                ch = (char) (d);
                mer = mer + " " + ch;
            }
            /*else {
                int a = sc.nextInt();
                if (a == 1) {
                    number = number + 5000;
                }*/
            if (d % 100 == 0) {
                mer = mer + " " + ch + "\n";
            }
        }
        PrintWriter writer;
        try {
            writer = new PrintWriter("C:\\ProjectFiles\\Syambles.txt", "UTF-8");
            writer.println((mer));
            writer.close();
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
        }
    }
}
