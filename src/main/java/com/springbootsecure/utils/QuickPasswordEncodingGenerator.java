/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springbootsecure.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 *
 * @author Jarmo
 */
public class QuickPasswordEncodingGenerator {

    /**
     * Generates encrypted 'admin' and 'user' passwords
     * @param args
     */
    public static void main(String[] args) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String password = "admin";
        System.out.println("admin: " + passwordEncoder.encode(password));
        password = "user";
        System.out.println("user: " + passwordEncoder.encode(password));
        password = "password";
        System.out.println("password: " + passwordEncoder.encode(password));
    }    
}
