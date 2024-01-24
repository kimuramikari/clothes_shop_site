package ac.jp.morijyobi.clothes_shop.service.impl;

import ac.jp.morijyobi.clothes_shop.bean.dto.LoginUserDTO;
//import ac.jp.morijyobi.clothes_shop.mapper.UsersMapper;
import ac.jp.morijyobi.clothes_shop.security.LoginUserDetails;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class LoginUserDetailService {
//    private final UsersMapper usersMapper;
//
//    //インジェクション
//    public LoginUserDetailService(UsersMapper usersMapper){
//
//        this.usersMapper = usersMapper;
//    };
//
//    // ログインロジックメソッド
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        LoginUserDTO user = usersMapper.selectUserByUsername(username);
//
//        //usernameが存在しなく、nullが返ってきたとき
//        if(user==null){
//            throw new UsernameNotFoundException("ユーザーが見つかりません");
//        }
//        return new LoginUserDetails(user);
//    }
}
