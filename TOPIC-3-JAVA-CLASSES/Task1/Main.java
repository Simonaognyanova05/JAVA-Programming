public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.title = "The Great Gatsby";
        book1.author = "F. Scott Fitzgerald";
        book1.pages = 180;

        Book book2 = new Book();
        book2.title = "To Kill a Mockingbird";
        book2.author = "Harper Lee";
        book2.pages = 281;

        System.out.println("Book 1: " + book1.title + " by " + book1.author + ", Pages: " + book1.pages);
        System.out.println("Book 2: " + book2.title + " by " + book2.author + ", Pages: " + book2.pages);
    }
}
