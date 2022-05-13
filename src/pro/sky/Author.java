package pro.sky;

public class Author {

    private final String authorName;

    public Author(String authorFirstName) {
        this.authorName = authorFirstName;
    }

    public String getAuthorFirstName() {
        return authorName;
    }
}
