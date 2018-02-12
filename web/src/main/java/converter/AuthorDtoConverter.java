package converter;

import dto.AuthorDto;
import model.Author;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class AuthorDtoConverter implements Converter<Author, AuthorDto> {

    @Override
    public AuthorDto convert(Author author) {
        AuthorDto authorDto = new AuthorDto();
        authorDto.setFullName(author.getLastName() + " " + author.getFirstName());
        return authorDto;
    }
}
