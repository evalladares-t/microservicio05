package com.nttdata.bootcamp.microservicio05.service;

import com.nttdata.bootcamp.microservicio05.model.Wallet;
import com.nttdata.bootcamp.microservicio05.model.request.WalletRequest;
import reactor.core.publisher.Mono;

public interface WalletService {

  Mono<Wallet> create(Wallet wallet);
}
