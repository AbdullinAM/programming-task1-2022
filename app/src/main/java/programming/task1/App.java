/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package programming.task1;

import java.util.*;



public class App {

    private final Map<String, Address> addresses = new HashMap<>();

   public boolean addPerson(String name, Address address) {
       if (addresses.containsKey(name)) return false;
       addresses.put(name, address);
       return true;
   }

    public boolean deletePerson(String name) {
        if (!addresses.containsKey(name)) return false;
        addresses.remove(name);
        return true;
    }

    public boolean changeAddress(String name, Address newAddress) {
        if (!addresses.containsKey(name)) return false;
        addresses.replace(name, addresses.get(name), newAddress);
        return true;
    }

    public Address getAddressByName(String name) {
        for (String key : addresses.keySet()) {
            if (key.equals(name)) return addresses.get(key);
        }
        return null;
    }

    public List<String> getNamesByStreet(Address address) {
        List<String> names = new ArrayList<>();
        for (String key : addresses.keySet()) {
            if (addresses.get(key).getStreet().equals(address.getStreet())) names.add(key);
        }
        return names;
    }

    public List<String> getNamesByHome(Address address) {
        List<String> names = new ArrayList<>();
        for (String key : addresses.keySet()) {
            if (addresses.get(key).getStreet().equals(address.getStreet()) && addresses.get(key).getHome().equals(address.getHome())) names.add(key);
        }
        return names;
    }
}

class Address {

    private String street;
    private String home;
    private String flat;

    public Address(String street, String home, String flat) {
        this.street = street;
        this.home = home;
        this.flat = flat;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getFlat() {
        return flat;
    }

    public void setFlat(String flat) {
        this.flat = flat;
    }
}

