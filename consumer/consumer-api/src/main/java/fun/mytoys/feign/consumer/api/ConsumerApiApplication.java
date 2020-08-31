package fun.mytoys.feign.consumer.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.stereotype.Component;

@SpringBootApplication(scanBasePackages = {
        "fun.mytoys.feign.producer.feign.intercept"
})
@EnableEurekaClient
@EnableFeignClients(basePackages = {
        "fun.mytoys.feign.producer.feign.client"
})
public class ConsumerApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApiApplication.class, args);
    }

}
