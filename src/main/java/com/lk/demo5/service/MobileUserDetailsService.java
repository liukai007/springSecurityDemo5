package com.lk.demo5.service;

import com.lk.demo5.domain.MobileUser;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Collections;

@Component
public class MobileUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        if (MobileUser.map.isEmpty() || MobileUser.map.get(s) == null) {
            return null;
        }
        String code = MobileUser.map.get(s);
        Collection<? extends GrantedAuthority> authorities = Collections.EMPTY_LIST;
        return new MobileUser(s, code, authorities );
    }
}
