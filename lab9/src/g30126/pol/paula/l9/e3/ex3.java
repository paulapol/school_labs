package g30126.pol.paula.l9.e3;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class ex3 extends JFrame{

    JButton b; //buton
    JTextField name; //text field
    JLabel etname; //eticheta
    JTextArea tArea; //text area

    ex3(){

        setTitle("Show File");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        init();
        setSize(400,380);
        setVisible(true);
    }


    public String readFile(String filename){
        BufferedReader in = null;
        String s=new String(),s1=new String();
        try{
            in=new BufferedReader(new FileReader(filename));
            while((s1=in.readLine())!=null)
                s+=s1+"\n";
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally{
            try{in.close();}
            catch(IOException e){
                e.printStackTrace();
            }
        }
        return s;
    }


    public void init(){

        this.setLayout(null);
        int width=80;int height = 20;

        etname = new JLabel("FileName ");
        etname.setBounds(10, 50, width, height);

        name = new JTextField();
        name.setBounds(70,50,width, height);

        b = new JButton("PRESS");
        b.setBounds(10,150,width, height);

        b.addActionListener(new TratareButon());

        tArea = new JTextArea();
        tArea.setBounds(10,180,300,200);

        add(etname);add(name);add(b);add(tArea);
    }


    public class TratareButon implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String filename = ex3.this.name.getText();
            String s = readFile(filename);
            ex3.this.tArea.setText(s);
        }
    }


    public static void main(String[] args) {
        new ex3();
    }
}

