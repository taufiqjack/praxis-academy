package com.taufiqjack.sisteminformasicatering.message.response;

public class JwtResponse {
    private String token;
    private String type = "Bearer";

    public JwtResponse(String accesToken) {
        this.token = accesToken;
    }

    public String getAccessToken() {
        return token;
    }

    public void setAccessToken(String accessToken) {
        this.token = accessToken;
    }

    public String getTokenType(){
        return type;
    }
    public void setTokenType(String tokenType){
        this.type = tokenType;
    }

}
