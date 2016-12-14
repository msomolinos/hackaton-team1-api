package net.pi.hackaton.web.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;

@Configuration
public class WebConfiguration {

    public RestTemplate restTemplate;

    @Autowired
    private RestTemplateBuilder restTemplateBuilder;

    @PostConstruct
    public void initializeRestTemplate() {
        this.restTemplate = restTemplateBuilder.build();
    }
}
