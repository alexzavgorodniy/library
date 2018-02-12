package model;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static util.EntityUtil.createAuthor;
import static util.EntityUtil.createBook;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class AuthorTest {

    @Rule
    public final ExpectedException thrown = ExpectedException.none();

    @Test
    public void shouldThrowNpeWhenSettingNullAsFirstName() {
        //given
        Author author = createAuthor();
        thrown.expect(NullPointerException.class);
        thrown.expectMessage("First name cannot be NULL!");
        //when
        author.setFirstName(null);
    }

    @Test
    public void shouldAddBookIntoList() {
        //given
        Author author = createAuthor();
        Book book = createBook();
        //when
        author.addBook(book);
        //then
        assertThat(author.getBookList().get(0).getTitle(),is("King"));
        assertThat(author.getBookList().get(0).getAuthor().getFirstName(), is("James"));
    }

    @Test
    public void shouldRemoveBookFromList() {
        //given
        Author author = createAuthor();
        Book book = createBook();
        author.addBook(book);
        //when
        author.removeBook(book);
        //then
        assertThat(author.getBookList().size(),is(0));
    }
}
