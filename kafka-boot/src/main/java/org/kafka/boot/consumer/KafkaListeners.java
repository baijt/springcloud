package org.kafka.boot.consumer;

import java.util.Optional;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
	
	 @KafkaListener(topics = {"boottest"})  
	    public void listen(ConsumerRecord<?, ?> record) {  
	        Optional<?> kafkaMessage = Optional.ofNullable(record.value());  
	        if (kafkaMessage.isPresent()) {  
	            Object message = kafkaMessage.get();  
	            System.err.println("-------------------listen________________ " + message);  
	        }  
	    }  

}
