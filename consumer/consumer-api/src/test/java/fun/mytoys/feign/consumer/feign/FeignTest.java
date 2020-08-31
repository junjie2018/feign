package fun.mytoys.feign.consumer.feign;

import fun.mytoys.feign.consumer.api.ConsumerApiApplication;
import fun.mytoys.feign.producer.feign.client.ProducerFeignTestService;
import fun.mytoys.feign.producer.feign.constant.FeignProducerServiceName;
import fun.mytoys.producer.domain.vo.Response;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {ConsumerApiApplication.class})
public class FeignTest {
    @Autowired
    private ProducerFeignTestService producerFeignTestService;


    @Test
    public void test() {
        Response a = producerFeignTestService.customerInfo(
                FeignProducerServiceName.PRODUCER_SERVICE_A,
                "a");
        System.out.println("");
    }
}
