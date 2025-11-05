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
package com.fraud.detection.www.dto;

import java.time.Instant;

/**
 * 
 */
public class LoginEvent {
	private String userId;
	private String deviceId;
	private String ipAddress;
	private String location;
	private Instant timestamp;
	private boolean faceMatch;
	private String loginType;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Instant getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Instant timestamp) {
		this.timestamp = timestamp;
	}

	public boolean isFaceMatch() {
		return faceMatch;
	}

	public void setFaceMatch(boolean faceMatch) {
		this.faceMatch = faceMatch;
	}

	public String getLoginType() {
		return loginType;
	}

	public void setLoginType(String loginType) {
		this.loginType = loginType;
	}
	

}
