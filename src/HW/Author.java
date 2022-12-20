package HW;

public class Author {
    private final String fullAuthorName;
    public Author (String fullAuthorName) {
        this.fullAuthorName = fullAuthorName;
    }
    @Override
    public String toString() {
        return  fullAuthorName;
    }
}
