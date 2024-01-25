package ac.jp.morijyobi.clothes_shop.service;

import ac.jp.morijyobi.clothes_shop.bean.entity.Clothes;
import ac.jp.morijyobi.clothes_shop.bean.form.ClothesForm;

import java.util.List;

public interface ClothesService {
    Clothes registerClothes(ClothesForm clothesForm);//コントローラーから受け取ったものを引数で受け渡している。



}
