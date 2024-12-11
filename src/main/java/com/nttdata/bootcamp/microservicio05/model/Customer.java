package com.nttdata.bootcamp.microservicio05.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

  private String id;
  private String firstName;
  private String lastName;
  private DocumentIdentity documentIdentity;
  private Contact contact;
  private Boolean active;
}
