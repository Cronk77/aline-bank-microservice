# Using maven as base image
FROM maven:3.8-eclipse-temurin as build

# Copy over directories with target microservice 
COPY . /aline-bank-microservice

# package up microservice
WORKDIR /aline-bank-microservice/
RUN mvn -Dmaven.test.skip package

# Second layer build(reduce size of image)
FROM openjdk:8u181-jre-alpine as final

# Uncomment out block to run individual containers without compose
#########################################################################
# ARG are set in the image building phase as arguments or from compose file
ARG APP_PORT
# ARG ENCRYPT_SECRET_KEY
# ARG JWT_SECRET_KEY
# ARG DB_USERNAME
# ARG DB_PASSWORD
# ARG DB_HOST
# ARG DB_PORT
# ARG DB_NAME
# # Sets the enviroment variables from ARG's above
ENV APP_PORT=$APP_PORT
# ENV ENCRYPT_SECRET_KEY=$ENCRYPT_SECRET_KEY
# ENV JWT_SECRET_KEY=$JWT_SECRET_KEY
# ENV DB_USERNAME=$DB_USERNAME
# ENV DB_PASSWORD=$DB_PASSWORD
# ENV DB_HOST=$DB_HOST
# ENV DB_PORT=$DB_PORT
# ENV DB_NAME=$DB_NAME
#########################################################################

# Run Program
WORKDIR /app/
COPY --from=build /aline-bank-microservice/bank-microservice/target/bank-microservice-*.jar bank_jar
EXPOSE ${APP_PORT}
CMD java -jar bank_jar
