package g30126.pol.paula.l8.e1;

class CoffeeMaker {

    private int i = 1;

    Coffee makeCoffee() throws TooMuchCoffeeException {
        System.out.println("Make a coffee " + i);
        int t = (int)(Math.random()*100);
        int c = (int)(Math.random()*100);
        Coffee coffee = new Coffee(t,c);
        if(i>5) {
            throw new TooMuchCoffeeException("Too much coffee! You already drinked " + i + " cups!");
        }
        i++;
        return coffee;
    }
}