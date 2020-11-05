package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        System.out.println(args[0]);
    }

    //handle
    void fall(int distance) {
        try {
            if (distance > 10){
                throw new IOException();
//                throw new RuntimeException();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //declare
    void fall2 (int distance) throws IOException{
        if (distance > 10) {
//            throw new IOException();
        }
    }
}
