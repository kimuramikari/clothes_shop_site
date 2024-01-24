package ac.jp.morijyobi.clothes_shop.mapper;

import ac.jp.morijyobi.clothes_shop.bean.dto.LoginUserDTO;
import ac.jp.morijyobi.clothes_shop.bean.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UsersMapper {
    @Select("SELECT u.id, u.username, u.password, u.name, a.authority " +
            "FROM users AS u " +
            "INNER JOIN authorities AS a ON a.id = u.authority_id " +
            "WHERE u.username = #{username}")
    LoginUserDTO selectUserByUsername(String username);

    @Insert("INSERT INTO users VALUES (default, #{username}, #{password}," +
            " #{name}, #{authorityId})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insertUser(User user);
}
