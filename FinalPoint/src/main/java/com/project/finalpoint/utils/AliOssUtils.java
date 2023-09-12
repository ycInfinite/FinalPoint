package com.project.finalpoint.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;

@Component
public class AliOssUtils {
    @Autowired
    private AliOssProperties aliOssProperties;

    public void upload() throws IOException{
        String endpoint= aliOssProperties.getEndpoint();
        String accessKeyId= aliOssProperties.getAccessKeyId();
        String accessKeySecret=aliOssProperties.getAccessKeySecret();
        String bucketName=aliOssProperties.getBucketName();

    }
}
