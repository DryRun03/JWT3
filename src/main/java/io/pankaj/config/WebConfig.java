package io.pankaj.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class WebConfig {

    @Bean
    public UserDetailsService userDetailsService(){
        UserDetails user1 = User.builder().username("pankaj")
                .password(bCryptPasswordEncoder().encode("pankaj"))
                .roles("ADMIN").build();
        UserDetails user2 = User.builder().username("garg")
                .password(bCryptPasswordEncoder().encode("garg"))
                .roles("USER").build();
        return new InMemoryUserDetailsManager(user1,user2);
    }
    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }

//    @Bean
//    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
//        return authenticationConfiguration.getAuthenticationManager();
//    }
}