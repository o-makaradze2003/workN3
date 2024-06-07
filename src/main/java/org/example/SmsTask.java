package org.example;

public class SmsTask implements Task {
    public int  phoneNumber;
    public String message;

    public SmsTask(int phoneNumber,String message) {
        this.phoneNumber = phoneNumber;
        this.message = message;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void execute() {
        System.out.println("phonenum: "+phoneNumber);
        System.out.println("message: "+message);
        System.out.println("Sent sms ");
    }
}
