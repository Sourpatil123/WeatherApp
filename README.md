Weather Monitoring System with Email Notification 📧🌦
A real-time weather monitoring system that sends email alerts based on weather conditions, built using Java, Spring Boot, and OpenWeatherMap API.

Table of Contents
Introduction
Features
Technologies Used
Setup Instructions
Usage
Email Configuration
Future Enhancements
Screenshots

Introduction
The Weather Monitoring System with Email Notification is a real-time weather monitoring application that fetches weather data from the OpenWeatherMap API and sends email alerts to users based on specific weather conditions (such as extreme temperatures, storms, etc.). This application is ideal for notifying users about severe weather changes that may impact their plans or safety.

Features
Fetches real-time weather data for any city or location using the OpenWeatherMap API.
Sends email notifications to users based on predefined weather conditions.
Displays weather data such as temperature, humidity, wind speed, and general conditions.
Simple and responsive user interface with enhanced design elements (animations, transitions).


Technologies Used
Java: Backend programming language.
Spring Boot: Framework for easy configuration and development.
Spring MVC: For web layer and REST controllers.
OpenWeatherMap API: For real-time weather data.
Thymeleaf: Server-side template engine for rendering web pages.
Spring Mail: To send email notifications.
HTML/CSS/JavaScript: For front-end design and animations.
MySQL/PostgreSQL (optional): For storing weather logs or user subscription details.

Setup Instructions
Prerequisites
Java 8 or higher
Spring Tool Suite (STS) or any IDE that supports Spring Boot
OpenWeatherMap API key (Get it here)
SMTP email account (Gmail, Outlook, etc.) to send email notifications

Configuration
API Key: Update the OpenWeatherMap API key in the application.properties.
Email Credentials: Set your SMTP email credentials for sending email alerts.
Base URL: The base URL for weather data fetching is configured within the service layer.

Email Configuration
The email notification system uses Spring's email support to send alerts when weather conditions meet a specific threshold.

SMTP Setup: Configure your SMTP server in the application.properties file. Common providers like Gmail or Outlook can be used with the appropriate credentials.

Future Enhancements
Push Notifications: Add push notifications via web or mobile for weather alerts.
User Subscription System: Allow users to subscribe to weather alerts for multiple locations.
Hourly Forecast: Expand the system to include an hourly or multi-day forecast for more comprehensive alerts.


Screenshots
![Screenshot 2024-10-22 234632](https://github.com/user-attachments/assets/e1ca4078-3f57-4f95-91f5-c241b72f4ae4)


