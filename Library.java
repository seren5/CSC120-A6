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
      this.collection.replace(title, true, false);
    }

    public void returnBook(String title) {
      this.collection.replace(title, false, true);
    }


    public static void main(String[] args) {
      Library myLibrary = new Library("Local Library", "124 Drury Lane", 2);
    }
  
  }