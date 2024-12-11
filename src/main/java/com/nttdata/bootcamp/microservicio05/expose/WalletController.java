package com.nttdata.bootcamp.microservicio05.expose;

import com.nttdata.bootcamp.microservicio05.model.Wallet;
import com.nttdata.bootcamp.microservicio05.model.request.WalletRequest;
import com.nttdata.bootcamp.microservicio05.service.WalletService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@Slf4j
@RequestMapping("api/v1/wallets")
public class WalletController {

  private WalletService walletService;

  public WalletController(WalletService walletService) {
    this.walletService = walletService;
  }

  @PostMapping({"", "/"})
  @ResponseStatus(HttpStatus.CREATED)
  public Mono<ResponseEntity<Wallet>> create(@RequestBody Wallet wallet) {
    log.info("Create an wallet in the controller.");
    return walletService
            .create(wallet)
            .flatMap(walletCreate -> Mono.just(ResponseEntity.ok(walletCreate)))
            .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
  }

}
