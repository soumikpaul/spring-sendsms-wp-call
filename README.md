# spring-sendsms-wp-call
Spring Boot Application to send SMS or WhatsApp messages or Call

This application uses the Twilio library v 7.55.1 to send SMS or WhatsApp messages or call.
To send SMS, first you need to have phone number verified here https://www.twilio.com/console/phone-numbers/verified with otp
To send Wp messsage you need to do this "Invite your friends to your Sandbox. Ask them to send a WhatsApp message to+1 415 523 8886 with code join operation-hay."
To call just provide the number you want to call

Example of API to send SMS
http://localhost:8080/sendsms?to=918013473087&body=hello

Example of API to send WhatsApp Message
http://localhost:8080/send/whatsapp?to=918013473087&body=hello

Number to be provided in to parameter and message to be provided in body parameter

WhatsApp messages with attachments coming next. :P
