package util;

import model.Author;
import model.Book;

public final class EntityUtil {

    private EntityUtil() {
    }

    public static Book createBook() {
        return new Book("King");
    }

    public static Author createAuthor() {
        return new Author("James");
    }
}
