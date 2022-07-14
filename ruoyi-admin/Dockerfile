FROM java
MAINTAINER itworkzhang@163.com
WORKDIR /
COPY ./target/ruoyi-admin.jar ./
#设置变量
ENV JAVA_OPTS=""
EXPOSE 8080
ENTRYPOINT java -jar ${JAVA_OPTS} ruoyi-admin.jar
