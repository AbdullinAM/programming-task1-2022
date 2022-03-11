package programming.task1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest{
    @Test
    void addBookTest(){
        Library library = new Library();
        assertTrue(library.addBook("Евгений Онегин", new Book("Александр Сергеевич Пушкин","Роман в стихах","Р19")));
        assertTrue(library.addBook("1984", new Book("Джордж Оруэлл","Роман-антиутопия","А20")));
        assertTrue(library.addBook("Мы", new Book("Евгений Замятин","Роман-антиутопия","Р20")));
        assertTrue(library.addBook("Преступление и наказание", new Book("Федор Михайлович Достоевский","Роман","Р19")));
    }
    @Test
    void deleteBookTest(){
        Library library = new Library();
        assertTrue(library.addBook("1984", new Book("Джордж Оруэлл","Роман-антиутопия","А20")));
        assertTrue(library.addBook("Мы", new Book("Евгений Замятин","Роман-антиутопия","Р20")));
        assertTrue(library.deleteBook("Мы"));
    }
    @Test
    void replaceBookTest(){
        Library library = new Library();
        assertTrue(library.addBook("Мы", new Book("Евгений Замятин","Роман-антиутопи","Р20")));
        assertTrue(library.addBook("Преступление и наказание", new Book("Федор Михайлович Достоевский","Роман","Р19")));
        assertTrue(library.replaceBook("Мы",new Book("Е. Замятин","Роман-антиутопия","Р20")));
    }
    @Test
    void moveBookTest(){
        Library library = new Library();
        assertTrue(library.addBook("Мы", new Book("Евгений Замятин","Роман-антиутопи","Р20")));
        assertTrue(library.addBook("Преступление и наказание", new Book("Федор Михайлович Достоевский","Роман","Р19")));
        assertTrue(library.moveBook("Мы", "P23"));
        assertTrue(library.moveBook("Преступление и наказание", "E56"));
    }
    @Test
    void findBookTest(){
        Library library = new Library();
        assertTrue(library.addBook("Евгений Онегин", new Book("Александр Сергеевич Пушкин","Роман в стихах","Р19")));
        Book expectedBook = new Book("Джордж Оруэлл","Роман-антиутопия","А20");
        assertTrue(library.addBook("1984", expectedBook));
        assertEquals(expectedBook,library.findBook("А20"));
    }
}
