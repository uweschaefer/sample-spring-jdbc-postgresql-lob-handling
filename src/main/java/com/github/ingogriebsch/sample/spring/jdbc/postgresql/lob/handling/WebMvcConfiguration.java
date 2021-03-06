package com.github.ingogriebsch.sample.spring.jdbc.postgresql.lob.handling;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.NonNull;

@Configuration
public class WebMvcConfiguration {

    @Bean
    public DocumentResourceHttpMessageConverter documentResourceHttpMessageConverter(@NonNull DocumentRepository documentRepository) {
        return new DocumentResourceHttpMessageConverter(documentRepository);
    }

}
