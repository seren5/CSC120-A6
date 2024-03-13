public class Building {

    protected String name = "<Name Unknown>";
    protected String address = "<Address Unknown>";
    protected int nFloors = 1;

    /**
     * Creates a building with a name, address, and a number of floors
     * @param name
     * @param address
     * @param nFloors
     */
    public Building(String name, String address, int nFloors) {
        if (name != null) { this.name = name; }
        if (address != null) { this.address = address; } 
        if (nFloors < 1) {
            throw new RuntimeException("Cannot construct a building with fewer than 1 floor.");
        }
        this.nFloors = nFloors;
    }

    /**
     * Returns the name of the building
     * @return this.name (The name of the building)
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns the address of the building
     * @return this.address (The address of the building)
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Returns the number of floors
     * @return this.nFloors (The number of floors)
     */
    public int getFloors() {
        return this.nFloors;
    }

    /**
     * Returns information about the building
     */
    public String toString() {
        return this.name + " is a " + this.nFloors + "-story building located at " + this.address;
    }

    public static void main(String[] args) {
        Building fordHall = new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4);
        System.out.println(fordHall);
    }

}
