# Uber Job Challenge - Email Service

<img src="https://1000marcas.net/wp-content/uploads/2020/10/Uber-Logo.png" alt="Uber Logo" width="200">

## Introduction

Welcome to the Uber Job Challenge Email Service project! This application is developed as part of the Uber job challenge and is designed to provide a robust and clean solution for sending emails using Spring, following the SOLID principles. It leverages AWS SES (Simple Email Service) for reliable email delivery.

## Features

- Send customized emails to recipients.
- Seamless integration with AWS SES for efficient email delivery.

## Technologies Used

- Java 17
- Spring Boot
- Spring Framework
- AWS SES (Amazon Simple Email Service)
- Maven (Dependency Management)
- SOLID Principles (Software Design)

## Configuration

Before using the Email Service, configure your AWS SES credentials in the `application.properties` file or use a secure method to manage your credentials. Update the following properties:

```properties
aws.accessKeyID = your_access_key_id
aws.secretKey = your_secret_access_key
aws.region = your_aws_region


- Author: Ayrton Jofre.
