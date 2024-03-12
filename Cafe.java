/* This is a stub for the Cafe class */
public class Cafe extends Building{

    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory


    public Cafe(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        super(name);
        System.out.println("You have built a cafe: ☕");
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = 100;
        this.nCups = 100;
    }
    
    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        if (size >= this.nCoffeeOunces || nSugarPackets >= this.nSugarPackets || nCreams >= this.nCreams || nCups >= 1) {
            this.nCoffeeOunces -= 1
        }
    }
    
    public static void main(String[] args) {
        new Cafe();
    }
    
}
