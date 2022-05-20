package pro.sky;
import java.util.Objects;

public class Author {

    private final String authorFirstName;
    private final String authorLastName;
    private final String authorFullName;

    public Author(String authorFirstName, String authorLastName, String authorFullName1) {
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
        this.authorFullName = authorFullName1;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public String getAuthorFullName() {
        return authorFullName;
    }

    @Override
    public String toString() {
        return "Book`s author is " + authorFullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return authorFullName.equals(author.authorFullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorFullName);
    }
}
