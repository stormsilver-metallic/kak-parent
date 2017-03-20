package org.kak.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KakParentApplication {

    public static void main(final String[] args) {
        SpringApplication.run(KakParentApplication.class, args);
    }
}
