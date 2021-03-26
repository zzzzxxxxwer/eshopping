package com.eshopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author ThisPC
 */
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class EshoppingApplication {

    public static void main(String[] args) { SpringApplication.run(EshoppingApplication.class, args); }

}
