/* This is a stub for the Cafe class */
public class Cafe extends Building{

    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory


    public Cafe(String name, String address, int nFloors, int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        super(name, address, nFloors);
        System.out.println("You have built a cafe: ☕");
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
    }
    
    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        if (size >= this.nCoffeeOunces || nSugarPackets >= this.nSugarPackets || nCreams >= this.nCreams || nCups >= 1) {
            this.nCoffeeOunces -= size;
            this.nSugarPackets -= nSugarPackets;
            this.nCreams -= nCreams;
            this.nCups -= 1;
            System.out.println("Here is your coffee with " + size + " sugar packets, and " + nCreams + "creams! Enjoy!");
        }
        else {
            System.out.println("We do not have enough inventory, please wait as we restock!");
            restock(100, 100, 100, 100);
            System.out.println("Restock complete!");
        }
    }

    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
    }
    
    public static void main(String[] args) {
        Cafe myCafe = new Cafe("Lattes of Joy", "122 Drury Lane", 1, 100, 100, 100, 100);
    }
    
}
