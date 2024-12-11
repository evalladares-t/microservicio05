package com.nttdata.bootcamp.microservicio05.service.impl;

import com.nttdata.bootcamp.microservicio05.config.WebClientHelper;
import com.nttdata.bootcamp.microservicio05.model.Wallet;
import com.nttdata.bootcamp.microservicio05.model.request.WalletRequest;
import com.nttdata.bootcamp.microservicio05.repository.WalletRepository;
import com.nttdata.bootcamp.microservicio05.service.WalletService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;


@Service
@Slf4j
public class WalletServiceImpl implements WalletService {

  private WalletRepository walletRepository;

  private WebClientHelper webClientHelper;


  public WalletServiceImpl(WalletRepository walletRepository, WebClientHelper webClientHelper) {
    this.walletRepository = walletRepository;
    this.webClientHelper = webClientHelper;
  }

  @Override
  public Mono<Wallet> create(Wallet wallet) {
    if (wallet.getClientP2p()!= null){
      return webClientHelper.findCustomerWhithClientP2p(wallet.getClientP2p()).flatMap(customer -> {
        wallet.setCustomerId(customer.getId());
        return walletRepository.insert(wallet);
      });
    }
    return walletRepository.insert(wallet);
  }
}
