package repositories;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static util.EntityUtil.createAuthor;

import javax.persistence.EntityManager;
import model.Author;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import util.RepositoryIT;

public class AuthorRepositoryIT extends RepositoryIT {

    @Autowired
    private AuthorRepository repository;
    @Autowired
    private EntityManager entityManager;

    @Test
    public void shouldSaveAuthor() {
        //given
        Author author = createAuthor();
        //when
        repository.save(author);
        //then
        Author maybeAuthor = entityManager
                .createQuery("SELECT a FROM Author a", Author.class).getSingleResult();
        assertThat(maybeAuthor.getFirstName(), is("James"));
    }
}
