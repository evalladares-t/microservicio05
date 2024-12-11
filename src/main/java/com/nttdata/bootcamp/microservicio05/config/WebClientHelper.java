package com.nttdata.bootcamp.microservicio05.config;

import com.nttdata.bootcamp.microservicio05.model.Customer;
import com.nttdata.bootcamp.microservicio05.model.dto.ClientP2p;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Slf4j
@Configuration
public class WebClientHelper {

  private WebClient webClientCustomer;
  private WebClient webClientCredit;

  private WebClient webClientTransaction;

  public WebClientHelper(
      WebClient webClientCustomer, WebClient webClientCredit, WebClient webClientTransaction) {
    this.webClientCustomer = webClientCustomer;
    this.webClientCredit = webClientCredit;
    this.webClientTransaction = webClientTransaction;
  }

  public Mono<Customer> findCustomerWhithClientP2p(ClientP2p clientP2p) {
    log.info("Getting client with id: [{}]", clientP2p);
    return this.webClientCustomer
        .post()
        .uri(uriBuilder -> uriBuilder.path("v1/customers/findClientP2p").build())
        .bodyValue(clientP2p)
        .retrieve()
        .bodyToMono(Customer.class)
        .onErrorResume(
            error -> {
              System.err.println("Error during call: " + error.getMessage());
              return Mono.empty();
            });
  }
}
