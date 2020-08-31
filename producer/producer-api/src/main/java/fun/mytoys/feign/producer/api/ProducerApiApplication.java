package fun.mytoys.feign.producer.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class ProducerApiApplication {

    public static void main(String[] args) {

        SpringApplication.run(ProducerApiApplication.class, args);
    }

}
