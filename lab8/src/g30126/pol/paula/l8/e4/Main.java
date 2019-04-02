package g30126.pol.paula.l8.e4;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        Car m1 = new Car("", 1);
        String fileName = "";

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
            oos.writeObject(m1);
            oos.close();
        }catch(IOException e){
            System.out.println(e);
        }

        Car m2 = null;

        try {
            ObjectInputStream o = new ObjectInputStream(new FileInputStream(fileName));
            m2 = (Car) o.readObject();
            o.close();
        }catch(IOException e1) {
            e1.printStackTrace();
        }catch(ClassNotFoundException e3) {
            e3.printStackTrace();
        }

        System.out.println("Car model: "+ m2.getModel() + " price: "+ m2.getPrice());


    }

}