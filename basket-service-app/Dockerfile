FROM amazoncorretto:17-alpine

MAINTAINER Mauricio Generoso

RUN mkdir /apps

COPY build/libs/basket-service-app.jar /apps/basket-service.jar

RUN apk add --update \
    curl \
    && rm -rf /var/cache/apk/*

ENTRYPOINT exec java -jar /apps/basket-service.jar
