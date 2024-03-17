package com.example.utils.database;

public class DbConnectorImpl implements DbConnector {

  private static final DbConnector INSTANCE = new DbConnectorImpl();

  private DbConnectorImpl() {
  }

  public static DbConnector getInstance() {
    return INSTANCE;
  }

  public void connect() {
    System.out.println("Connected...");
  }

  public void disconnect() {
    System.out.println("...Disconnected");
  }

  public boolean execute(String query) {
    this.connect();
    System.out.println(query);
    this.disconnect();
    return true;
  }

}
