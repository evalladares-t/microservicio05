package com.nttdata.bootcamp.microservicio05.repository;

import com.nttdata.bootcamp.microservicio05.model.Wallet;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WalletRepository extends ReactiveMongoRepository<Wallet, String> {

}
