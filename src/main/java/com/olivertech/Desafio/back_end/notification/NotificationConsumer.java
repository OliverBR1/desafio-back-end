package com.olivertech.Desafio.back_end.notification;

import com.olivertech.Desafio.back_end.transaction.Transaction;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class NotificationConsumer {
    private RestClient restClient;

    public NotificationConsumer(RestClient.Builder builder) {
        this.restClient = builder
                .baseUrl("https://run.mocky.io/v3/54dc2cf1-3add-45b5-b5a9-6bf7e7f1f4a6")
                .build();
    }

    @KafkaListener(topics = "transaction-notification", groupId = "Desafio back-end")
    public void receiveNotification(Transaction transaction) {

        var response = restClient.get()
                .retrieve()
                .toEntity(Notification.class);

        if(response.getStatusCode().isError() || !response.getBody().message()) {
            throw new NotificationException("Error sending notification!");
        }

    }
}
