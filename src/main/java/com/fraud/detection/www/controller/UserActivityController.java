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
package com.fraud.detection.www.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fraud.detection.www.dto.LoginEvent;
import com.fraud.detection.www.service.ActivityService;

/**
 * 
 */
@RestController
@RequestMapping("/user-activity")
public class UserActivityController {

	private ActivityService activityService; 
	
	
	public UserActivityController(ActivityService activityService) {
		this.activityService = activityService;
	}
	
    @PostMapping("/login")
    public ResponseEntity<?> logLogin(@RequestBody LoginEvent event) {
    	System.out.println("login log = "+event.toString());
        activityService.process(event);
        return ResponseEntity.ok().build();
    }


}
