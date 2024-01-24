package ac.jp.morijyobi.clothes_shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/shop")
public class ShopController {
    @GetMapping("/list")
    public String list(Module model){
        return "shop/list";
    }
}
