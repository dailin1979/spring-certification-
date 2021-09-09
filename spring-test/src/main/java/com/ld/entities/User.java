package com.ld.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class User extends AbstractEntity {

  public User() {
    super();
  }

  @NotNull
  @Column(name = "USERNAME")
  private String username;

  @NotNull
  @Column(name = "FIRSTNAME")
  private String firstName;

  @NotNull
  @Column(name = "LASTNAME")
  private String lastName;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  @Override
  public String toString() {
    return String.format("User[username='%s', firstName='%s', lastName='%s']\n",
            username, firstName, lastName);
  }
}