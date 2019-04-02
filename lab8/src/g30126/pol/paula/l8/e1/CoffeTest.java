package g30126.pol.paula.l8.e1;

public class CoffeTest {
    public static void main(String[] args) {
        CoffeeMaker mk = new CoffeeMaker();
        CoffeeDrinker d = new CoffeeDrinker();

        for(int i = 0;i<15;i++){
            try {
                Coffee c = mk.makeCoffee();
                try {
                    d.drinkCoffee(c);
                } catch (TemperatureException e) {
                    System.out.println("Exception:"+e.getMessage()+" temp="+e.getTemp());
                } catch (ConcentrationException e) {
                    System.out.println("Exception:"+e.getMessage()+" conc="+e.getConc());
                }
                finally{
                    System.out.println("Throw the cofee cup.\n");
                }
            } catch (TooMuchCoffeeException e) {
                System.out.println("Exception: " + e.getMessage());
            }

        }
    }
}