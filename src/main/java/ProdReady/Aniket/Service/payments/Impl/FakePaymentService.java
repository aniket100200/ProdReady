package ProdReady.Aniket.Service.payments.Impl;

import ProdReady.Aniket.Service.payments.PaymentService;
import ProdReady.Aniket.mocking.mockito.payments.PaymentResponse;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
public class FakePaymentService implements PaymentService {
  @Override
  public boolean pay() {
    return false;
  }

  @Override
  public PaymentResponse process(double amount, String currency) {
    try {
      Thread.sleep(500);
    } catch (InterruptedException e) {
    }

    // Mock Logic: Fail if amount is over $10,000
    if (amount > 10000) {
      return new PaymentResponse(false, "TXN_ERR_01", "Amount too high for test gateway");
    }

    return new PaymentResponse(true, "FAKE_TXN_" + System.currentTimeMillis(), "Success");
  }
}
