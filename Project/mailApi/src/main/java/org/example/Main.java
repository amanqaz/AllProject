package org.example;

import javax.mail.Session;
import java.util.logging.Handler;

public class Main {
    public static void main(String[] args) {

        System.out.println("This application suppose to send mail using java");


        HandlerMail mail = new HandlerMail();
        mail.sendMail();


    }
}