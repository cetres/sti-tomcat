FROM tomcat:8.0

LABEL io.k8s.description="Platform for Tomcat" \
      io.k8s.display-name="Java Applications" \
      io.openshift.expose-services="8080:http" \
      io.openshift.tags="builder,java,tomcat" \
      io.openshift.s2i.scripts-url="image:///usr/local/s2i"

COPY ./s2i/bin/ /usr/local/s2i

#RUN chmod g+w /var/www/html/

#ENV LC_ALL en_US.UTF-8

USER 1001

EXPOSE 8080

CMD ["usage"]
