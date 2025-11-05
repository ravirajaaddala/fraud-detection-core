/**
 * Copyright (C) Ravi Raja Addala
 *
 * Licensed under the Friesian License java (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at 
 *
 *      http://www.ravirajaaddala.co.in/licenses/LICENSE-JAVA
 *
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and 
 * limitations under the License.
 */
package com.fraud.detection.www.service;

import java.nio.charset.StandardCharsets;

import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.header.internals.RecordHeader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.fraud.detection.www.dto.LoginEvent;

/**
 * 
 */
@Service
public class KafkaService {

	@Autowired
	private KafkaTemplate<String, LoginEvent> kafkaTemplate;
	
	public void pushLoginDetails(String key, LoginEvent event ) {
		System.out.println("pushLoginDetails for key "+key);
		//kafkaTemplate.send("user-login-events", key, event);
		
		ProducerRecord<String, LoginEvent> eventrecord = new ProducerRecord<String, LoginEvent>("user-login-events", key, event);
		eventrecord.headers().add(new RecordHeader("source", "springboot-app".getBytes(StandardCharsets.UTF_8)));
		kafkaTemplate.send(eventrecord);
	}
	
}
