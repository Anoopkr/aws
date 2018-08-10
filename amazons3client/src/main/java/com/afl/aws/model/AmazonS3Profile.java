/* 
 * Copyright (c) 2016 Accel Frontline Ltd.
 * All rights reserved.
 */
package com.afl.aws.model;

import com.amazonaws.regions.Regions;

/**
 * AmazonS3Profile model for s3 connection
 * 
 * @author Anoop.Kumar
 */
public class AmazonS3Profile {

	private String accessKey;
	private String secretKey;
	private Regions region;

	public String getAccessKey() {
		return accessKey;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public String getSecretKey() {
		return secretKey;
	}

	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}

	public Regions getRegion() {
		return region;
	}

	public void setRegion(Regions region) {
		this.region = region;
	}

}
