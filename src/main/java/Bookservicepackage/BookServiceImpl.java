package Bookservicepackage;
import Book.Package.Book;

import java.util.HashSet;

public class BookServiceImpl implements BookService{
    HashSet<Book> booklist = new HashSet<Book>(); // A book list hat stores books

   @Override
    public HashSet<Book> findAllBook() {
       if (booklist.isEmpty())
           return null;
       else
           return booklist;
   }

    @Override
    public Book findBookByID(Long id) {
        return null;
    }

   @Override
    public void addBook(Book b){
       booklist.add(b);
   }

    @Override
    public void deleteAllData() {
        booklist.clear();
    }
}
