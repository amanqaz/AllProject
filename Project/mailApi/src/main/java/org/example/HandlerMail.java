package org.example;

import javax.mail.*;
import java.util.Properties;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
public class HandlerMail {
    void sendMail(){

     String HOST="smtp.gmail.com";

    Properties prop = System.getProperties();


    //set Properties

    prop.put("mail.smtp.host",HOST);

    prop.put("mail.smtp.port","465");

    prop.put("mail.smtp.ssl.enable","true");

    prop.put("mail.smtp.auth","true");


    //Create an Session


    Session mailSession = Session.getInstance(prop, new MailAuthenticator());

    MimeMessage mimeMessage = new MimeMessage(mailSession);


        try {
            mimeMessage.setFrom(constantClass.SENDER);

            mimeMessage.setRecipients(Message.RecipientType.TO, String.valueOf(new InternetAddress(constantClass.REICEIVER)));

            mimeMessage.setSubject(constantClass.SUBJECT);
            mimeMessage.setText(constantClass.MESSAGE);


            Transport.send(mimeMessage);
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }



    }





}
