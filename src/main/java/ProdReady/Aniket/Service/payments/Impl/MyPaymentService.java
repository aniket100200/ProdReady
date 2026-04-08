package ProdReady.Aniket.Service.payments.Impl;

import ProdReady.Aniket.Service.payments.PaymentService;
import ProdReady.Aniket.mocking.mockito.payments.PaymentResponse;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class MyPaymentService implements PaymentService {
  @Override
  public PaymentResponse process(double amount, String currency) {
    return null;
  }

  @Override
  public boolean pay() {
    return false;
  }
}
