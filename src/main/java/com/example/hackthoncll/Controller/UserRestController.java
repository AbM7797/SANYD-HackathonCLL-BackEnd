package com.example.hackthoncll.Controller;

import com.example.hackthoncll.Service.UserServiceImp;
import com.example.hackthoncll.entity.User;
import com.example.hackthoncll.entity.Utils.UserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class UserRestController {
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private UserServiceImp userService;

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody User user){
        return ResponseEntity.ok(userService.saveUser(user));
    }
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody UserRequest authenticationRequest) throws Exception {
        authenticate(authenticationRequest.getUsername(),authenticationRequest.getPassword());
        final User user = userService.getUserByUsername(authenticationRequest.getUsername());
        return ResponseEntity.ok(user);
    }
    private void authenticate(String username, String password) throws Exception {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username,password));
        }catch (DisabledException e){
            throw new Exception("USER_DISABLED",e);
        }catch (BadCredentialsException E){
            throw new Exception("INVALID_CREDENTIALS",E);
        }

    }
}
