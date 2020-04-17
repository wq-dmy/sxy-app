package com.sxy.ibf.security.oauth2;

import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.OAuth2Request;

public class OAuth2AuthenticationNew extends OAuth2Authentication {
    public String getXing() {
        return xing;
    }

    public void setXing(String xing) {
        this.xing = xing;
    }

    private String xing;

    public OAuth2AuthenticationNew(OAuth2Request storedRequest, Authentication userAuthentication) {
        super(storedRequest, userAuthentication);
    }
}
