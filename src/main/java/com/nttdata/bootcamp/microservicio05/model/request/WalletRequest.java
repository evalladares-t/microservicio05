package com.nttdata.bootcamp.microservicio05.model.request;

import com.nttdata.bootcamp.microservicio05.model.Contact;
import com.nttdata.bootcamp.microservicio05.model.dto.ClientP2p;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class WalletRequest {

  private String customerId;
  private ClientP2p clientP2p;
  private String associatedAccountId;
  private BigDecimal amount;
}
