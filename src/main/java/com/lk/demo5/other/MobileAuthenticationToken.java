package com.lk.demo5.other;

import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

public class MobileAuthenticationToken extends AbstractAuthenticationToken {
    private String mobileNumber;
    private String code;

    public MobileAuthenticationToken( String mobileNumber, String code) {
        super(null);
        this.mobileNumber = mobileNumber;
        this.code = code;
    }

    public MobileAuthenticationToken(Collection<? extends GrantedAuthority> authorities) {
        super(authorities);
    }

    @Override
    public Object getCredentials() {
        return null;
    }

    @Override
    public Object getPrincipal() {
        return null;
    }
}
