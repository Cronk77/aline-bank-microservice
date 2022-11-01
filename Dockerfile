# Using maven as base image
FROM maven:3.8-eclipse-temurin

# Uncomment out block to run individual containers without compose
#########################################################################
# ARG are set in the image building phase as arguments or from compose file
##ARG APP_PORT
##ARG ENCRYPT_SECRET_KEY
##ARG JWT_SECRET_KEY
##ARG DB_USERNAME
##ARG DB_PASSWORD
##ARG DB_HOST
##ARG DB_PORT
##ARG DB_NAME
# Sets the enviroment variables from ARG's above
##ENV APP_PORT=$APP_PORT
##ENV ENCRYPT_SECRET_KEY=$ENCRYPT_SECRET_KEY
##ENV JWT_SECRET_KEY=$JWT_SECRET_KEY
##ENV DB_USERNAME=$DB_USERNAME
##ENV DB_PASSWORD=$DB_PASSWORD
##ENV DB_HOST=$DB_HOST
##ENV DB_PORT=$DB_PORT
##ENV DB_NAME=$DB_NAME
# Expose the port to listen on passed in port number
##EXPOSE ${APP_PORT}
#########################################################################

# Copy over directories with target microservice 
COPY . /aline-financial/aline-bank-microservice

# package up microservice
WORKDIR /aline-financial/aline-bank-microservice/
RUN mvn -Dmaven.test.skip package

# Run Program
WORKDIR /aline-financial/aline-bank-microservice/bank-microservice/
CMD java -jar /aline-financial/aline-bank-microservice/bank-microservice/target/bank-microservice-0.1.0.jar
