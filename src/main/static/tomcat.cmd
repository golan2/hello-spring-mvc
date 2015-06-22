SET PORT=%1
SET DEBUG_PORT=%2
set MAVEN_OPTS=-Xdebug -Xrunjdwp:transport=dt_socket,address=%PORT%,server=y,suspend=n
cd C:\Users\golaniz\Documents\GitHub\hello-spring-mvc
mvn -Dmaven.tomcat.port=%DEBUG_PORT% tomcat:run-war