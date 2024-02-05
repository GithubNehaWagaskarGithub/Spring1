package SpringSumulatoryWithSpringSecurity.SpringSumulatoryWithSpringSecurity.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.DefaultSecurityFilterChain;

@Configuration
public class MySecurity {
    @Bean
    public InMemoryUserDetailsManager createUser()
    {
        UserDetails admin= User.builder().username("Neha").password("{noop}Neha@123").roles("ADMIN","ENDUSER").build();
        UserDetails endUser=User.builder().username("Aaku").password("{noop}Aaku@123").roles("ENDUSER").build();
        return new InMemoryUserDetailsManager(admin,endUser);
    }

//    public DefaultSecurityFilterChain auth(HttpSecurity http){
//        http.authorizeHttpRequests(config-> config
//                .requestMatchers().hasRole().requestMatchers().hasRole().anyRequest().authenticated()).formLogin().
//    }


    //Spring web-Html,Css
    //Spring JPA-Hibernate
    //Spring Mysql=Database
    //String DevTools=Automatically Starts the server or stop
    //Spring lomBook=Annotation
    //ThymeLeaf=Thymeleaf
    //Spring Security=Security
}
