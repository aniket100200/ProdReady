package ProdReady.Aniket.Service.mail;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

  private final JavaMailSender mailSender;

  @Value("${spring.mail.username}")
  private String from;

  @Autowired
  public EmailService(JavaMailSender javaMailSender) {
    this.mailSender = javaMailSender;
  }

  public String sendSimpleEmail(String to, String subject, String body) {
    SimpleMailMessage message = new SimpleMailMessage();
    message.setFrom(from);
    message.setTo(to);
    message.setSubject(subject);
    message.setText(body);

    mailSender.send(message);
    return "Message Sent Successfully";
  }

  public void sendHtmlEmail(String to) throws MessagingException {
    MimeMessage message = mailSender.createMimeMessage();
    MimeMessageHelper helper = new MimeMessageHelper(message, true); // 'true' indicates multipart

    helper.setTo(to);
    helper.setSubject("Welcome to the App!");
    helper.setText("<h1>Hello!</h1><p>Thanks for joining us.</p>", true); // 'true' indicates HTML

    mailSender.send(message);
  }
}
