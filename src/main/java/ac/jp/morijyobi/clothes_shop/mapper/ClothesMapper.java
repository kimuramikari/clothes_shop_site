package ac.jp.morijyobi.clothes_shop.mapper;

import ac.jp.morijyobi.clothes_shop.bean.entity.Clothes;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ClothesMapper {
//    服の登録
    @Insert("INSERT INTO clothes VALUES (default,#{clothesName},#{unitPrice},#{stock},#{price})")
    void insertClothes(Clothes clothes);
//    服一覧の呼び出し

//    服の削除

//    服の編集

}
