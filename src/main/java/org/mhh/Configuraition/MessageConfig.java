package org.mhh.Configuraition;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class MessageConfig {
    @Bean
    public MessageSource validationMessageConfig() {
        ResourceBundleMessageSource messageSource=new ResourceBundleMessageSource();
        messageSource.setBasename("Messages/validation/validation");
        messageSource.setDefaultEncoding("UTF-8");
        return  messageSource;
    }

    @Bean
    public MessageSource businessMessageConfig() {
        ResourceBundleMessageSource messageSource=new ResourceBundleMessageSource();
        messageSource.setBasename("Messages/business/business");
        messageSource.setDefaultEncoding("UTF-8");
        return  messageSource;
    }
}
