package com.nttdata.bootcamp.microservicio05.model;

import java.math.BigDecimal;
import java.util.UUID;

import com.nttdata.bootcamp.microservicio05.model.dto.ClientP2p;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "wallet")
public class Wallet {
  @Id private String id = UUID.randomUUID().toString();
  private String customerId;
  private ClientP2p clientP2p;
  private String associatedAccountId;
  private BigDecimal amount;
}
