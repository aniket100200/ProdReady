package ProdReady.Aniket.mocking.mockito;

import ProdReady.Aniket.dtos.reqDtos.OrderReqDto;
import ProdReady.Aniket.mocking.mockito.payments.PaymentResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {

  @Autowired OrderService orderService;

  @PostMapping("/checkout")
  public ResponseEntity<PaymentResponse> placeAnOrder(@RequestBody OrderReqDto orderReqDto) {
    PaymentResponse paymentResponse = orderService.checkout(orderReqDto);
    return ResponseEntity.ok(paymentResponse);
  }
}
