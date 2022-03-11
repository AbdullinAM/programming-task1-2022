package programming.task1;

import java.util.HashMap;

public class Library {

    private final HashMap<String, Book> bookList = new HashMap<>();

    public boolean addBook(String title, Book book){
    if (bookList.containsKey(title)) return false;
    bookList.put(title, book);
    return true;
    }

    public boolean deleteBook(String title){
        if (!bookList.containsKey(title)) return false;
        bookList.remove(title);
        return true;
    }

    public boolean replaceBook(String title, Book newBook){
        if (!bookList.containsKey(title)) return false;
        bookList.replace(title, bookList.get(title), newBook);
        return true;
    }

    public boolean moveBook(String title, String code){
        if (!bookList.containsKey(title)) return false;
        bookList.get(title).setCode(code);
        return true;
    }
    public Book findBook(String parameter){
        for (String title: bookList.keySet()) {
            if (bookList.get(title).search(parameter) || title.equals(parameter)) return bookList.get(title);
        }
        throw new IllegalArgumentException();
    }
}

class Book{
    private String author;
    private String genre;
    private String code;

    public Book(String author, String genre, String code){
        this.author = author;
        this.genre = genre;
        this.code = code;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getGenre(){
        return genre;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public String getCode(){
        return code;
    }

    public void setCode(String code){
        this.code = code;
    }

    public boolean search(String parameter){
        return (parameter.equals(author) || author.contains(parameter)) || (parameter.equals(genre) || genre.contains(parameter)) || (parameter.equals(code) || code.contains(parameter));
    }
}
