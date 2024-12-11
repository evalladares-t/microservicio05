package com.nttdata.bootcamp.microservicio05.model.dto;

import com.nttdata.bootcamp.microservicio05.model.DocumentIdentity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClientP2p {

  private DocumentIdentity documentIdentity;
  private ContactDto contact;
}
