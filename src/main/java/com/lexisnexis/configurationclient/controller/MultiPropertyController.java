package com.lexisnexis.configurationclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class MultiPropertyController {
    @Value("${projectname}")
    private String projectName;

    @Value("${findercomponentname}")
    private String finderComponentName;

    @Value("${ecskcomponentname}")
    private String ecskComponentName;

    @Value("${DefaultProperty}")
    private String defaultPropertyName;

    @GetMapping("/multiconfig")
    public String multiConfigProperties() {
        return "Project Name [" + projectName + "] Finder Component [" + finderComponentName +
                "] ECSK Component [" + ecskComponentName + "] Default Property[" + defaultPropertyName + "]";
    }
}
