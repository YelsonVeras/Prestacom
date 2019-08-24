package com.quipau.loan.prestacom.configurations;

//import com.fasterxml.jackson.databind.ObjectMapper;
//import Constants;
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.SignatureAlgorithm;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
//import javax.servlet.FilterChain;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Date;

public class JWTAuthenticationFilter {
//        extends UsernamePasswordAuthenticationFilter {

//    private AuthenticationManager authenticationManager;
//
//    public JWTAuthenticationFilter(AuthenticationManager authenticationManager) {
//        this.authenticationManager = authenticationManager;
//    }
//
//    @Override
//    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
//        try {
//            var auth = new ObjectMapper().readValue(request.getInputStream(), User.class);
//            return authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(auth.getUserName(), auth.getPassword(), new ArrayList<>()));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    @Override
//    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication auth) {
//        String token = Jwts.builder().setIssuedAt(new Date()).setIssuer(Constants.ISSUER_INFO)
//                .setSubject(((User) auth.getPrincipal()).getUsername())
//                .setExpiration(new Date(System.currentTimeMillis() + Constants.TOKEN_EXPIRATION_TIME))
//                .signWith(SignatureAlgorithm.HS512, Constants.SUPER_SECRET_KEY).compact();
//        response.addHeader(Constants.HEADER_AUTHORIZATION_KEY, Constants.TOKEN_BEARER_PREFIX + " " + token);
//    }
}
