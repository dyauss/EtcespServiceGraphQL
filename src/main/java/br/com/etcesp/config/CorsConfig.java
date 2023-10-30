package br.com.etcesp.config;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {

  @Bean
  public CorsFilter curionCorsConfiguration() {
    CorsConfiguration corsConfiguration = new CorsConfiguration();
    corsConfiguration.addAllowedOriginPattern("*");
    corsConfiguration.addAllowedHeader("*");
    corsConfiguration.addAllowedMethod("*");
    corsConfiguration.addExposedHeader("ExposedHeaderName");

    Map<String, CorsConfiguration> corsConfigurations = new LinkedHashMap<>(1);
    corsConfigurations.put("/graphql", corsConfiguration);

    UrlBasedCorsConfigurationSource configurationSource = new UrlBasedCorsConfigurationSource();
    configurationSource.setCorsConfigurations(corsConfigurations);
    configurationSource.setAllowInitLookupPath(true);

    return new CorsFilter(configurationSource);
  }
}