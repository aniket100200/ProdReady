package ProdReady.Aniket.scheduler.user;

import ProdReady.Aniket.Repository.UserRepository;
import ProdReady.Aniket.Service.mail.EmailService;
import ProdReady.Aniket.models.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class UserScheduler {
  final EmailService emailService;
  final UserRepository userRepository;

  @Autowired
  public UserScheduler(EmailService emailService, UserRepository userRepository) {
    this.emailService = emailService;
    this.userRepository = userRepository;
  }

  @Scheduled(cron = "0 0 9 * * ?") // Every Morning 9 AM
  public void fetchUsersAndSendEmail() {
    List<User> users = null;
    int randomNumber = (int) (Math.random() * 100);

    if (randomNumber % 2 == 0) {
      users = userRepository.findByIdModulo(0);
    } else users = userRepository.findByIdModulo(1);

    String subjectTemplate =
"""
   Welcome %s, to the Demo Created by Aniket Khangar
""";

    String bodyTemplate =
        """
        Hi Dear %s,

        Great news — you have successfully received this message!

        We are currently testing our automated systems to ensure everything runs smoothly.
        Thank you for being a part of our community.

        Best regards,
        The Aniket
        """;

    for (User user : users) {
      String personalizedBody = String.format(bodyTemplate, user.getUsername());
      emailService.sendSimpleEmail(
          user.getEmail(), String.format(subjectTemplate, user.getUsername()), personalizedBody);
    }
  }
}
