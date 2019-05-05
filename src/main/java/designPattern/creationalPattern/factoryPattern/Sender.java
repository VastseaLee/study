package designPattern.creationalPattern.factoryPattern;

public interface Sender {
    void send();
}

class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("Sms");
    }
}

class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("Mail");
    }
}