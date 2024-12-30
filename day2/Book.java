import java.util.Scanner;

class Book 
{
    String title ;
    String author ;
    String ISBN ;
    boolean availability ;
    int prize ;
    static Scanner sc = new Scanner(System.in);
    Book(String title ,String author ,String ISBN ,boolean availability , int prize )
    {
        this.title = title;
        this.author = author ;
        this.ISBN = ISBN ;
        this.availability = availability ;
        this.prize = prize ;
    }
    Book(boolean availability)
    {
        this.availability = availability ;
    }
    void displayBook()
    {
        System.out.println("---  Book ----");
        System.out.println("Book Title : "+this.title);
        System.out.println("Book author : "+this.author);
        System.out.println("ISBN : "+this.ISBN);
        System.out.println("Book availability : "+this.availability);
        System.out.println("Book prize : "+this.prize);
    }
    void update()
    {
        System.out.println("enter book name to borrow  : ");
        avai = sc.nextBoolean();
        System.out.println("--- Updated Book ---");
        displayBook();
    }
    public static void main(String[] args) {
        
        Book b = new Book("Effective Java", " Joshua Bloch",  "978-0134685991", true, 3000);
        b.displayBook();
        Book b1 = new Book(false);
        b.update();
    }
}