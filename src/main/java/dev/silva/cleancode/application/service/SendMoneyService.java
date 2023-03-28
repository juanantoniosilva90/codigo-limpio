package dev.silva.cleancode.application.service;

import dev.silva.cleancode.application.port.in.SendMoneyCommand;
import dev.silva.cleancode.application.port.in.SendMoneyPort;
import org.springframework.stereotype.Service;

@Service
public class SendMoneyService implements SendMoneyPort {
    @Override
    public boolean send(SendMoneyCommand command) {
        return false;
    }
}
