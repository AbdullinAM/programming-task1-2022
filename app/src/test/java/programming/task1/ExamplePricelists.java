package programming.task1;

public class ExamplePricelists {
    public static PriceList getPriceListForAddProductsTest (){
        PriceList priceList = new PriceList();
        priceList.addNewProduct("СамсунгА777", 305282, 23000);
        priceList.addNewProduct("Айфон2", 693947, 123000);
        priceList.addNewProduct("Нокиа3309", 343998, 1099.99);
        return priceList;
    }

    public static PriceList getPriceListForChangeNameTest (){
        PriceList priceList = new PriceList();
        priceList.addNewProduct("СамсунгА777", 305282, 23000);
        priceList.addNewProduct("Iphone 2", 693947, 123000);
        priceList.addNewProduct("Нокиа3310", 343998, 1099.99);
        return priceList;
    }

    public static PriceList getPriceListForSetNewPriceTest (){
        PriceList priceList = new PriceList();
        priceList.addNewProduct("СамсунгА777", 305282, 89000.50);
        priceList.addNewProduct("Айфон2", 693947, 200000);
        priceList.addNewProduct("Нокиа3309", 343998, 1099.99);
        return priceList;
    }

    public static PriceList getPriceListForDeleteTest (){
        PriceList priceList = new PriceList();
        priceList.addNewProduct("Нокиа3309", 343998, 1099.99);
        return priceList;
    }


}
