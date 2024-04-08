# ForecastApi

# Forecast API with Oauth2Login

 -In this project all the forecast summary of any city with all details and also summary of hourly data also available.
- This project is developed by me.



# Functionalities
-  Github Authentication
-  Google Authentication


## Backend Work
-  Proper Exception Handling
-  Proper fetch of rest API
-  User Authentication of github and google

## Installation and Run
-  to run the application you have to create github/google oauthconfiguration
-  then you have to create client-id and client-secret code
-  replace the details in application.properties
#Github Login
spring.security.oauth2.client.registration.github.client-id={your client Id}
spring.security.oauth2.client.registration.github.client-secret={your client secret}
spring.security.oauth2.client.registration.github.redirect-uri={base URL}/login/oauth2/code/github

#Google
spring.security.oauth2.client.registration.google.client-id={your client Id}
spring.security.oauth2.client.registration.google.client-secret={your client secret}
spring.security.oauth2.client.registration.google.redirect-uri={base URL}/login/oauth2/code/google
logging.level.org.springframework.securty=TRACE

working URL
1.To get the home page
https://forecastapi-production.up.railway.app/forecast/home
2.To get the summary of forecast
https://forecastapi-production.up.railway.app/forecast/summary?cityName={cityName}
3.To get the hourly data of forecast
https://forecastapi-production.up.railway.app/forecast/hourly?cityName={cityName}

# Tech Stacks

-   Java Core
-   Spring Boot
-   Spring Security

<p>
   <img src="https://img.icons8.com/color/64/000000/java.png"/>
   <img src="https://img.icons8.com/color/48/null/spring-logo.png"/>
</p>



# Backend

## Home URL
![image](https://github.com/spvhantale/ForecastApi/blob/main/img/Home%20Page%20Without%20Login.png)

## Oauth Login
![image](https://github.com/spvhantale/ForecastApi/blob/main/img/Oauth%20Login.png)

## Google Authentication
![image](https://github.com/spvhantale/ForecastApi/blob/main/img/Google%20Authentication.png)
![image](https://github.com/spvhantale/ForecastApi/blob/main/img/Google%20Authentication%202.png)

## GitHub Authentication
![image](https://github.com/spvhantale/ForecastApi/blob/main/img/Github%20Authentication.png)

## Summary of forecast
![image](https://github.com/spvhantale/ForecastApi/blob/main/img/Summary%20of%20forecast.png)

## Hourly summary of forecast
![image](https://github.com/spvhantale/ForecastApi/blob/main/img/Hourly%20Data.png)








