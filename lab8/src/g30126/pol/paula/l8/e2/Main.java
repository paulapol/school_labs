package g30126.pol.paula.l8.e2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        BufferedReader input;
        try {
            input = new BufferedReader(new FileReader(""));

            try {
                counter counter = new counter();
                counter.countCharacters(input);
            } catch (IOException e) {
                e.getMessage();
                e.printStackTrace();
            }
        } catch (FileNotFoundException e1) {
            e1.getMessage();
            e1.printStackTrace();
        }


    }

}