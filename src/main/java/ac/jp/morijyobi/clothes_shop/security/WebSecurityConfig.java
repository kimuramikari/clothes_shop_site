package ac.jp.morijyobi.clothes_shop.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws  Exception {
        http
                .authorizeHttpRequests(requests -> requests
                        .requestMatchers("/").permitAll()
                        .requestMatchers("/common/**").permitAll()
                ).formLogin(login -> login
                .loginProcessingUrl("/login") //ログイン処理のURLを指定している。ユーザID・PWの送信先URL(POST)
                .loginPage("/login") //ログイン画面のURL --　GET
                .defaultSuccessUrl("/") //ログイン成功時のリダイレクト先URL
                .failureUrl("/login?error")//ログイン失敗時のリダイレクト先URL
                .permitAll() //ログイン画面のアクセス権限の設定(すべて許可)
                );
        return http.build();
    }
//    パスワードのエンコーダーを追加
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

}
