package g30126.pol.paula.l10.e4;


import java.util.ArrayList;

public class Board {

    public static void main(String[] args) {
        ArrayList<Robot> robots = new ArrayList<>();
        Robot r1 = new Robot("robo1", 2, 1);
        Robot r2 = new Robot("robo2", 3, 2);
        Robot r3 = new Robot("robo3", 3,  3);
        Robot r4 = new Robot("robo4", 4, 6);
        Robot r5 = new Robot("robo5", 5, 1);
        Robot r6 = new Robot("robo6", 5, 4);
        Robot r7 = new Robot("robo7", 2, 5);
        Robot r8 = new Robot("robo8", 5, 3);
        Robot r9 = new Robot("robo9", 5, 8);
        Robot r10 = new Robot("robo10", 8, 5);
        robots.add(r1);
        robots.add(r2);
        robots.add(r3);
        robots.add(r4);
        robots.add(r5);
        robots.add(r6);
        robots.add(r7);
        robots.add(r8);
        robots.add(r9);
        robots.add(r10);
        r1.start();
        r2.start();
        r3.start();
        r4.start();
        r5.start();
        r6.start();
        r7.start();
        r8.start();
        r9.start();
        r10.start();
        int robos =10;
        int [] robs = new int[10];
        for(int i = 0;i<3; i++) robs[i]=1;
        while (robos!=0) {
            Robot r = null;
            Robot q = null;
            for (int i = 0; i < robots.size(); i++) {
                r = robots.get(i);
                for (int j = 0; j < robots.size(); j++) {
                    if (j != i && robs[i]==1 && robs[i]==1) {
                        q = robots.get(j);
                        if (r.getX() == q.getX() && r.getY() == q.getY()) {
                            System.out.println(r.getName() + " shuted down ");
                            r.stopRunning();
                            robos--;
                            robs[i]=0;
                        }
                    }
                }

            }
        }
    }
}