package com.yi.awsimageupload.bucket;

public enum BucketName {
    PROFILE_IMAGE("test-json-to-parquet-yi");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
