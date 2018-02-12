package converter;

import dto.BookDto;
import model.Book;
import org.springframework.core.convert.converter.Converter;

public class BookDtoConverter implements Converter<Book, BookDto> {

    @Override
    public BookDto convert(Book book) {
        BookDto bookDto = new BookDto();
        return bookDto;
    }
}
