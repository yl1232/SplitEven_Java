package com.example.split_even;

public class User {

    public String userID;
    public String email;
    public String name;
    //public double balance;

    public User() { }

    public User(String userID, String email, String name) {
        this.userID = userID;
        this.email = email;
        this.name = name;
      //  this.balance = 0;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

  //  public double getBalance() {  return balance;  }

  //  public void setBalance(double balance) { this.balance = balance; }
}
