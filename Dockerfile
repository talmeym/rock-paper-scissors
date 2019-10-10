FROM azul/zulu-openjdk-alpine:11.0.4

RUN apk --no-cache upgrade

COPY target/rock-paper-scissors-0.0.1.jar rock-paper-scissors.jar

ENTRYPOINT java -cp rock-paper-scissors.jar com.emarte.regurgitator.extensions.jetty.RegurgitatorJettyServer 8090 "classpath:/rock-paper-scissors.xml" "/rockpaperscissors/*" "classpath:/global.properties" "/global/*"

EXPOSE 8090