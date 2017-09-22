# rock-paper-scissors
an example project that implements a rock-paper-scissors service using [regurgitator](https://github.com/talmeym/regurgitator-all#regurgitator)

to use:

- git clone https://github.com/talmeym/rock-paper-scissors.git
- mvn clean install
- start up a tomcat deploying target/rock-paper-scissors-0.0.1.war on context /rockpaperscissors
- POST to /rockpaperscissors with following payload:

```json
{
    "choice":"[rock|paper|scissors]"
}
```

## configuration files

basic [xml](https://github.com/talmeym/rock-paper-scissors/blob/master/src/main/resources/rock-paper-scissors-basic.xml) [json](https://github.com/talmeym/rock-paper-scissors/blob/master/src/main/resources/rock-paper-scissors-basic.json) [yml](https://github.com/talmeym/rock-paper-scissors/blob/master/src/main/resources/rock-paper-scissors-basic.yml)

regular [xml](https://github.com/talmeym/rock-paper-scissors/blob/master/src/main/resources/rock-paper-scissors.xml) [json](https://github.com/talmeym/rock-paper-scissors/blob/master/src/main/resources/rock-paper-scissors.json) [yml](https://github.com/talmeym/rock-paper-scissors/blob/master/src/main/resources/rock-paper-scissors.yml)
