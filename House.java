/* This is a stub for the House class */

import java.util.ArrayList;

public class House extends Building{

  private ArrayList<String> residents; // The <String> tells Java what kind of data we plan to store IN the ArrayList
  private boolean hasDiningRoom;

  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    super(name, address, nFloors);
    residents = new ArrayList<String>(residents);
    System.out.println("You have built a house: 🏠");
    this.hasDiningRoom = hasDiningRoom;
  }

  public boolean hasDiningRoom() {
    return this.hasDiningRoom;
  }
  
  public int nResidents(){
    return this.residents.size();
  }

  public void moveIn(String name) {
    if (!residents.contains(name)){
      residents.add(name);
    }
    else {
      // throw and catch exception
    }
  }

  public String moveOut(String name) {
    if (residents.contains(name)){
      residents.remove(name);
      return name + "has moved out.";
    }
    else {
      return name + "does not live in this building.";
    }
  }

  public boolean isResident(String person){
    if (residents.contains(person)){
      return true;
    } else{
      return false;
    }
  }

  public static void main(String[] args) {
    House myHouse = new House("Emily's House", "123 Drury Lane", 3, true);
  }

}