package g30126.pol.paula.l8.e1;

class Coffee{
    private int temp;
    private int conc;

    Coffee(int t,int c){
        temp = t;
        conc = c;
    }
    int getTemp(){return temp;}
    int getConc(){return conc;}
    public String toString(){return "[cofee temperature="+temp+":concentration="+conc+"]";}
}