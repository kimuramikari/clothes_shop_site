package ac.jp.morijyobi.clothes_shop.controller;

import ac.jp.morijyobi.clothes_shop.bean.form.ClothesForm;
import ac.jp.morijyobi.clothes_shop.service.ClothesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/shop")
public class ShopController {
private final ClothesService clothesService;

    public ShopController(ClothesService clothesService) {
        this.clothesService = clothesService;
    }

    @GetMapping("/list")
    public String list(Module model){
        return "shop/list";

    }
    @GetMapping("/register")
    public String registerClothes(Model model){
        ClothesForm clothesForm = new ClothesForm();
        model.addAttribute("clothedForm",clothesForm);
        return"shop/registerclothes";

    }
    @PostMapping("/register")
    public String registerExe(@Validated ClothesForm clothesForm,
                              BindingResult bindingResult,
                              RedirectAttributes redirectAttributes,
                              Model model) {
        if(bindingResult.hasErrors()){
            return "shop/registerclothes";
        }
        clothesService.registerClothes(clothesForm);
        redirectAttributes.addFlashAttribute("message","商品の登録が完了しました。");
        return "redirect:/shop/register";
    }
}
