# README #

Spring Boot + Togglz demo accompanying source code for blog post at http://tech.asimio.net/2018/05/31/Adding-Feature-Toggles-to-Spring-Boot-applications-using-Togglz.html

### Available URLs

```
curl -v "http://localhost:8080/api/demo-cms/0"
curl -v "http://localhost:8080/api/demo-es/0
curl -v "http://localhost:8080/api/demo-someservice/0"
```
should result in successful responses. 

### Who do I talk to? ###

* orlando.otero at asimio dot net
* https://www.linkedin.com/in/ootero


## Spring MVC actuator endpoints available via /admin/info, /admin/health, ...
#server.servlet-path: /
#management:
#  context-path: /admin
#  security:
#    enabled: false
#
#endpoints:
#  enabled: false
#  info:
#    enabled: true
#  health:
#    enabled: true
#  beans:
#    enabled: true
#
#togglz:
##  enabled: true # Enabled by default
##  featureEnums:
##    com.citiustech.config.FeatureToggles
#  features:
#    TEXT_BASED_SEARCH_VIA_ELASTIC_SEARCH:
#      enabled: true
#    CONTENT_RETRIEVAL_VIA_CMS:
#      enabled: false
#    USE_NEW_SOMESERVICE:
#      enabled: true
#

