package univrouen.kafkaspringconsumer;

import univrouen.kafkaspringconsumer.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class KafkaSpringConsumerApplication {

	public static void main(String[] args) {

		SpringApplication.run(KafkaSpringConsumerApplication.class, args);
	}

	@KafkaListener(topics = "univrouen", groupId = "univrouen-group", containerFactory = "kafkaListenerContainerFactory")
	public void listen(User message) {

		System.out.println("Received User information : " + message.getName());
	}
}
