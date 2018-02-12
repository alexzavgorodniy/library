import config.JpaConfig;
import java.util.List;
import model.Book;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import repositories.BookRepository;

public class LibraryCoreRun {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                JpaConfig.class);
        System.out.println(context.getApplicationName());
        BookRepository repository = context.getBean(BookRepository.class);

        Book book = new Book("King");
        book.setNumberOfPages(200);
        repository.save(book);
        List<Book> bookList = repository.findAll();
        System.out.println(bookList.get(0).getTitle());
    }

}
