package com.nttdata.bootcamp.microservicio05.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
@Slf4j
public class WebClientConfig {

  @Value("${application.endpoints.url.customer}")
  private String urlEndpointCustomer;

  @Value("${application.endpoints.url.account}")
  private String urlEndpointAccount;

  @Value("${application.endpoints.url.transaction}")
  private String urlEndpointTransaction;

  @Bean
  public WebClient webClientCustomer() {
    return WebClient.builder()
        .baseUrl(urlEndpointCustomer)
        .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
        .defaultHeader(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
        .filter(
            (request, next) ->
                next.exchange(request).doOnError(e -> log.info("WebClient request error", e)))
        .build();
  }

  @Bean
  public WebClient webClientCredit() {
    return WebClient.builder()
        .baseUrl(urlEndpointAccount)
        .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
        .defaultHeader(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
        .filter(
            (request, next) ->
                next.exchange(request).doOnError(e -> log.info("WebClient request error", e)))
        .build();
  }

  @Bean
  public WebClient webClientTransaction() {
    return WebClient.builder()
        .baseUrl(urlEndpointTransaction)
        .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
        .defaultHeader(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
        .filter(
            (request, next) ->
                next.exchange(request).doOnError(e -> log.info("WebClient request error", e)))
        .build();
  }
}
