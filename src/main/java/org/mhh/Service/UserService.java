package org.mhh.Service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
@Slf4j
public class UserService {

    private final MessageSource validationMessageConfig;
    private final MessageSource businessMessageConfig;

    public UserService(MessageSource validationMessageConfig, MessageSource businessMessageConfig) {
        this.validationMessageConfig = validationMessageConfig;
        this.businessMessageConfig = businessMessageConfig;
    }

    public String getBusinessMessageEnglish(String key) {
        return businessMessageConfig.getMessage(key, null, Locale.getDefault());
    }

    public String getBusinessMessageEnglishWithParameter(String key, String operationName, String parameter) {
        return businessMessageConfig.getMessage(key, new Object[]{operationName,parameter}, Locale.getDefault());
    }

    public String getBusinessMessagePersian(String key) {
        return businessMessageConfig.getMessage(key, null, new Locale("fa"));
    }

    public String getBusinessMessagePersianWithParameter(String key,String operationName, String parameter) {
        return businessMessageConfig.getMessage(key, new Object[]{operationName,parameter}, new Locale("fa"));
    }

    public String getValidationMessageEnglish(String key) {
        return validationMessageConfig.getMessage(key, null, Locale.getDefault());
    }

    public String getValidationMessagePersian(String key) {
        return validationMessageConfig.getMessage(key, null, new Locale("fa"));
    }
}