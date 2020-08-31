package fun.mytoys.feign.producer.feign.client;

import fun.mytoys.feign.producer.feign.constant.FeignProducerServiceName;
import fun.mytoys.producer.domain.vo.Response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("feign-producer")
public interface ProducerFeignTestService {
    @RequestMapping("//feign-producer-$FEIGN-PRODUCER-INSTANCE-ID/test/{instance_id}")
    Response customerInfo(FeignProducerServiceName serviceName, @PathVariable("instance_id") String customer);
}
