import java.util.*;
import java.util.UUID;

class Book {
    private UUID id;
    private String judul;
    private String penulis;
    private String kategori;

    public Book(String judul, String penulis, String kategori) {
        this.id = UUID.randomUUID();
        this.judul = judul;
        this.penulis = penulis;
        this.kategori = kategori;
    }

    public UUID getId() {
        return this.id;
    }

    public String getJudul() {
        return this.judul;
    }

    public String getPenulis() {
        return this.penulis;
    }

    public String getKategori() {
        return this.kategori;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

}

public class Eksplorasi {
    private static ArrayList<Book> listBooks = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Menu program");
            System.out.println("1. Create a new book");
            System.out.println("2. Get all books");
            System.out.println("3. get book by ID");
            System.out.println("4. Update Book");
            System.out.println("5. Delete Book");
            System.out.println("6. Exit");
            System.out.print("Please enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    createBook();
                    break;
                case 2:
                    getAllBooks();
                    break;
                case 3:
                    getBookById();
                    break;
                case 4:
                    updateBook();
                    break;
                case 5:
                    deleteBook();
                    break;
                case 6:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Please enter a valid choice");
            }
        }
    }

    private static void createBook() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter book title: ");
        String judul = scanner.nextLine();

        System.out.print("Please enter book author: ");
        String penulis = scanner.nextLine();

        System.out.print("Please enter book category: ");
        String kategori = scanner.nextLine();

        Book book = new Book(judul, penulis, kategori);
        listBooks.add(book);
        System.out.println("Book created!");
    }

    private static void getAllBooks() {
        for (Book book : listBooks) {
            System.out.println("ID: " + book.getId());
            System.out.println("Title: " + book.getJudul());
            System.out.println("Author: " + book.getPenulis());
            System.out.println("Category: " + book.getKategori());
            System.out.println("--------------------------");
        }
    }

    private static void getBookById() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter book ID: ");
        UUID id = UUID.fromString(scanner.nextLine());

        for (Book book : listBooks) {
            if (book.getId().equals(id)) {
                System.out.println("ID: " + book.getId());
                System.out.println("Title: " + book.getJudul());
                System.out.println("Author: " + book.getPenulis());
                System.out.println("Category: " + book.getKategori());
                System.out.println("--------------------------");
            }
        }
    }

    private static void updateBook() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter book ID: ");
        UUID id = UUID.fromString(scanner.nextLine());

        for (Book book : listBooks) {
            if (book.getId().equals(id)) {
                System.out.print("Please enter new book title: ");
                String judul = scanner.nextLine();
                book.setJudul(judul);

                System.out.print("Please enter new book author: ");
                String penulis = scanner.nextLine();
                book.setPenulis(penulis);

                System.out.print("Please enter new book category: ");
                String kategori = scanner.nextLine();
                book.setKategori(kategori);

                System.out.println("Book updated!");
            }
        }
    }

    private static void deleteBook() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter book ID: ");
        UUID id = UUID.fromString(scanner.nextLine());

        for (Book book : listBooks) {
            if (book.getId().equals(id)) {
                listBooks.remove(book);
                System.out.println("Book deleted!");
            }
        }
    }
}