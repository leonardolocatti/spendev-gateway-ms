package br.com.llocatti.spendev.gateway;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@SpringBootTest
class GatewayApplicationTests {

  @Test
  void contextLoads() {
    assertDoesNotThrow(() -> GatewayApplication.main(new String[] {}));
  }
}
