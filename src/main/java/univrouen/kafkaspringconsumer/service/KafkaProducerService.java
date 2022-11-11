package univrouen.kafkaspringconsumer.service;

import univrouen.kafkaspringconsumer.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {
    @Autowired
    private KafkaTemplate<String, User> kafkaTemplate;

    String topicName = "univrouen";

    public void sendMessage(User msg) {
        kafkaTemplate.send(topicName, msg);
    }
}