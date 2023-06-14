package com.boyka.demo.config;

import lombok.AllArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DictionaryHelper {

    private final MessageSource messageSource;

    //public String getMessage()
}
