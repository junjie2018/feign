package fun.mytoys.feign.producer.feign.intercept;

import feign.MethodMetadata;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collection;
import java.util.Map;

@Configuration
@SuppressWarnings("SpringFacetCodeInspection")
public class RequestInterceptorConfig {
    @Bean
    public RequestInterceptor feignProducerIntercept() {
        return new RequestInterceptor() {
            public void apply(RequestTemplate requestTemplate) {

                MethodMetadata methodMetadata = requestTemplate.methodMetadata();


                Collection<String> requestVariables = requestTemplate.getRequestVariables();

                Map<String, Collection<String>> queries = requestTemplate.queries();

                String url = requestTemplate.url();

                if (url.contains("$FEIGN-PRODUCER-INSTANCE-ID")) {
                    url = url.replace("$FEIGN-PRODUCER-INSTANCE-ID", "a");
                    requestTemplate.uri(url);
                }
                if (url.startsWith("//")) {
                    url = "http:" + url;
                    requestTemplate.target(url);
                    requestTemplate.uri("");
                }
            }
        };
    }

    @Bean
    public RequestInterceptor first() {
        return new RequestInterceptor() {
            public void apply(RequestTemplate requestTemplate) {
                System.out.println("first");
            }
        };
    }

    @Bean
    public RequestInterceptor second() {
        return new RequestInterceptor() {
            public void apply(RequestTemplate requestTemplate) {
                System.out.println("second");
            }
        };
    }
}
