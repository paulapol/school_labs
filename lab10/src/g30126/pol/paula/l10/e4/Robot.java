package g30126.pol.paula.l10.e4;


import java.util.Random;

public class Robot extends  Thread{
    private int x,y;
    private boolean run = true;

    Robot(String name,int x, int y)
{
    super(name);
    this.x = x;
    this.y = y;
}
    public int moveLeft(){
    if(this.x>0)
          {setX(x-1);return 1;}
    else return 0;
    }
    public int moveRight(){
        if(this.x<100)
            {setX(x+1); return 1;}
        else return 0;
    }
    public int moveUp(){
        if(this.y>0)
               {setY(y-1); return 1;}
        else return 0;
    }
    public int  moveDown(){
        if(this.y<100)
             {setY(y+1); return 1;}
        else return  0;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void stopRunning(){
        run = false;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void run(){
    Random r = new Random();
    while(run)
    {           int k = r.nextInt(4);
    int c=0;
    while(c==0) {
        if (k == 0) {
            if (moveDown() == 1) {
                c = 1;
                System.out.println(getName() + " moved  down  i = " + x + " j = " + y);
            } else k = 1;
        }
        if (k == 1) {
            if (moveUp() == 1) {
                c = 1;
                System.out.println(getName() + " moved  up    i = " + x + " j = " + y);
            } else k = 2;
        }
        if (k == 2) {
            if (moveLeft() == 1) {
                c = 1;
                System.out.println(getName() + " moved  left  i = " + x + " j = " + y);
            } else k = 3;
        }
        if (k == 3) {
            if (moveRight() == 1) {
                c = 1;
                System.out.println(getName() + " moved  right i = " + x + " j = " + y);
            } else k = 0;
        }

    }try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public static void main(String[] args) {
        Robot r = new Robot("robotel", 5,5);
        r.start();
    }
}