package HW;

public class Book {
    private final String fullName;
    private final int numberOfPages;
    private int yearOfRelease;
    private Author fullAuthorName;

    public Book (Author fullAuthorName, String fullName, int numberOfPages, int yearOfRelease) {
        this.fullName = fullName;
        this.numberOfPages = numberOfPages;
        this.yearOfRelease = yearOfRelease;
        this.fullAuthorName = fullAuthorName;
    }

    public Author getFullAuthorName() {
        return fullAuthorName;
    }

    public void setFullAuthorName(Author fullAuthorName) {
        this.fullAuthorName = fullAuthorName;
    }

    public String getFullName() {
        return fullName;
    }
    public int getNumberOfPages() {
        return numberOfPages;
    }
    public int getYearOfRelease() {
        return yearOfRelease;
    }
    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }


}
