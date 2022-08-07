package org.sexedu.spring.configuration;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.stereotype.Controller;

import java.lang.reflect.Modifier;

@Controller
public class GsonConfig {
    @Bean
    GsonHttpMessageConverter gsonHttpMessageConverter() {
        GsonHttpMessageConverter converter = new GsonHttpMessageConverter();
        GsonBuilder builder = new GsonBuilder();
        builder.setDateFormat("YYYY-MM-DD");
        builder.excludeFieldsWithModifiers(Modifier.PROTECTED);
        Gson gson = new Gson();
        converter.setGson(gson);
        return converter;
    }

}
