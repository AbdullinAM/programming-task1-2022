package programming.task1;

public class ExamplePricelists {
    public static PriceList getPriceListForAddProductsTest (){
        PriceList priceList = new PriceList();
        priceList.addNewProduct("��������777", 305282, 23000);
        priceList.addNewProduct("�����2", 693947, 123000);
        priceList.addNewProduct("�����3309", 343998, 1099.99);
        return priceList;
    }

    public static PriceList getPriceListForChangeNameTest (){
        PriceList priceList = new PriceList();
        priceList.addNewProduct("��������777", 305282, 23000);
        priceList.addNewProduct("Iphone 2", 693947, 123000);
        priceList.addNewProduct("�����3310", 343998, 1099.99);
        return priceList;
    }

    public static PriceList getPriceListForSetNewPriceTest (){
        PriceList priceList = new PriceList();
        priceList.addNewProduct("��������777", 305282, 89000.50);
        priceList.addNewProduct("�����2", 693947, 200000);
        priceList.addNewProduct("�����3309", 343998, 1099.99);
        return priceList;
    }

    public static PriceList getPriceListForDeleteTest (){
        PriceList priceList = new PriceList();
        priceList.addNewProduct("�����3309", 343998, 1099.99);
        return priceList;
    }


}
