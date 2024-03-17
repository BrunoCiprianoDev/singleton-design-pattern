package com.example.repository;

import com.example.entities.User;
import com.example.utils.database.DbConnector;

public class UserRepository {

  private DbConnector dbConnector;

  public UserRepository(DbConnector dbConnector) {
    this.dbConnector = dbConnector;
  }

  public boolean create(User user) {
    String sqlQuery = "INSERT INTO User (email, password) VALUES ('" +
        user.getEmail() + "', '" + user.getPassword()
        + "'";
    return this.dbConnector.execute(sqlQuery);
  }

}
