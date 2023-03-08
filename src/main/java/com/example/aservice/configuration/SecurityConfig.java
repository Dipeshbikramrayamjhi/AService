package com.example.aservice.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

//@Configuration
//@EnableWebSecurity
public class SecurityConfig {

//    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception
//    {
//       httpSecurity.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//               .and()
//               .authorizeRequests()
//               .requestMatchers("/swagger-ui/**").permitAll()
//               .requestMatchers("/login/**").permitAll()
//               .requestMatchers("/patient/**").hasRole("patient")
//               .requestMatchers("/ambulance/**").hasRole("ambulance")
//               .requestMatchers("/admin/**").hasRole("admin")
//               .anyRequest().authenticated()
//               .and()
//               .httpBasic()
//               .and()
//               .csrf()
//               .disable();
//               return httpSecurity.build();
//    }
//    @Bean
//    public DaoAuthenticationProvider authenticationProvider()
//    {
//    DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
//    return  null;
//    }
//    @Bean
//    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception
//    {
//        return authenticationConfiguration.getAuthenticationManager();
//    }
//    @Bean
//    public PasswordEncoder passwordEncoder()
//    {
//        return new BCryptPasswordEncoder();
//    }


}
