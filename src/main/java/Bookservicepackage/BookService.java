package Bookservicepackage;
import Book.Package.Book;
import java.util.HashSet;

public interface BookService {
    HashSet<Book> findAllBook();

    Book findBookByID(Long id);

    void addBook(Book b);
    void deleteAllData();
}
