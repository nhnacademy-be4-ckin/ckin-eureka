package store.ckin.eureka.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

/**
 * Eureka 서버 보안 설정 클래스입니다.
 *
 * @author 정승조
 * @version 2024. 02. 17.
 */

@EnableWebSecurity(debug = false)
@Configuration
public class SecurityConfig {

    /**
     * Eureka 서버 보안 설정 빈 등록 메서드입니다.
     *
     * @param http HttpSecurity
     * @return SecurityFilterChain
     * @throws Exception 예외
     */
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf()
                .disable()
                .authorizeRequests()
                .anyRequest().authenticated()
                .and()
                .httpBasic();

        return http.build();
    }
}
