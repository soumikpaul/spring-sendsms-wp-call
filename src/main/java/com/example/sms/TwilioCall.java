package com.example.sms;

import com.twilio.http.TwilioRestClient;
import com.twilio.rest.api.v2010.account.CallCreator;
//import com.twilio.clicktocall.CallException;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.api.v2010.account.CallCreator;
import com.twilio.type.PhoneNumber;

import java.net.URI;
import java.net.URISyntaxException;
public class TwilioCall {

    private String twilioNumber;
    private TwilioRestClient restClient;

    public void TwilioLine(TwilioRestClient restClient, String twilioNumber) {
        this.restClient = restClient;
        this.twilioNumber = twilioNumber;
    }

    public void call(final String phoneNumber, final String responseUrl) throws Exception {
        try {
            CallCreator callCreator = new CallCreator(new PhoneNumber(phoneNumber), new PhoneNumber(twilioNumber), new URI(responseUrl));
            callCreator.create(restClient);
        } catch (URISyntaxException e) {
            System.out.println("here");
            throw new Exception(e);
        }
    }
}
