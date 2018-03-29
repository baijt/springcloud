package org.kafka.boot.consumer;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.config.KafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.listener.ConcurrentMessageListenerContainer;


@EnableKafka
@Configuration
public class KafkaConsumerConfig {
	
	
	@Bean
	public KafkaListenerContainerFactory<ConcurrentMessageListenerContainer<String,String>> kafkaListenerContainerFactory(){
        ConcurrentKafkaListenerContainerFactory<String, String> factory = new ConcurrentKafkaListenerContainerFactory<String, String>();  
        factory.setConsumerFactory(consumerFactory());  
        factory.setConcurrency(1);  
        factory.getContainerProperties().setPollTimeout(4000);  
        return factory; 
	}
	
	   public ConsumerFactory<String, String> consumerFactory() {  
	        Map<String, Object> properties = new HashMap<String, Object>();  
	        properties.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "192.168.0.110:9092");//注意这里修改为kafka的具体配置项目，我这里只是为了开发演示方便  
	        properties.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, true);  
	        properties.put(ConsumerConfig.AUTO_COMMIT_INTERVAL_MS_CONFIG, "100");  
	        properties.put(ConsumerConfig.SESSION_TIMEOUT_MS_CONFIG, "15000");  
	        properties.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);  
	        properties.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);  
	        properties.put(ConsumerConfig.GROUP_ID_CONFIG, "test-group");  
	        properties.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");  
	        return new DefaultKafkaConsumerFactory<String, String>(properties);  
	    }  
	   
	   
	   @Bean  
	    public KafkaListeners kafkaListeners() {  
	        return new KafkaListeners();  
	    } 
	   
	   
//	   public class KafkaListeners {
//		   @KafkaListener(topics = {"test"})  
//		    public void listen(ConsumerRecord<?, ?> record) {  
//		        Optional<?> kafkaMessage = Optional.ofNullable(record.value());  
//		        if (kafkaMessage.isPresent()) {  
//		            Object message = kafkaMessage.get();  
//		            System.out.println("listen " + message);  
//		        }  
//		    }  
//	   }

}
