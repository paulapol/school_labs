package g30126.pol.paula.l9.e1;


import java.awt.FlowLayout;

import javax.swing.*;
import java.util.*;

public class ButtonAndTextField extends JFrame{

    HashMap accounts = new HashMap();

    JLabel user,pwd;
    JTextField tUser,tPwd;
    JButton bLogIn;

    ButtonAndTextField(){

        accounts.put("user1", "pwd1");
        accounts.put("user2", "pwd2");
        accounts.put("user3", "pwd3");

        setTitle("Test login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        init();
        setSize(200,250);
        setVisible(true);
    }

    public void init(){

        this.setLayout(null);
        int width=80;int height = 20;

        user = new JLabel("User ");
        user.setBounds(10, 50, width, height);

        pwd = new JLabel("Pasword ");
        pwd.setBounds(10, 100,width, height);

        tUser = new JTextField();
        tUser.setBounds(70,50,width, height);

        tPwd = new JTextField();
        tPwd.setBounds(70,100,width, height);

        bLogIn = new JButton("LogIn");
        bLogIn.setBounds(10,150,width, height);

        add(user);add(pwd);add(tUser);add(tPwd);add(bLogIn);

    }

    public static void main(String[] args) {
        new ButtonAndTextField();
    }
}
