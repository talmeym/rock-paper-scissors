# rock-paper-scissors
an example project that implements a rock-paper-scissors service using [regurgitator](https://github.com/talmeym/regurgitator-all#regurgitator)

## to use (as a war file):

- git clone https://github.com/talmeym/rock-paper-scissors.git
- cd rock-paper-scissors
- mvn -f pom.war.xml clean install
- start up a tomcat (on say 8080) deploying target/rock-paper-scissors-0.0.1.war on context /rockpaperscissors
- POST to http://localhost:8080/rockpaperscissors with following payload:

```json
{
    "choice":"[rock|paper|scissors]"
}
```

## to use (in a container):

- git clone https://github.com/talmeym/rock-paper-scissors.git
- cd rock-paper-scissors
- mvn -f pom.jetty.xml clean install
- docker build . -t rock-paper-scissors
- docker run -p 8080:8080 rock-paper-scissors
- POST to http://localhost:8080/rockpaperscissors with following payload:

```json
{
    "choice":"[rock|paper|scissors]"
}
```

## response

```json
{
    "message": "Hi Player",
    "player": "hello Andy",
    "computer": "rock",
    "result": "computer wins",
    "totals": {
        "wins": 0,
        "losses": 1,
        "draws": 0
    }
}
```

# global parameters

- PUT to http://localhost:8080/global?param=player_name&value=Miles
- See player name change in game responses
- GET http://localhost:8080/global to see all global variables

## configuration files

basic [xml](https://github.com/talmeym/rock-paper-scissors/blob/master/src/main/resources/rock-paper-scissors-basic.xml) [json](https://github.com/talmeym/rock-paper-scissors/blob/master/src/main/resources/rock-paper-scissors-basic.json) [yml](https://github.com/talmeym/rock-paper-scissors/blob/master/src/main/resources/rock-paper-scissors-basic.yml)

regular [xml](https://github.com/talmeym/rock-paper-scissors/blob/master/src/main/resources/rock-paper-scissors.xml) [json](https://github.com/talmeym/rock-paper-scissors/blob/master/src/main/resources/rock-paper-scissors.json) [yml](https://github.com/talmeym/rock-paper-scissors/blob/master/src/main/resources/rock-paper-scissors.yml)
