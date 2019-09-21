package com.alc.pontointeligenteapi;

import com.alc.pontointeligenteapi.util.PasswordUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PontoInteligenteApiApplication {

    public static void main(String[] args) {
        String gerarBCrypt = PasswordUtil.gerarBCrypt("12345");
        System.out.println(gerarBCrypt);
        SpringApplication.run(PontoInteligenteApiApplication.class, args);
    }

}
