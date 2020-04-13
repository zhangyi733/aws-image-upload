package com.yi.awsimageupload.config;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AmazonConfig {

    @Bean
    public AmazonS3 s3() {
//        AWSCredentials awsCredentials = new BasicAWSCredentials("access_key_id", "secret_key");
//        return AmazonS3ClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();
        return AmazonS3ClientBuilder.defaultClient();
    }
}
