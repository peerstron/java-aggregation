public class BasicTwo {

    static {
        System.out.println("******* JAVA Aggregation *********");
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Has-A Relationship");

        Publisher publisher = new Publisher("Tronix Publications", "Accra");
        Author author = new Author("Ebenezer Nyarko", 67);
        Book book = new Book("My First Day At Work", "Adventure", publisher, author);

        System.out.println();
        System.out.println("********* Book Details ***********");
        System.out.println();
        System.out.println("Title: " + book.title);
        System.out.println("Genre: " + book.genre);
        System.out.println("Author: " + author.name);
        System.out.println("Author's Age: " + author.age + "years");
        System.out.println("Publisher: " + publisher.name);
        System.out.println("Publisher's Address: " + publisher.city);
    }

    static class Publisher {
        String name;
        String city;

        Publisher(String n, String c) {
            name = n;
            city = c;
        }
    }

    static class Author {
        String name;
        int age;

        Author(String n, int a) {
            name = n;
            age = a;
        }
    }

    static class Book {
        String title;
        String genre;
        Publisher publisher;
        Author author;

        Book(String t, String g, Publisher p, Author a) {
            title = t;
            genre = g;
            publisher = p;
            author = a;
        }
    }
}
