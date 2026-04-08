package ProdReady.Aniket.study.actuator_and_Monitoring;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.stereotype.Component;

@Component
public class VistCounter {
  private final Counter counter;

  public VistCounter(MeterRegistry meterRegistry) {
    this.counter = meterRegistry.counter("custom.visit.counter");
  }

  public void increment() {
    counter.increment();
  }
}
