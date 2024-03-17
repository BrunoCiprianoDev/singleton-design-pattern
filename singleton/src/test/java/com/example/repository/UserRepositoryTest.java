package com.example.repository;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.example.entities.User;
import com.example.utils.database.DbConnector;

public class UserRepositoryTest {
  @Mock
  private DbConnector mockDbConnector;

  private UserRepository userRepository;

  @BeforeEach
  public void setUp() {
    MockitoAnnotations.initMocks(this);
    userRepository = new UserRepository(mockDbConnector);
  }

  @Test
  public void testCreate() {
    User user = new User(1L, "test@example.com", "password123");

    Mockito.when(mockDbConnector.execute(Mockito.anyString())).thenReturn(true);

    boolean result = userRepository.create(user);

    assertTrue(result);

    Mockito.verify(mockDbConnector).execute(Mockito.anyString());
  }

}
