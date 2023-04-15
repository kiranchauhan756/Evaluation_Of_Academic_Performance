package com.example.controller;

import com.example.helper.JwtUtil;
import com.example.model.JwtModel;
import com.example.model.JwtResponse;
import com.example.service.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.authentication.AuthenticationManager;

@RestController
public class JwtController {

    @Autowired
    private CustomUserDetailsService customerUserDetailsService;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtil jwtUtil;

    @RequestMapping(value="/token",method = RequestMethod.POST)
    public ResponseEntity<?> generateToken(@RequestBody JwtModel jwtModel) throws Exception {
        System.out.println(jwtModel);
        try{
        this.authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(jwtModel.getUsername(),jwtModel.getPassword()));
        }catch(BadCredentialsException b){
              b.printStackTrace();
              throw new Exception("Bad credentials");
        }

        UserDetails userDetails=this.customerUserDetailsService.loadUserByUsername(jwtModel.getUsername());
        String token=this.jwtUtil.generateToken(userDetails);
        System.out.println("JWT    "+token);

        return ResponseEntity.ok(new JwtResponse(token));
    }

}
