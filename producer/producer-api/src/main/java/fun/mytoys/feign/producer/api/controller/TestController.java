package fun.mytoys.feign.producer.api.controller;

import fun.mytoys.producer.domain.vo.Response;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @ResponseBody
    @RequestMapping("/test/a")
    public Response test() {
        System.out.println("running...");
        return new Response("0", "success");
    }
}
