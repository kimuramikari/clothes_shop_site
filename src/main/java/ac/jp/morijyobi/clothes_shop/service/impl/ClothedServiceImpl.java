package ac.jp.morijyobi.clothes_shop.service.impl;

import ac.jp.morijyobi.clothes_shop.bean.entity.Clothes;
import ac.jp.morijyobi.clothes_shop.bean.form.ClothesForm;
import ac.jp.morijyobi.clothes_shop.mapper.ClothesMapper;
import ac.jp.morijyobi.clothes_shop.service.ClothesService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClothedServiceImpl implements ClothesService {
    private final ClothesMapper clothesMapper;

    public ClothedServiceImpl(ClothesMapper clothesMapper) {
        this.clothesMapper = clothesMapper;
    }

    @Override
    @Transactional
    public Clothes registerClothes(ClothesForm clothesForm) {
        Clothes clothes = new Clothes();
        clothes.setClothesName(clothesForm.getClothedName());
        clothes.setUnitPrice(clothesForm.getUnitPrice());
        clothes.setStock(clothesForm.getStock());
        clothes.setPrice(clothesForm.getPrice());
        clothesMapper.insertClothes(clothes);
        return null;
    }
}
