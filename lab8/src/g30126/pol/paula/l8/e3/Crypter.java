package g30126.pol.paula.l8.e3;

import java.io.*;

public class Crypter {


    private String fileName;

    public void readFile() throws IOException {
        System.out.println("Full file path: ");
        BufferedReader bufin = new BufferedReader(new InputStreamReader(System.in));
        setFileName(bufin.readLine());
    }


    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void encrypt() throws IOException {
        readFile();
        BufferedReader fileread = new BufferedReader(new FileReader(getFileName()));
        PrintWriter filewrite = new PrintWriter(new BufferedWriter(new FileWriter(getFileName() + ".enc")));
        String sin = new String();
        while ((sin = fileread.readLine()) != null) {
            String sout = new String();
            for (char ch : sin.toCharArray()) {
                ch = (char) (ch - 1);
                sout = sout.substring(0) + ch;
            }
            filewrite.println(sout);

        }
        filewrite.close();
        fileread.close();

    }

    public void decrypt() throws IOException {
        readFile();
        BufferedReader fileread = new BufferedReader(new FileReader(getFileName()));
        PrintWriter filewrite = new PrintWriter(new BufferedWriter(new FileWriter(getFileName() + ".dec")));
        String sin = new String();
        while ((sin = fileread.readLine()) != null) {
            String sout = new String();
            for (char ch : sin.toCharArray()) {
                ch = (char) (ch + 1);
                sout = sout.substring(0) + ch;
            }
            filewrite.println(sout);

        }
        filewrite.close();
        fileread.close();

    }

}