/*
 * package com.smart.config;
 * 
 * import org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.security.authentication.dao.DaoAuthenticationProvider;
 * import
 * org.springframework.security.config.annotation.authentication.builders.
 * AuthenticationManagerBuilder; import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import org.springframework.security.config.annotation.web.configuration.
 * EnableWebSecurity; import
 * org.springframework.security.config.annotation.web.configuration.
 * WebSecurityConfiguration;
 * 
 * import org.springframework.security.core.userdetails.UserDetailsService;
 * import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
 * 
 * @Configuration
 * 
 * @EnableWebSecurity public class MyConfig extends WebSecurityConfiguration {
 * 
 * @Bean public UserDetailsService getUserDetailService() { return new
 * UserDetailsServiceImpl(); }
 * 
 * @Bean public BCryptPasswordEncoder passwordEncoder() { return new
 * BCryptPasswordEncoder(); }
 * 
 * @Bean public DaoAuthenticationProvider authenticationProvider() {
 * DaoAuthenticationProvider daoAuthenticationProvider = new
 * DaoAuthenticationProvider();
 * daoAuthenticationProvider.setUserDetailsService(this.getUserDetailService());
 * daoAuthenticationProvider.setPasswordEncoder(passwordEncoder()); return
 * daoAuthenticationProvider; }
 * 
 * //Configure method
 * 
 * public void configure(AuthenticationManagerBuilder auth) throws Exception {
 * auth.authenticationProvider(authenticationProvider());
 * 
 * }
 * 
 * public void configure(HttpSecurity http) throws Exception{
 * http.authorizeRequests().requestMatchers("/admin/**").hasRole("ADMIN").
 * requestMatchers("/user/**").hasRole("USER").requestMatchers("/**").permitAll(
 * ) .and().formLogin().and().csrf().disable(); }
 * 
 * 
 * 
 * }
 */