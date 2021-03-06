package com.wyp.spring.cloud.test;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * Hello world!
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class App 
{
    public static void main( String[] args ){
//        System.out.println( "Hello World!" );
        new SpringApplicationBuilder(App.class).web(true).run(args);

    }
}
