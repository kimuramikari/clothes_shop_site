package ac.jp.morijyobi.clothes_shop.bean.entity;

public class Clothes {
    private int id;
    private String clothesName;
    private int unitPrice;
    private int stock;
    private int price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClothesName() {
        return clothesName;
    }

    public void setClothesName(String clothesName) {
        this.clothesName = clothesName;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
