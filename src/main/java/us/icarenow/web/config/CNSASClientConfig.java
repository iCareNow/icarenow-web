package us.icarenow.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class CNSASClientConfig {

    @Bean
    public RestTemplate cnsasRestTemplate() {
        return new RestTemplate();
    }
}
