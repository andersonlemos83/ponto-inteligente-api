package com.alc.pontointeligenteapi.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordUtil {

    private static final Logger log = LoggerFactory.getLogger(PasswordUtil.class);

    public PasswordUtil() {
    }

    public static String gerarBCrypt(String senha) {
        if (senha == null) {
            return senha;
        }

        log.info("Gerando hash com o BCrypt.");
        BCryptPasswordEncoder bCryptEncoder = new BCryptPasswordEncoder();
        return bCryptEncoder.encode(senha);
    }

    public static void main(String[] args){
        String s1 = PasswordUtil.gerarBCrypt("1");
        String s2 = PasswordUtil.gerarBCrypt("12345");
        String s3 = PasswordUtil.gerarBCrypt("123456");

        System.out.println("1 - " + s1);
        System.out.println("12345 - " + s2);
        System.out.println("123456 - " + s3);

    }
}