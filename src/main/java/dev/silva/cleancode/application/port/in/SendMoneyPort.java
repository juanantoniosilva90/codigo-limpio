package dev.silva.cleancode.application.port.in;

public interface SendMoneyPort {

    public boolean send(SendMoneyCommand command);

}
