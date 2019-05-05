package designPattern.creationalPattern.factoryPattern;

public interface Provider {
    Sender produce();
}
class MailSenderFactory implements Provider{
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
class SmsSenderFactory implements Provider{
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}