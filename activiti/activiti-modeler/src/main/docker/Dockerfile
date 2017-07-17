FROM openjdk:7-jre
RUN groupadd --gid 1004 duser && \
    useradd --system --uid 1003 --gid 1004 --home /home/duser --shell /bin/bash duser

ENV JAVA_OPTS="-Xms128m -Xmx512m"
ENV ACTIVITI_APP_TOMCAT_HOME /usr/local/tomcat
ENV TOMCAT_VERSION=apache-tomcat-7.0.73
ENV TOMCAT_ZIP_URL=http://www-eu.apache.org/dist/tomcat/tomcat-7/v7.0.73/bin/${TOMCAT_VERSION}.zip

RUN mkdir -p /home/duser
USER duser

WORKDIR /home/duser

RUN wget "${TOMCAT_ZIP_URL}" -O tomcat.zip && \
	unzip tomcat.zip && \
    mv ${TOMCAT_VERSION} $ACTIVITI_APP_TOMCAT_HOME && \
    rm tomcat.zip

ADD activiti-app.war ${ACTIVITI_APP_TOMCAT_HOME}/webapps/activiti-app.war
RUN ls -l

COPY tomcat-users.xml ${ACTIVITI_APP_TOMCAT_HOME}/conf/

EXPOSE  8080

CMD cd ${ACTIVITI_APP_TOMCAT_HOME}/bin && ./catalina.sh run