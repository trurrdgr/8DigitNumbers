package com.learn;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class print8
{
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter writer = new PrintWriter("8digitNumbers.txt");
       // writer.println("The first line");
       // writer.println("The second line");

        for (int i=0; i<100000000; i++) {
            if (-1<i && i<10){
                writer.printf("000000%d%n",i);
            }else if (9<i && i<100){
                writer.printf("000000%d%n",i);

            }else if(i>99 && i<1000){
                writer.printf("00000%d%n",i);

            }else if(i>999 && i<10000){
                writer.printf("0000%d%n",i);

            }else if(i>9999 && i<100000){
                writer.printf("000%d%n",i);

            }else if(i>99999 && i<1000000){
                writer.printf("00%d%n",i);

            }else if(i>999999 && i<10000000){
                writer.printf("0%d%n",i);

            }else if(i>9999999 && i<100000000){
                writer.printf("%d%n",i);

            }

        }
        writer.close();

    }
}

