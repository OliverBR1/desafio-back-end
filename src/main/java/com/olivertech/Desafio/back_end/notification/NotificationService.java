package com.olivertech.Desafio.back_end.notification;

import com.olivertech.Desafio.back_end.transaction.Transaction;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    private final NotificationProducer notificationProducer;

    public NotificationService(NotificationProducer notificationProducer) {
        this.notificationProducer = notificationProducer;
    }

    public void notify(Transaction transaction) {
        notificationProducer.sendNotification(transaction);
    }
}
