package g30126.pol.paula.l8.e2;

import java.io.*;

public class counter {

    public void countCharacters(BufferedReader input) throws IOException {
        String line = new String();
        int i = 0;
        System.out.println("Character searched in data.txt");
        char c;
        c = (char) System.in.read();
        while ((line = input.readLine()) != null) {
            for (int j = 0; j < line.length(); j++) {
                if (line.charAt(j) == c) {
                    i++;
                }
            }
        }
        System.out.println("Character " + c + " appears " + i + " times.");


    }
}