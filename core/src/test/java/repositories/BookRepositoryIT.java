package repositories;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static util.EntityUtil.createBook;

import javax.persistence.EntityManager;
import model.Book;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import util.RepositoryIT;

public class BookRepositoryIT extends RepositoryIT {

    @Autowired
    private BookRepository repository;

    @Autowired
    private EntityManager entityManager;

    @Test
    public void shouldSaveBook() {
        //given
        Book book = createBook();

        //when
        Book savedBook = repository.save(book);
        //then
        Book maybeBook = entityManager.createQuery("SELECT b FROM Book b", Book.class)
                .getSingleResult();
        assertThat(maybeBook.getTitle(), is("King"));
    }
}
