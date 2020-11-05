package handlingException;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MultiCatchException {
    public static void main(String[] args) {
        try{
            System.out.println(Integer.parseInt(args[1]));
        } catch ( NumberFormatException | ArrayIndexOutOfBoundsException e){
            System.out.println("Missing or Invalid input");
        }

        try{
            throw new IOException();
        } catch (/*FileNotFoundException |*/ IOException e){
            System.out.println(e);
        }
    }
}
