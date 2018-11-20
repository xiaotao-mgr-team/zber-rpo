package com.zb.zber.data.handler;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by cuixt on 2018/10/22.
 */
@Configuration
@ConfigurationProperties(prefix = "remote", ignoreUnknownFields = false)
@PropertySource("classpath:config/remote.properties")
@Data
@Component
public class ApplicationProperties {
    private String IMG_DOWN_PATH;

    public String getIMG_DOWN_PATH() {
        return IMG_DOWN_PATH;
    }

    public void setIMG_DOWN_PATH(String IMG_DOWN_PATH) {
        this.IMG_DOWN_PATH = IMG_DOWN_PATH;
    }
}
