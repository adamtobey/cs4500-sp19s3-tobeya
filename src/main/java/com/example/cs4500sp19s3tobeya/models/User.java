package com.example.cs4500sp19s3tobeya.models;

public class User {
	private Integer id;
	private String username;
	private String password;
	private String firstName;
	private String lastName;

  public User(int id, String username, String password, String firstName, String lastName) {
    this.id = id;
    this.username = username;
    this.password = password;
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Integer getId() {
    return this.id;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getUsername() {
    return this.username;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getPassword() {
    return this.password;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getLastName() {
    return this.lastName;
  }

}
