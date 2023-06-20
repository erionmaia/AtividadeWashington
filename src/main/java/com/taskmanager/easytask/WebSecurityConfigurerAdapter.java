package com.taskmanager.easytask;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfigurerAdapter {

    private static final String[] WHITE_LIST_URLS = {
            "/register",
            "/api/v1/getUsers",
            "/h2-console/**"
    };

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(11);
    }

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        // FIXME: Cant access h2 console
//	        http
//	                .cors()
//	                .and()
//	                .csrf()
//	                .disable()
//	                .authorizeHttpRequests()
//	                .requestMatchers(WHITE_LIST_URLS)
//	                .permitAll();
//
	        http.authorizeHttpRequests().requestMatchers(WHITE_LIST_URLS).permitAll();
	        return http.build();
	    }
	}

}
