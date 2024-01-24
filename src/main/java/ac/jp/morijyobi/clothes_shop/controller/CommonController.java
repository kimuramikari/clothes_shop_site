package ac.jp.morijyobi.clothes_shop.controller;

import ac.jp.morijyobi.clothes_shop.bean.form.UserForm;
//import ac.jp.morijyobi.clothes_shop.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/common")
public class CommonController {
//    private final UserService userService;
//
//    public CommonController(UserService userService) {
//        this.userService = userService;
//    }
    @GetMapping("/register")
    public String registerUser(Model model){
//        UserForm userForm = new UserForm();
//        model.addAttribute("userForm",userForm);

        return "common/register-user";
    }
}
