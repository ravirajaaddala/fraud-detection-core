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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fraud.detection.www.dto.LoginEvent;

/**
 * 
 */
@Service
public class ActivityService {


	@Autowired
	private KafkaService kafkaService;

	public void process(LoginEvent event) {
		//Do any preprocessing with the event
		// Publish to Kafka
		kafkaService.pushLoginDetails( event.getUserId(), event);
	}
}
