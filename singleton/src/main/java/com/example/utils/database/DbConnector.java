package com.example.utils.database;

public interface DbConnector {

  void connect();

  void disconnect();

  boolean execute(String query);

}
