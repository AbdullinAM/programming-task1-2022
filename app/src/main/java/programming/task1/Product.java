package programming.task1;

import java.util.HashMap;
import java.util.Objects;

public class Product{

    public HashMap <Integer, App> list;

    public Product(){
        list = new HashMap<>();
    }

    public void toAdd(int index, App app){
        list.put(index, app);
    }

    public void toRemove(int index){
        list.remove(index);
    }

    public void toReplace(double newPrice, int index) {
        App newList = list.get(index);
        newList.setPriceProduct(newPrice);
    }

    public void toReplace(String newName, int index){
        App newList = list.get(index);
        newList.setNameProduct(newName);
    }

    public double getFullPrice(int index, int count){
        return list.get(index).getPriceProduct() * count;
    }

    @Override
    public boolean equals(Object object){
        if (this == object)
            return true;
        if (object == null || getClass() != object.getClass())
            return false;
        Product thisObject = (Product) object;
        return Objects.equals(list, thisObject.list);
    }

}

