package pro.sky;

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
}
