package org.kafka.boot.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@EnableAutoConfiguration
@RequestMapping("/sample")
public class SampleController {

	 @Autowired
	private KafkaTemplate  template;

	@KafkaListener(topics = { "testboot" })
	public void listenT1(ConsumerRecord<?, ?> cr) throws Exception {

		System.err.println(cr.topic() + ":" + cr.key() + "===" + cr.value());
	}
	@RequestMapping("/send")	
	
	public void sendMessage(){
		System.err.println("--------------");
		template.send("boottest","1","sssss asfa adfadeg agagag agraghag aga gr rahg arg raehareh ahraeha aa a a aa aa aa as asa  as a as");
	}



}
