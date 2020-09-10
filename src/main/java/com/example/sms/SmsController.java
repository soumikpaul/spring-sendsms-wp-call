package com.example.sms;


import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Call;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import com.twilio.converter.Promoter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
public class SmsController {

    public static final String ACCOUNT_SID = "ACeca1e320f6acdef07ef5311eb13ced02";
    public static final String AUTH_ID = "3948765e839e39fff7ffeeb7d1d18186";
    public static final String number = "+12075315804";


    @GetMapping(value = "/sendsms", params = {"to","body"})
    public String sendSMS(@RequestParam("to") String to,@RequestParam("body") String body){
                Twilio.init(ACCOUNT_SID, AUTH_ID);

        Message message = Message.creator(
                new PhoneNumber("+"+to),
                new PhoneNumber(number),
                body)
                .create();
        System.out.println("Message sent");
        return message.getSid();
    }
    @GetMapping(value = "/send/whatsapp", params = {"to","body"})
    public String sendWhatsApp(@RequestParam("to") String to,@RequestParam("body") String body){
        Twilio.init(ACCOUNT_SID, AUTH_ID);

        Message message = Message.creator(
                new com.twilio.type.PhoneNumber("whatsapp:+"+to),
                new com.twilio.type.PhoneNumber("whatsapp:+14155238886"),
                body)
                .create();

        System.out.println(message.getSid());
        System.out.println("Message sent");
        return message.getSid();
    }
    @GetMapping(value = "/call",params = {"to"})
    public String call(@RequestParam("to") String to){
        Twilio.init(ACCOUNT_SID, AUTH_ID);

        Call call = Call.creator(
                new com.twilio.type.PhoneNumber("+"+to),
                new com.twilio.type.PhoneNumber("+12075315804"),
                URI.create("http://demo.twilio.com/docs/classic.mp3"))
                .create();

        System.out.println(call.getSid());
        System.out.println("Called");

        System.out.println("Call Dur: "+call.getDuration()+",Call End : "+call.getEndTime());
        return call.getSid();
    }
}
