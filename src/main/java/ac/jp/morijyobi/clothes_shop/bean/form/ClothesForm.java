package ac.jp.morijyobi.clothes_shop.bean.form;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class ClothesForm {
    @NotBlank
    @Size(max = 64)
    private String clothedName;
    @NotBlank
    @Size(min=3,max = 60)
    private int unitPrice;
    @NotBlank
    @Size(min =1 ,max = 60)
    private int stock;
    @NotBlank
    @Size(min=3, max = 60)
    private  int price;

    public String getClothedName() {
        return clothedName;
    }

    public void setClothedName(String clothedName) {
        this.clothedName = clothedName;
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
