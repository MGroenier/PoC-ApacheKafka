package nl.groenier.tracking.engines;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class Consumer {

	private final Logger logger = LoggerFactory.getLogger(Producer.class);
	private static final String TOPIC = "Hello-Kafka";


	@KafkaListener(topics = TOPIC, groupId = "group_id")
	public void consume(String message) throws IOException {
		logger.info(String.format("Consumed message -> %s", message));
	}

}
