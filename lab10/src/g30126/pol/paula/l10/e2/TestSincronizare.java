package g30126.pol.paula.l10.e2;

public class TestSincronizare {

	public static void main(String[] args) {
	    Punct p = new Punct();
	    FirSet fs1 = new FirSet(p);
	    FirGet fg1 = new FirGet(p);
	 
	    fs1.start();
	    fg1.start();
	}
}

