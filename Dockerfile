FROM azul/zulu-openjdk-alpine:19-latest

RUN apk --no-cache upgrade

COPY target/rock-paper-scissors-0.1.1.jar rock-paper-scissors.jar

ENTRYPOINT java -cp rock-paper-scissors.jar uk.emarte.regurgitator.extensions.jetty.RegurgitatorJettyServer 8090 "classpath:/rock-paper-scissors.xml" "/rockpaperscissors/*" "classpath:/global.properties" "/global/*"

EXPOSE 8090
