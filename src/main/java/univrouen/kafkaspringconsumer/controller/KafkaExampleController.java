package univrouen.kafkaspringconsumer.controller;

import univrouen.kafkaspringconsumer.model.User;
import univrouen.kafkaspringconsumer.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/kafka/")
public class KafkaExampleController {

    @Autowired
    KafkaProducerService kafkaProducer;


    @PostMapping("/producer")
    public String sendMessage(@RequestBody User msg)
    {
        kafkaProducer.sendMessage(msg);
        return "Message sent successfully to the Kafka topic univrouen";
    }

}