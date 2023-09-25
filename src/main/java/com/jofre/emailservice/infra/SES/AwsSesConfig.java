package com.jofre.emailservice.infra.SES;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AwsSesConfig {

    // Credenciales codificadas en el código (NO RECOMENDADO en producción)
    private static final String ACCESS_KEY = "AKIA54ZZFOKEOKMAYLWC";
    private static final String SECRET_KEY = "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";

    @Bean
    public AmazonSimpleEmailService amazonSimpleEmailService(){
        // Configura las credenciales de AWS
        BasicAWSCredentials awsCredentials = new BasicAWSCredentials(ACCESS_KEY, SECRET_KEY);

        return AmazonSimpleEmailServiceClientBuilder.standard()
                .withCredentials(new AWSStaticCredentialsProvider(awsCredentials))
                .withRegion(Regions.US_EAST_1)
                .build();
    }
}