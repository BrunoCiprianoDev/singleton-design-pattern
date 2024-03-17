package com.example.utils.database;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class DbConnectorImplTest {
  @Test
  public void testGetInstance() {
    DbConnector instance1 = DbConnectorImpl.getInstance();
    DbConnector instance2 = DbConnectorImpl.getInstance();
    assertSame(instance1, instance2);
  }

  @Test
  public void testConnect() {
    DbConnector dbConnector = DbConnectorImpl.getInstance();
    dbConnector.connect();
  }

  @Test
  public void testDisconnect() {
    DbConnector dbConnector = DbConnectorImpl.getInstance();
    dbConnector.disconnect();
  }

  @Test
  public void testExecute() {
    DbConnector dbConnector = DbConnectorImpl.getInstance();
    boolean result = dbConnector.execute(Mockito.anyString());
    assertTrue(result);
  }
}
