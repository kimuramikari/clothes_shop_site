package ac.jp.morijyobi.clothes_shop.service;

import ac.jp.morijyobi.clothes_shop.bean.entity.User;
import ac.jp.morijyobi.clothes_shop.bean.form.UserForm;

public interface UserService {
    User registerUser(UserForm userForm);
}
