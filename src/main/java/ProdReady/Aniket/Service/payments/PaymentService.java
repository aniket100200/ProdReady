package ProdReady.Aniket.Service.payments;

import ProdReady.Aniket.mocking.mockito.payments.PaymentResponse;

public interface PaymentService {
  PaymentResponse process(double amount, String currency);

  boolean pay();
}
