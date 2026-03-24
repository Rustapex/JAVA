package prac.io;

import java.io.IOException;

public class Ex03 {
    public static void main(String[] args) {

        int input;  // abcdlkdflflflflfgffff엔터
        try {
            while(  ( input  = System.in.read())!= '\n'){
                System.out.print( (char) input);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
