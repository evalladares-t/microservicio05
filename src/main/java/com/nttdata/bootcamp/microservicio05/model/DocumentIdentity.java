package com.nttdata.bootcamp.microservicio05.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DocumentIdentity {

  private String number;
  private TypeDocumentIdentity typeDocumentIdentity;
  private boolean active;
}
