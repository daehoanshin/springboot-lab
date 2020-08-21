package me.xbb123.user;

/**
 * @author xbb123
 */
public class SecurityConfig {

    /*@Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/**.html").permitAll()
                .anyRequest()
                .fullyAuthenticated().and().formLogin().loginPage("/login")
                .failureUrl("/login?error").permitAll().and().logout().permitAll();
    }*/

    /*@Override
    protected void configure(HttpSecurity http) throws Exception {
        // @formatter:off
        http.authorizeRequests()
                .requestMatchers(PathRequest.toStaticResources().atCommonLocations()).permitAll()
                .requestMatchers(new AntPathRequestMatcher("/**.html")).permitAll()
                .anyRequest().fullyAuthenticated()
                .and()
                .formLogin().permitAll()
                .and()
                .logout().permitAll();
        // @formatter:on
    }*/
}
