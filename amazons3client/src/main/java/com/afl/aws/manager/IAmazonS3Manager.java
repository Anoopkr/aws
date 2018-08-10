/* 
 * Copyright (c) 2016 Accel Frontline Ltd.
 * All rights reserved.
 */
package com.afl.aws.manager;

import com.afl.aws.model.AmazonS3Profile;
import com.amazonaws.services.s3.AmazonS3;

/**
 * Amazon S3 Manager interface
 * 
 * @author Anoop.Kumar
 */
public interface IAmazonS3Manager {

	/**
	 * Returns s3 client object
	 * 
	 * @param profile
	 * @return
	 */
	public AmazonS3 getS3Client(AmazonS3Profile profile);
}
