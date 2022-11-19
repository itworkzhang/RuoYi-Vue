FROM openjdk
MAINTAINER itworkzhang@163.com
WORKDIR /
COPY ./target/ruoyi-admin.jar ./
#设置变量
ENV JAVA_OPTS=""
EXPOSE 8080
ENTRYPOINT java  ${JAVA_OPTS} -jar ruoyi-admin.jar
