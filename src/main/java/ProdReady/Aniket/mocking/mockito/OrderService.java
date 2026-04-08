package ProdReady.Aniket.mocking.mockito;

import ProdReady.Aniket.Service.payments.PaymentService;
import ProdReady.Aniket.dtos.reqDtos.OrderReqDto;
import ProdReady.Aniket.mocking.mockito.payments.PaymentResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

  private final PaymentService paymentService;

  @Autowired
  public OrderService(PaymentService paymentService) {
    this.paymentService = paymentService;
  }

  public PaymentResponse checkout(OrderReqDto dto) {
    PaymentResponse paymentResponse = paymentService.process(dto.getAmount(), dto.getCurrency());
    return paymentResponse;
  }

  public boolean placeOrder() {
    return paymentService.pay();
  }
}
