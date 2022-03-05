package programming.task1;

import programming.task1.AddressBook.Address;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class AddressBookTest {

    @Test
    public void add() {
        AddressBook book = new AddressBook(new HashMap<>());
        book.add("Иванов", new Address("Типанова", 19, 154));
        book.add("Крикун", new Address("Кузнецовская", 10, 7));
        Map<String, Address> addresses = new HashMap<>();
        addresses.put("Иванов", new Address("Типанова", 19, 154));
        addresses.put("Крикун", new Address("Кузнецовская", 10, 7));
        assertEquals(book, new AddressBook(addresses));
    }

    @Test
    public void remove() {
        Map<String, Address> addresses = new HashMap<>();
        addresses.put("Иванов", new Address("Типанова", 19, 154));
        addresses.put("Казакова", new Address("Кузнецовская", 7, 10));
        AddressBook book = new AddressBook(addresses);
        book.remove("Иванов");
        book.remove("Казакова");
        Map<String, Address> addresses1 = new HashMap<>();
        assertEquals(book, new AddressBook(addresses1));
    }
    @Test
    public void changeAddress() {
        Map<String, Address> addresses = new HashMap<>();
        addresses.put("Иванов", new Address("Типанова", 19, 154));
        AddressBook book = new AddressBook(addresses);
        book.changeAddress("Иванов", new Address("Ленинский", 55, 2));
        Map<String, Address> addresses1 = new HashMap<>();
        addresses1.put("Иванов", new Address("Ленинский", 55, 2));
        assertEquals(book, new AddressBook(addresses1));

        Map<String, Address> addressesOne = new HashMap<>();
        addressesOne.put("Казакова", new Address("Кузнецовская", 7, 10));
        addressesOne.put("Казаков", new Address("Кузнецовская", 7, 10));
        AddressBook book1 = new AddressBook(addressesOne);
        book1.changeAddress("Казакова", new Address("Ленсовета", 57, 2));
        Map<String, Address> addresses2= new HashMap<>();
        addresses2.put("Казакова", new Address("Ленсовета", 57, 2));
        addresses2.put("Казаков", new Address("Кузнецовская", 7, 10));
        assertEquals(book1, new AddressBook(addresses2));

    }


    @Test
    public void gettingAddress() {
        Map<String, Address> addresses = new HashMap<>();
        addresses.put("Иванов", new Address("Типанова", 19, 154));
        addresses.put("Казакова", new Address("Кузнецовская", 7, 10));
        AddressBook book = new AddressBook(addresses);
        assertEquals(book.gettingAddress("Иванов"), new Address("Типанова", 19, 154));
    }


    @Test
    public void gettingNameInStreet() {
        AddressBook book = new AddressBook(new HashMap<>());
        book.add("Иванов", new Address("Типанова", 19, 154));
        book.add("Крикун", new Address("Кузнецовская", 10, 7));
        book.add("Казакова", new Address("Кузнецовская", 7, 10));
        book.add("Дождёва", new Address("Варшавская", 34, 55));
        book.add("Гочуа", new Address("Кузнецовская", 5, 13));
        Set<String> result = new HashSet<>();
        result.add("Крикун");
        result.add("Казакова");
        result.add("Гочуа");
        assertEquals(result, book.gettingNameInStreet(new Address("Кузнецовская" , 10, 7 )));

    }

    @Test
    public void gettingNameInHouse() {
       AddressBook book = new AddressBook(new HashMap<>());
       book.add("Иванов", new Address("Типанова", 19, 154));
       book.add("Крикун", new Address("Кузнецовская", 10, 7));
       book.add("Казакова", new Address("Кузнецовская", 7, 10));
       book.add("Дождёва", new Address("Типанова", 19, 77));
       book.add("Гочуа", new Address("Кузнецовская", 5, 13));
       Set<String> result = new HashSet<>();
       result.add("Иванов");
       result.add("Дождёва");
       assertEquals(result, book.gettingNameInHouse(new Address("Типанова", 19, 77)));

    }
}


