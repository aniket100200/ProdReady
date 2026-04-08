package ProdReady.Aniket.mocking.mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import ProdReady.Aniket.Service.payments.PaymentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class OrderServiceTest {
  @Mock PaymentService paymentService;

  @InjectMocks OrderService orderService;

  @BeforeEach
  void init() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  void testPlaceOrder() {
    when(paymentService.pay()).thenReturn(false);

    assertTrue(orderService.placeOrder());
  }
}
