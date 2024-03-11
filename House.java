/* This is a stub for the House class */

import java.util.ArrayList;

public class House extends Building{

  private ArrayList<String> residents; // The <String> tells Java what kind of data we plan to store IN the ArrayList
  private boolean hasDiningRoom;

  public House(Building name) {
    super(name);
    residents = new residents("");
    System.out.println("You have built a house: 🏠");
  }

  public boolean hasDiningRoom() {
    // what goes here
  }
  
  public int nResidents();

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
      // throw and catch exception
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
    new House();
  }

}