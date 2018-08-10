/* 
 * Copyright (c) 2016 Accel Frontline Ltd.
 * All rights reserved.
 */
package com.afl.aws.manager.impl;

import com.afl.aws.manager.IAmazonS3Manager;
import com.afl.aws.model.AmazonS3Profile;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

/**
 * Amazon S3 manager implementation
 * 
 * @author Anoop.Kumar
 */
public class AmazonS3Manager implements IAmazonS3Manager{

	public AmazonS3 getS3Client(AmazonS3Profile profile) {
		BasicAWSCredentials awsCreds = new BasicAWSCredentials(profile.getAccessKey(), profile.getSecretKey());
		return AmazonS3ClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCreds))
				.withRegion(profile.getRegion()).build();
	}

}
