package br.com.yfsmsystem.springcloudfunction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class SpringcloudfunctionApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudfunctionApplication.class, args);
    }

    /*
        The property name in the bean annotation reflect in path for api
     */
    @Bean(name = "reverse")
    public Function<String, String> reverseString() {
        return value -> new StringBuilder(value).reverse().toString();
    }

}
