package ProdReady.Aniket.spring.scheduling;

import java.text.SimpleDateFormat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {
  private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);
  private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

//    @Scheduled(fixedRate = 1000)
//    public void reportCurrentTime() {
//        try {
//            Thread.sleep(2000); // Takes 2 seconds to run
//        } catch (Exception t) {}
//        log.info("FixedRate: The time now is {}", dateFormat.format(new Date()));
//    }
//
//
//    @Scheduled(fixedDelay = 1000)
//    public void doSomething() {
//        try {
//            Thread.sleep(2000); // Takes 2 seconds to run
//        } catch (Exception t) {}
//        log.warn("FixedDelay: Close Yours Eyes and say Radhe Radhe!!");
//    }
}
