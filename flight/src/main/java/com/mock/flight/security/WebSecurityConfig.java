package com.mock.flight.security;

import com.mock.flight.config.AuthTokenFilter;
import com.mock.flight.config.AuthenEntryPointJwt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@EnableWebSecurity
@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {


    @Autowired
    AuthenEntryPointJwt unAuthorized;

    @Autowired
    UserDetailServiceImpl userDetailsServiceImp;




    @Bean
    public PasswordEncoder passwordEncode() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }

    @Bean
    public AuthTokenFilter authTokenJwtFilter(){
        return new AuthTokenFilter();
    }


    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }


    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .userDetailsService(userDetailsServiceImp)
                .passwordEncoder(passwordEncode());
    }

    @Override
    public void configure(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
        authenticationManagerBuilder.userDetailsService(userDetailsServiceImp).passwordEncoder(passwordEncode());
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.cors().and().csrf().disable()
                .exceptionHandling().authenticationEntryPoint(unAuthorized).and()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
                .authorizeRequests().antMatchers("/api/auth/**").permitAll()
//                .antMatchers(,"/api/test/**").hasAnyRole("USER")
                .antMatchers(HttpMethod.POST,"/**/create").hasAnyRole("ADMIN", "USER")
                .antMatchers(HttpMethod.PUT,"/*/update").hasAnyRole("ADMIN", "USER")
                .antMatchers(HttpMethod.DELETE,"/*/delete").hasRole("ADMIN")
                .antMatchers(HttpMethod.GET, "/*/find").hasAnyRole("USER","ADMIN")
                .antMatchers("/api/**/find").hasAnyRole("USER")
                .antMatchers("/error").permitAll()
                .anyRequest().authenticated().and();
        http.addFilterBefore(authTokenJwtFilter(), UsernamePasswordAuthenticationFilter.class);
    }

    @Bean
    public AuthTokenFilter authenticationJwtTokenFilter() {
        return new AuthTokenFilter();
    }
}
