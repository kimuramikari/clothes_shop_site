package ac.jp.morijyobi.clothes_shop.bean.form;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UserForm {
    @NotBlank
    @Size(min = 5, max = 64)
    private String username;
    @NotBlank
    @Size(min = 8, max = 64)
    private String password;
    @NotBlank
    @Size(max = 255)
    private String name;
    @Size(max = 255)
    private  String address;
    @Size(max = 255)
    private String email;
    @Size(max = 64)
    private int tel;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }
}
