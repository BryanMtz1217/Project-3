public class Main
{
    public static void main(String[] args)
    {
        Author author = new Author("Neal Shusterman", "neal.shusterman@example.com", "American");
        
        Book book = new Book("Scythe", 12.99, author);

        System.out.println(book.toString());
        
    }
}