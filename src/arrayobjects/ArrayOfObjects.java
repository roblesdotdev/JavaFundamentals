package arrayobjects;

public class ArrayOfObjects {
    public static void main(String[] args) {
        // array of primitives
        int[] numbers = {1, 2, 3, 4};

        // array of objects
        // arrays are fixed size
        Book[] books = new Book[4];

        books[0] = new Book();
        books[0].setTitle("First book");
        books[1] = new Book();
        books[1].setTitle("Second book");

        for (var b : books) {
            if (b != null) {
                System.out.println(b.getTitle());
            } else {
                System.out.println(b);
            }
        }

        BooksWrapper books2 = new BooksWrapper(5);
        Book b1 = new Book();
        b1.setTitle("New book");
        books2.addBook(b1);
        books2.printBooks();
        System.out.println("The books size is " + books2.getSize());
        Book found = books2.findByTitle("new book");
        if (found != null) {
            System.out.println("Found -> " + found.getTitle());
        } else {
            System.out.println("Not found book!");
        }

    }

}
