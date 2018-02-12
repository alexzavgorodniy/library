package model;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static util.EntityUtil.createAuthor;
import static util.EntityUtil.createBook;

import java.sql.Date;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class BookTest {

    @Rule
    public final ExpectedException thrown = ExpectedException.none();

    @Test
    public void shouldThrowNpeWhenSettingNullAsTitle() {
        //given
        Book book = createBook();
        thrown.expect(NullPointerException.class);
        thrown.expectMessage("Title cannot be NULL!");
        //when
        book.setTitle(null);
    }

    @Test
    public void shouldSetNumberOfPages() {
        //given
        Book book = createBook();
        Integer numberOfPages = 200;
        //when
        book.setNumberOfPages(numberOfPages);
        //then
        assertThat(book.getNumberOfPages(), is(200));
    }

    @Test
    public void shouldSetDateOfRelease() {
        //given
        Book book = createBook();
        String dateInStringFormat = "2017-10-10";
        Date dateOfRelease = Date.valueOf(dateInStringFormat);

        //when
        book.setDateOfRelease(dateOfRelease);
        //then
        assertThat(book.getDateOfRelease(), is(Date.valueOf(dateInStringFormat)));
    }

    @Test
    public void shouldSetAuthor() {
        //given
        Book book = createBook();
        Author author = createAuthor();
        //when
        book.setAuthor(author);
        //then
        assertThat(book.getAuthor(), is(author));
    }
}
