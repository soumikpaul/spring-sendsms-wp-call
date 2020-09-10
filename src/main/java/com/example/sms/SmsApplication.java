package com.example.sms;

import com.twilio.http.TwilioRestClient;
import com.twilio.rest.api.v2010.account.Call;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import com.twilio.converter.Promoter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.URI;


//import com.

@SpringBootApplication
//@Configuration
public class SmsApplication  {

//    private final static String ACCOUNT_SID = "ACeca1e320f6acdef07ef5311eb13ced02";
//    private final static String AUTH_ID = "3948765e839e39fff7ffeeb7d1d18186";
//
    public static void main(String[] args) {
        SpringApplication.run(SmsApplication.class, args);
    }
//
//    @Override
//    public void run(ApplicationArguments args) throws Exception {
////        Twilio.init(ACCOUNT_SID, AUTH_ID);
////        917003225568
////        Message message = Message.creator(
////                new PhoneNumber("+918013473087"),
////                new PhoneNumber("+12075315804"),
////                "Hello! Guess who is this?")
////                .create();
//
//        Twilio.init(ACCOUNT_SID, AUTH_ID);
//
//        Message message1 = Message.creator(
//
//                new com.twilio.type.PhoneNumber("whatsapp:+918013473087"),
//                new com.twilio.type.PhoneNumber("whatsapp:+141552388886"),
//                "Hello from your friendly neighborhood Java application!")
//                .create();
//    }
//    public static final String ACCOUNT_SID = "ACeca1e320f6acdef07ef5311eb13ced02";
//    public static final String AUTH_TOKEN = "3948765e839e39fff7ffeeb7d1d18186";
//    public static final String number = "+12075315804";
//
//    public static void main(String[] args) {
//        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
//        Message message = Message.creator(
//                new com.twilio.type.PhoneNumber("whatsapp:+918013473087"),
//                new com.twilio.type.PhoneNumber("whatsapp:+14155238886"),
//                "hello from Soumik")
//                .create();
//
//        System.out.println(message.getSid());
//        Call call = Call.creator(
//                new com.twilio.type.PhoneNumber("+918013473087"),
//                new com.twilio.type.PhoneNumber("+12075315804"),
//                URI.create("http://demo.twilio.com/docs/classic.mp3"))
//                .create();
//
//        System.out.println(call.getSid());
//    }

//    @Bean
//    public TwilioRestClient twilioRestClient(@Value("${TWILIO_ACCOUNT_SID}") String accountSid,
//                                             @Value("${TWILIO_AUTH_TOKEN}") String authToken){
//        return new TwilioRestClient.Builder(accountSid, authToken).build();
//    }
}
