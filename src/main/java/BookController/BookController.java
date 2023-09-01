package BookController;
import Book.Package.Book;
import Bookservicepackage.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.HashSet;

@RestController

public class BookController {
    @Autowired
    BookServiceImpl bookServiceImpl;

       @PostMapping ("/addbook")
        public ResponseEntity<String> addBook(@RequestBody Book book){

           bookServiceImpl.addBook(book);
           System.out.println(book);
           return ResponseEntity.badRequest().body("Book not added");

       }

       @GetMapping("/findall")
    public HashSet<Book> getAllBook(){
           return bookServiceImpl.findAllBook();
       }
       @GetMapping("/findbyid/{id}")
           public Book getbookById(@PathVariable long id) {
               return bookServiceImpl.findBookByID(id);
           }
           @DeleteMapping("/delete")
        public void deleteBook(){
           bookServiceImpl.deleteAllData();
           }

}
