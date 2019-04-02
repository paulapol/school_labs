package g30126.pol.paula.l8.e1;

public class ConcentrationException extends Throwable {
    int c;
    public ConcentrationException(int c,String msg) {
        super(msg);
        this.c = c;
    }

    int getConc(){
        return c;
    }
}