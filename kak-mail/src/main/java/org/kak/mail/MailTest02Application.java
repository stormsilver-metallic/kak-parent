/**
 *
 */
package org.kak.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

/**
 * @author stormsilver
 *
 */
@SpringBootApplication
public class MailTest02Application {

    public static void main(final String[] args) {
        try (ConfigurableApplicationContext ctx = SpringApplication.run(MailTest02Application.class, args)) {
            ctx.getBean(MailTest02Application.class).sendMail();
        }
    }

    @Autowired
    private MailSender sender;

    public void sendMail() {
        final SimpleMailMessage msg = new SimpleMailMessage();

        msg.setFrom("info@ka-k.jp");
        msg.setTo("stormsilver.metallic@docomo.ne.jp");
        msg.setSubject("テストメール"); // タイトルの設定
        msg.setText("Spring Boot より本文送信"); //本文の設定

        this.sender.send(msg);
    }
}
