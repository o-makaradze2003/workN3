package org.example;

public class EmailTask implements Task{
    public String Subject;
    public String Recipient;
    public String body;

    public EmailTask(String subject,String recipient,String body) {
        this.Subject = subject;
        this.Recipient = recipient;
        this.body = body;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    public String getRecipient() {
        return Recipient;
    }

    public void setRecipient(String recipient) {
        Recipient = recipient;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void execute(){
        System.out.println("subject: "+Subject);
        System.out.println("recipient: "+Recipient);
        System.out.println("body: "+body);
        System.out.println("Sent Email. ");
    }
}
