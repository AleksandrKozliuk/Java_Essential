package homework1.task3;

public class Book {
    public static void main(String[] args) {
        Title bookTitle = new Title();
        Author bookAuthor = new Author();
        Content bookContent = new Content();

        bookAuthor.setAuthor("Mikhail Bulgakov");
        bookTitle.setTitle("Master and Margarita");
        bookContent.setContent("Vintage Classic");

        bookAuthor.show();
        bookTitle.show();
        bookContent.show();
      }
    }
