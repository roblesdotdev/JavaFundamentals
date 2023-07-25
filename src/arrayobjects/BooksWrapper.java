package arrayobjects;

public class BooksWrapper {
    private final Book[] books;
    private final int size;

    public BooksWrapper(int size) {
        this.books = new Book[size];
        this.size = size;
    }

    public void addBook(Book book) {
        int firstPosition = -1;
        for (int i = 0; i < books.length; i++) {
            if (firstPosition == -1 && books[i] == null) {
                firstPosition = i;
            }
        }
        if (firstPosition == -1) {
            System.out.println("Sorry the array is full");
        } else {
            books[firstPosition] = book;
        }
    }

    public void printBooks() {
        for (var book : books) {
            if (book != null) {
                System.out.println("Book -> " + book.getTitle());
            }
        }
    }

    public int getSize() {
        return this.size;
    }

    public Book findByTitle(String title) {
        for (var b : books) {
            if (b.getTitle().equalsIgnoreCase(title))  {
                return b;
            }
        }
        return null;
    }
}
