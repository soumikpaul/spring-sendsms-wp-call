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

    public static void main(String[] args) {
        SpringApplication.run(SmsApplication.class, args);
    }

}
