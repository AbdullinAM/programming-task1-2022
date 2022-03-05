package programming.task1;

import java.util.Map;
import java.util.*;

class AddressBook {

    public static class Address {
        private final String street;
        private final int house;
        private final int apartment;

        public Address(String street, int house, int apartment) {
            this.street = street;
            this.house = house;
            this.apartment = apartment;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Address obj = (Address) o;
            return Objects.equals(obj.street, street) && obj.apartment == apartment && obj.house == house;
        }
    }

    private final  Map<String, Address> addressBook;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddressBook that = (AddressBook) o;
        return Objects.equals(addressBook, that.addressBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addressBook);
    }

    public AddressBook(Map<String, Address> addressBook) {
        this.addressBook = addressBook;
    }

    public void add(String people, Address address)  {
        addressBook.put(people, address);
    }

    public void remove(String people)  {
        addressBook.remove(people);
    }

    public void changeAddress(String people, Address address) {
        addressBook.remove(people);
        addressBook.put(people, address);
    }

    public Address gettingAddress (String people)  {
        return addressBook.get(people);
    }

    public Set<String> gettingNameInStreet(Address street ) {
        Set<String> people = new HashSet<>();
        for (String i : addressBook.keySet()) {
            if (addressBook.get(i).street.equals(street.street))
                people.add(i);
        }
        return people;
    }

    public Set<String> gettingNameInHouse(Address house) {
        Set<String> people = new HashSet<>();
        for (String i : addressBook.keySet()) {
            if (addressBook.get(i).street.equals(house.street) && addressBook.get(i).house == house.house)
                people.add(i);
        }
        return people;
    }
}
