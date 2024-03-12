import java.util.Hashtable;
/* This is a stub for the Library class */
public class Library extends Building {

  private Hashtable<String, Boolean> collection;

    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);
      collection = new Hashtable<String, Boolean>(collection);
      System.out.println("You have built a library: 📖");
    }
  
    public void addTitle(String title) {
      this.collection.put(title, true); // This assumes that there can be multiple of a book
    }

    public String removeTitle(String title) {
      if (collection.contains(title)){
        this.collection.remove(title);
        return "This book has been removed from the library.";
      }
      else {
        return "There is no such book in the library!";
      }
    }

    public void checkOut(String title) {
      if (collection.contains(title)){
        this.collection.replace(title, true, false);
      }
      else {
        System.out.println("We do not have this book, or it has been checked out.");
      }
    }

    public void returnBook(String title) {
      this.collection.replace(title, false, true);
    }

    public boolean containsTitle(String title){
      return collection.containsKey(title);
    } // returns true if the title appears as a key in the Libary's collection, false otherwise


    public boolean isAvailable(String title) {
      //????
    } // returns true if the title is currently available, false otherwise


    public void printCollection() {

    } // prints out the entire collection in an easy-to-read way (including checkout status)



    public static void main(String[] args) {
      Library myLibrary = new Library("Local Library", "124 Drury Lane", 2);
    }
  
  }