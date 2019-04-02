package g30126.pol.paula.l8.e1;

class CoffeeDrinker{
    void drinkCoffee(Coffee c) throws TemperatureException, ConcentrationException{
        if(c.getTemp()>60)
            throw new TemperatureException(c.getTemp(),"Coffee is to hot!");
        if(c.getConc()>50)
            throw new ConcentrationException(c.getConc(),"Coffee concentration to high!");
        System.out.println("Drink coffee:"+c);
    }
}