package HW;

public class Main {
    public static void main(String[] args) {
        Book autor1 = new Book(new Author("Leo Tolstoy"), "War and piece", 1300, 1867);
        Book autor2 = new Book(new Author("Joanne Harris"), "Blackberry Wine", 414, 2001);
        autor2.setYearOfRelease(2002);
        System.out.println("Book 1: " + autor1.getFullAuthorName() + ", " + autor1.getFullName() + ", " + autor1.getNumberOfPages() + " pages, " + autor1.getYearOfRelease() + " year.");
        System.out.println("Book 2: " + autor2.getFullAuthorName() + ", " + autor2.getFullName() + ", " + autor2.getNumberOfPages() + " pages, " + autor2.getYearOfRelease() + " year.");
    }
}
