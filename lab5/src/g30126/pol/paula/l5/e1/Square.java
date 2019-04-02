package g30126.pol.paula.l5.e1;


public class Square extends Rectangle {
    public Square(){
    }

    public Square(double side){
        super(side,side);
    }

    public Square(double side,String colour,boolean filled){
        super(side,side,colour,filled);
    }

    public double getSide(){
        return super.getLength();
    }

    public void setSide(){
        super.setLength(2.0);
    }

    @Override
    public void setLength(double side){
            super(side,side);
    }

    @Override
    public void setWidth(double side){
        super(side,side);
    }

    @Override
    public String toString(){
        return "Square{ "+
                " colour= "+color
                +" filled="+filled
                +" side="+length;
    }



}
