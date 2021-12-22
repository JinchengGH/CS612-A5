FROM anapsix/alpine-java:8_server-jre_unlimited

MAINTAINER gjxx<hanxuan@demo.com>

RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime

RUN mkdir -p /spring-boot-dubbo-consumer-0.0.1-SNAPSHOT

WORKDIR /spring-boot-dubbo-consumer-0.0.1-SNAPSHOT

EXPOSE 7002

ADD ./target/spring-boot-dubbo-consumer-0.0.1-SNAPSHOT.jar ./

CMD sleep 120;java -Xms128m -Xmx256m -Djava.security.egd=file:/dev/./urandom -jar spring-boot-dubbo-consumer-0.0.1-SNAPSHOT.jar