spring-integration-kafka-memory-leak
====================================

```
Jan 06, 2015 11:45:44 AM org.apache.catalina.core.AprLifecycleListener init
INFORMATION: The APR based Apache Tomcat Native library which allows optimal performance in production environments was not found on the java.library.path: /Users/marcelalburg/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.
Jan 06, 2015 11:45:44 AM org.apache.tomcat.util.digester.SetPropertiesRule begin
WARNUNG: [SetPropertiesRule]{Server/Service/Engine/Host/Context} Setting property 'source' to 'org.eclipse.jst.jee.server:spring-integration-kafka-memory-leak' did not find a matching property.
Jan 06, 2015 11:45:44 AM org.apache.coyote.AbstractProtocol init
INFORMATION: Initializing ProtocolHandler ["http-nio-8080"]
Jan 06, 2015 11:45:44 AM org.apache.tomcat.util.net.NioSelectorPool getSharedSelector
INFORMATION: Using a shared selector for servlet write/read
Jan 06, 2015 11:45:44 AM org.apache.coyote.AbstractProtocol init
INFORMATION: Initializing ProtocolHandler ["ajp-nio-8009"]
Jan 06, 2015 11:45:44 AM org.apache.tomcat.util.net.NioSelectorPool getSharedSelector
INFORMATION: Using a shared selector for servlet write/read
Jan 06, 2015 11:45:44 AM org.apache.catalina.startup.Catalina load
INFORMATION: Initialization processed in 797 ms
Jan 06, 2015 11:45:44 AM org.apache.catalina.core.StandardService startInternal
INFORMATION: Starting service Catalina
Jan 06, 2015 11:45:44 AM org.apache.catalina.core.StandardEngine startInternal
INFORMATION: Starting Servlet Engine: Apache Tomcat/8.0.12
Jan 06, 2015 11:45:51 AM org.apache.catalina.core.ApplicationContext log
INFORMATION: Spring WebApplicationInitializers detected on classpath: [org.example.kafkamemoryleak.configuration.AppInitializer@4a104bd3]
log4j:WARN No appenders could be found for logger (org.springframework.web.context.support.StandardServletEnvironment).
log4j:WARN Please initialize the log4j system properly.
log4j:WARN See http://logging.apache.org/log4j/1.2/faq.html#noconfig for more info.
Jan 06, 2015 11:45:51 AM org.apache.catalina.core.ApplicationContext log
INFORMATION: Set web app root system property: 'webapp.root' = [/Users/marcelalburg/Documents/workspace-sts-3.6.1.RELEASE/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/spring-integration-kafka-memory-leak]
Jan 06, 2015 11:45:51 AM org.apache.catalina.core.ApplicationContext log
INFORMATION: Initializing log4j from [/Users/marcelalburg/Documents/workspace-sts-3.6.1.RELEASE/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/spring-integration-kafka-memory-leak/WEB-INF/properties/log4j.xml]
Jan 06, 2015 11:45:51 AM org.apache.catalina.core.ApplicationContext log
INFORMATION: Initializing Spring FrameworkServlet 'dispatcher'
[frontend] INFO    2015-01-06 11:45:51,770 [localhost-startStop-1] org.springframework.web.servlet.DispatcherServlet   - FrameworkServlet 'dispatcher': initialization started
[frontend] INFO    2015-01-06 11:45:51,780 [localhost-startStop-1] org.springframework.web.context.support.XmlWebApplicationContext   - Refreshing WebApplicationContext for namespace 'dispatcher-servlet': startup date [Tue Jan 06 11:45:51 CET 2015]; root of context hierarchy
[frontend] INFO    2015-01-06 11:45:51,861 [localhost-startStop-1] org.springframework.beans.factory.xml.XmlBeanDefinitionReader   - Loading XML bean definitions from ServletContext resource [/WEB-INF/mvc-config.xml]
[frontend] INFO    2015-01-06 11:45:52,147 [localhost-startStop-1] org.springframework.beans.factory.xml.XmlBeanDefinitionReader   - Loading XML bean definitions from ServletContext resource [/WEB-INF/kafka-context.xml]
[frontend] INFO    2015-01-06 11:45:52,302 [localhost-startStop-1] org.springframework.beans.factory.config.PropertiesFactoryBean   - Loading properties file from URL [jar:file:/Users/marcelalburg/Documents/workspace-sts-3.6.1.RELEASE/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/spring-integration-kafka-memory-leak/WEB-INF/lib/spring-integration-core-4.1.0.RELEASE.jar!/META-INF/spring.integration.default.properties]
[frontend] INFO    2015-01-06 11:45:52,311 [localhost-startStop-1] org.springframework.integration.config.IntegrationRegistrar   - No bean named 'integrationHeaderChannelRegistry' has been explicitly defined. Therefore, a default DefaultHeaderChannelRegistry will be created.
[frontend] INFO    2015-01-06 11:45:52,573 [localhost-startStop-1] org.springframework.integration.config.DefaultConfiguringBeanFactoryPostProcessor   - No bean named 'errorChannel' has been explicitly defined. Therefore, a default PublishSubscribeChannel will be created.
[frontend] INFO    2015-01-06 11:45:52,574 [localhost-startStop-1] org.springframework.integration.config.DefaultConfiguringBeanFactoryPostProcessor   - No bean named 'taskScheduler' has been explicitly defined. Therefore, a default ThreadPoolTaskScheduler will be created.
[frontend] INFO    2015-01-06 11:45:53,228 [localhost-startStop-1] org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler   - Initializing ExecutorService  'defaultSockJsTaskScheduler'
[frontend] INFO    2015-01-06 11:45:53,694 [localhost-startStop-1] org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter   - Looking for @ControllerAdvice: WebApplicationContext for namespace 'dispatcher-servlet': startup date [Tue Jan 06 11:45:51 CET 2015]; root of context hierarchy
[frontend] INFO    2015-01-06 11:45:53,927 [localhost-startStop-1] org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter   - Looking for @ControllerAdvice: WebApplicationContext for namespace 'dispatcher-servlet': startup date [Tue Jan 06 11:45:51 CET 2015]; root of context hierarchy
[frontend] INFO    2015-01-06 11:45:54,080 [localhost-startStop-1] org.springframework.web.servlet.handler.SimpleUrlHandlerMapping   - Mapped URL path [/resources/**] onto handler 'org.springframework.web.servlet.resource.ResourceHttpRequestHandler#0'
[frontend] INFO    2015-01-06 11:45:54,192 [localhost-startStop-1] org.springframework.beans.factory.config.PropertiesFactoryBean   - Loading properties file from URL [jar:file:/Users/marcelalburg/Documents/workspace-sts-3.6.1.RELEASE/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/spring-integration-kafka-memory-leak/WEB-INF/lib/spring-integration-core-4.1.0.RELEASE.jar!/META-INF/spring.integration.default.properties]
[frontend] INFO    2015-01-06 11:45:54,233 [localhost-startStop-1] org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler   - Initializing ExecutorService  'taskScheduler'
[frontend] INFO    2015-01-06 11:45:54,303 [localhost-startStop-1] org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor   - Initializing ExecutorService  'kafkaTaskExecutor'
[frontend] INFO    2015-01-06 11:45:54,328 [localhost-startStop-1] org.springframework.integration.kafka.support.ConsumerConfigFactoryBean   - Using consumer properties => {group.id=default, fetch.message.max.bytes=5242880, consumer.timeout.ms=4000, auto.offset.reset=smallest, zookeeper.sync.time.ms=2000, zookeeper.session.timeout.ms=6000, zookeeper.connect=127.0.0.1, socket.receive.buffer.bytes=10485760, auto.commit.interval.ms=1000}
[frontend] INFO    2015-01-06 11:45:55,150 [localhost-startStop-1] kafka.utils.VerifiableProperties   - Verifying properties
[frontend] INFO    2015-01-06 11:45:55,287 [localhost-startStop-1] kafka.utils.VerifiableProperties   - Property auto.commit.interval.ms is overridden to 1000
[frontend] INFO    2015-01-06 11:45:55,288 [localhost-startStop-1] kafka.utils.VerifiableProperties   - Property auto.offset.reset is overridden to smallest
[frontend] INFO    2015-01-06 11:45:55,288 [localhost-startStop-1] kafka.utils.VerifiableProperties   - Property consumer.timeout.ms is overridden to 4000
[frontend] INFO    2015-01-06 11:45:55,288 [localhost-startStop-1] kafka.utils.VerifiableProperties   - Property fetch.message.max.bytes is overridden to 5242880
[frontend] INFO    2015-01-06 11:45:55,288 [localhost-startStop-1] kafka.utils.VerifiableProperties   - Property group.id is overridden to default
[frontend] INFO    2015-01-06 11:45:55,288 [localhost-startStop-1] kafka.utils.VerifiableProperties   - Property socket.receive.buffer.bytes is overridden to 10485760
[frontend] INFO    2015-01-06 11:45:55,289 [localhost-startStop-1] kafka.utils.VerifiableProperties   - Property zookeeper.connect is overridden to 127.0.0.1
[frontend] INFO    2015-01-06 11:45:55,289 [localhost-startStop-1] kafka.utils.VerifiableProperties   - Property zookeeper.session.timeout.ms is overridden to 6000
[frontend] INFO    2015-01-06 11:45:55,290 [localhost-startStop-1] kafka.utils.VerifiableProperties   - Property zookeeper.sync.time.ms is overridden to 2000
[frontend] WARN    2015-01-06 11:45:55,456 [localhost-startStop-1] org.springframework.web.servlet.handler.SimpleUrlHandlerMapping   - Neither 'urlMap' nor 'mappings' set on SimpleUrlHandlerMapping
[frontend] INFO    2015-01-06 11:45:55,545 [localhost-startStop-1] org.springframework.context.support.DefaultLifecycleProcessor   - Starting beans in phase -2147483648
[frontend] INFO    2015-01-06 11:45:55,547 [localhost-startStop-1] org.springframework.context.support.DefaultLifecycleProcessor   - Starting beans in phase 0
[frontend] INFO    2015-01-06 11:45:55,548 [localhost-startStop-1] org.springframework.integration.endpoint.EventDrivenConsumer   - Adding {logging-channel-adapter:logInputFromKafka.adapter} as a subscriber to the 'logInputFromKafka' channel
[frontend] INFO    2015-01-06 11:45:55,549 [localhost-startStop-1] org.springframework.integration.channel.DirectChannel   - Channel 'org.springframework.web.context.WebApplicationContext:/spring-integration-kafka-memory-leak/dispatcher.logInputFromKafka' has 1 subscriber(s).
[frontend] INFO    2015-01-06 11:45:55,549 [localhost-startStop-1] org.springframework.integration.endpoint.EventDrivenConsumer   - started logInputFromKafka.adapter
[frontend] INFO    2015-01-06 11:45:55,549 [localhost-startStop-1] org.springframework.integration.endpoint.EventDrivenConsumer   - Adding {logging-channel-adapter:_org.springframework.integration.errorLogger} as a subscriber to the 'errorChannel' channel
[frontend] INFO    2015-01-06 11:45:55,551 [localhost-startStop-1] org.springframework.integration.channel.PublishSubscribeChannel   - Channel 'org.springframework.web.context.WebApplicationContext:/spring-integration-kafka-memory-leak/dispatcher.errorChannel' has 1 subscriber(s).
[frontend] INFO    2015-01-06 11:45:55,551 [localhost-startStop-1] org.springframework.integration.endpoint.EventDrivenConsumer   - started _org.springframework.integration.errorLogger
[frontend] INFO    2015-01-06 11:45:55,689 [localhost-startStop-1] org.springframework.web.servlet.DispatcherServlet   - FrameworkServlet 'dispatcher': initialization completed in 3913 ms
Jan 06, 2015 11:45:55 AM org.apache.coyote.AbstractProtocol start
INFORMATION: Starting ProtocolHandler ["http-nio-8080"]
Jan 06, 2015 11:45:55 AM org.apache.coyote.AbstractProtocol start
INFORMATION: Starting ProtocolHandler ["ajp-nio-8009"]
Jan 06, 2015 11:45:55 AM org.apache.catalina.startup.Catalina start
INFORMATION: Server startup in 10978 ms
Jan 06, 2015 11:47:23 AM org.apache.catalina.core.StandardServer await
INFORMATION: A valid shutdown command was received via the shutdown port. Stopping the Server instance.
Jan 06, 2015 11:47:23 AM org.apache.coyote.AbstractProtocol pause
INFORMATION: Pausing ProtocolHandler ["http-nio-8080"]
Jan 06, 2015 11:47:24 AM org.apache.coyote.AbstractProtocol pause
INFORMATION: Pausing ProtocolHandler ["ajp-nio-8009"]
Jan 06, 2015 11:47:24 AM org.apache.catalina.core.StandardService stopInternal
INFORMATION: Stopping service Catalina
Jan 06, 2015 11:47:24 AM org.apache.catalina.core.ApplicationContext log
INFORMATION: Destroying Spring FrameworkServlet 'dispatcher'
[frontend] INFO    2015-01-06 11:47:24,359 [localhost-startStop-2] org.springframework.web.context.support.XmlWebApplicationContext   - Closing WebApplicationContext for namespace 'dispatcher-servlet': startup date [Tue Jan 06 11:45:51 CET 2015]; root of context hierarchy
[frontend] INFO    2015-01-06 11:47:24,360 [localhost-startStop-2] org.springframework.context.support.DefaultLifecycleProcessor   - Stopping beans in phase 1073741823
[frontend] INFO    2015-01-06 11:47:24,361 [localhost-startStop-2] org.springframework.context.support.DefaultLifecycleProcessor   - Stopping beans in phase 0
[frontend] INFO    2015-01-06 11:47:24,364 [localhost-startStop-2] org.springframework.integration.endpoint.EventDrivenConsumer   - Removing {logging-channel-adapter:logInputFromKafka.adapter} as a subscriber to the 'logInputFromKafka' channel
[frontend] INFO    2015-01-06 11:47:24,364 [localhost-startStop-2] org.springframework.integration.channel.DirectChannel   - Channel 'org.springframework.web.context.WebApplicationContext:/spring-integration-kafka-memory-leak/dispatcher.logInputFromKafka' has 0 subscriber(s).
[frontend] INFO    2015-01-06 11:47:24,364 [localhost-startStop-2] org.springframework.integration.endpoint.EventDrivenConsumer   - stopped logInputFromKafka.adapter
[frontend] INFO    2015-01-06 11:47:24,364 [localhost-startStop-2] org.springframework.integration.endpoint.EventDrivenConsumer   - Removing {logging-channel-adapter:_org.springframework.integration.errorLogger} as a subscriber to the 'errorChannel' channel
[frontend] INFO    2015-01-06 11:47:24,365 [localhost-startStop-2] org.springframework.integration.channel.PublishSubscribeChannel   - Channel 'org.springframework.web.context.WebApplicationContext:/spring-integration-kafka-memory-leak/dispatcher.errorChannel' has 0 subscriber(s).
[frontend] INFO    2015-01-06 11:47:24,365 [localhost-startStop-2] org.springframework.integration.endpoint.EventDrivenConsumer   - stopped _org.springframework.integration.errorLogger
[frontend] INFO    2015-01-06 11:47:24,365 [localhost-startStop-2] org.springframework.context.support.DefaultLifecycleProcessor   - Stopping beans in phase -2147483648
[frontend] INFO    2015-01-06 11:47:24,403 [localhost-startStop-2] kafka.consumer.ZookeeperConsumerConnector   - [default_MacBook.local-1420541244399-6e7b513d], Connecting to zookeeper instance at 127.0.0.1
[frontend] INFO    2015-01-06 11:47:24,420 [ZkClient-EventThread-25-127.0.0.1] org.I0Itec.zkclient.ZkEventThread   - Starting ZkClient event thread.
[frontend] INFO    2015-01-06 11:47:24,435 [localhost-startStop-2] org.apache.zookeeper.ZooKeeper   - Client environment:zookeeper.version=3.3.3-1203054, built on 11/17/2011 05:47 GMT
[frontend] INFO    2015-01-06 11:47:24,435 [localhost-startStop-2] org.apache.zookeeper.ZooKeeper   - Client environment:host.name=127.0.0.1
[frontend] INFO    2015-01-06 11:47:24,435 [localhost-startStop-2] org.apache.zookeeper.ZooKeeper   - Client environment:java.version=1.8.0_25
[frontend] INFO    2015-01-06 11:47:24,436 [localhost-startStop-2] org.apache.zookeeper.ZooKeeper   - Client environment:java.vendor=Oracle Corporation
[frontend] INFO    2015-01-06 11:47:24,436 [localhost-startStop-2] org.apache.zookeeper.ZooKeeper   - Client environment:java.home=/Library/Java/JavaVirtualMachines/jdk1.8.0_25.jdk/Contents/Home/jre
[frontend] INFO    2015-01-06 11:47:24,436 [localhost-startStop-2] org.apache.zookeeper.ZooKeeper   - Client environment:java.class.path=/opt/apache-tomcat-8.0.12/bin/bootstrap.jar:/opt/apache-tomcat-8.0.12/bin/tomcat-juli.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_25.jdk/Contents/Home/lib/tools.jar
[frontend] INFO    2015-01-06 11:47:24,436 [localhost-startStop-2] org.apache.zookeeper.ZooKeeper   - Client environment:java.library.path=/Users/marcelalburg/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.
[frontend] INFO    2015-01-06 11:47:24,436 [localhost-startStop-2] org.apache.zookeeper.ZooKeeper   - Client environment:java.io.tmpdir=/var/folders/n4/mdg8cr_934v9y3rqzcl5t0m00000gp/T/
[frontend] INFO    2015-01-06 11:47:24,436 [localhost-startStop-2] org.apache.zookeeper.ZooKeeper   - Client environment:java.compiler=<NA>
[frontend] INFO    2015-01-06 11:47:24,436 [localhost-startStop-2] org.apache.zookeeper.ZooKeeper   - Client environment:os.name=Mac OS X
[frontend] INFO    2015-01-06 11:47:24,436 [localhost-startStop-2] org.apache.zookeeper.ZooKeeper   - Client environment:os.arch=x86_64
[frontend] INFO    2015-01-06 11:47:24,436 [localhost-startStop-2] org.apache.zookeeper.ZooKeeper   - Client environment:os.version=10.10.1
[frontend] INFO    2015-01-06 11:47:24,436 [localhost-startStop-2] org.apache.zookeeper.ZooKeeper   - Client environment:user.name=marcelalburg
[frontend] INFO    2015-01-06 11:47:24,436 [localhost-startStop-2] org.apache.zookeeper.ZooKeeper   - Client environment:user.home=/Users/marcelalburg
[frontend] INFO    2015-01-06 11:47:24,436 [localhost-startStop-2] org.apache.zookeeper.ZooKeeper   - Client environment:user.dir=/Users/marcelalburg/Documents/sts-3.6.2.RELEASE/STS.app/Contents/MacOS
[frontend] INFO    2015-01-06 11:47:24,438 [localhost-startStop-2] org.apache.zookeeper.ZooKeeper   - Initiating client connection, connectString=127.0.0.1 sessionTimeout=6000 watcher=org.I0Itec.zkclient.ZkClient@39fd8513
[frontend] INFO    2015-01-06 11:47:24,454 [localhost-startStop-2-SendThread()] org.apache.zookeeper.ClientCnxn   - Opening socket connection to server /127.0.0.1:2181
[frontend] INFO    2015-01-06 11:47:24,463 [localhost-startStop-2-SendThread(127.0.0.1:2181)] org.apache.zookeeper.ClientCnxn   - Socket connection established to 127.0.0.1/127.0.0.1:2181, initiating session
[frontend] INFO    2015-01-06 11:47:24,476 [localhost-startStop-2-SendThread(127.0.0.1:2181)] org.apache.zookeeper.ClientCnxn   - Session establishment complete on server 127.0.0.1/127.0.0.1:2181, sessionid = 0x14abed95acd0001, negotiated timeout = 6000
[frontend] INFO    2015-01-06 11:47:24,479 [localhost-startStop-2-EventThread] org.I0Itec.zkclient.ZkClient   - zookeeper state changed (SyncConnected)
[frontend] INFO    2015-01-06 11:47:24,513 [localhost-startStop-2] kafka.consumer.ZookeeperConsumerConnector   - [default_MacBook.local-1420541244399-6e7b513d], starting auto committer every 1000 ms
[frontend] INFO    2015-01-06 11:47:24,541 [localhost-startStop-2] kafka.consumer.ZookeeperConsumerConnector   - [default_MacBook.local-1420541244399-6e7b513d], ZKConsumerConnector shutting down
[frontend] INFO    2015-01-06 11:47:24,544 [localhost-startStop-2] kafka.consumer.ConsumerFetcherManager   - [ConsumerFetcherManager-1420541244493] Stopping leader finder thread
[frontend] INFO    2015-01-06 11:47:24,545 [localhost-startStop-2] kafka.consumer.ConsumerFetcherManager   - [ConsumerFetcherManager-1420541244493] Stopping all fetchers
[frontend] INFO    2015-01-06 11:47:24,555 [localhost-startStop-2] kafka.consumer.ConsumerFetcherManager   - [ConsumerFetcherManager-1420541244493] All connections stopped
[frontend] INFO    2015-01-06 11:47:24,563 [ZkClient-EventThread-25-127.0.0.1] org.I0Itec.zkclient.ZkEventThread   - Terminate ZkClient event thread.
[frontend] INFO    2015-01-06 11:47:24,570 [localhost-startStop-2] org.apache.zookeeper.ZooKeeper   - Session: 0x14abed95acd0001 closed
[frontend] INFO    2015-01-06 11:47:24,570 [localhost-startStop-2-EventThread] org.apache.zookeeper.ClientCnxn   - EventThread shut down
[frontend] INFO    2015-01-06 11:47:24,572 [localhost-startStop-2] kafka.consumer.ZookeeperConsumerConnector   - [default_MacBook.local-1420541244399-6e7b513d], ZKConsumerConnector shut down completed
[frontend] INFO    2015-01-06 11:47:24,573 [localhost-startStop-2] org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor   - Shutting down ExecutorService 'kafkaTaskExecutor'
[frontend] INFO    2015-01-06 11:47:24,574 [localhost-startStop-2] org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler   - Shutting down ExecutorService 'taskScheduler'
[frontend] INFO    2015-01-06 11:47:24,575 [localhost-startStop-2] org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler   - Shutting down ExecutorService 'defaultSockJsTaskScheduler'
Jan 06, 2015 11:47:24 AM org.apache.catalina.core.ApplicationContext log
INFORMATION: Shutting down log4j
Jan 06, 2015 11:47:24 AM org.apache.catalina.loader.WebappClassLoader clearReferencesThreads
WARNUNG: The web application [/spring-integration-kafka-memory-leak] appears to have started a thread named [localhost-startStop-2-SendThread(127.0.0.1:2181)] but has failed to stop it. This is very likely to create a memory leak. Stack trace of thread:
 java.lang.Thread.sleep(Native Method)
 org.apache.zookeeper.ClientCnxn$SendThread.cleanup(ClientCnxn.java:1261)
 org.apache.zookeeper.ClientCnxn$SendThread.run(ClientCnxn.java:1211)
Jan 06, 2015 11:47:24 AM org.apache.coyote.AbstractProtocol stop
INFORMATION: Stopping ProtocolHandler ["http-nio-8080"]

Exception: java.lang.IllegalStateException thrown from the UncaughtExceptionHandler in thread "localhost-startStop-2-SendThread(127.0.0.1:2181)"
Jan 06, 2015 11:47:25 AM org.apache.coyote.AbstractProtocol stop
INFORMATION: Stopping ProtocolHandler ["ajp-nio-8009"]
Jan 06, 2015 11:47:25 AM org.apache.coyote.AbstractProtocol destroy
INFORMATION: Destroying ProtocolHandler ["http-nio-8080"]
Jan 06, 2015 11:47:25 AM org.apache.coyote.AbstractProtocol destroy
INFORMATION: Destroying ProtocolHandler ["ajp-nio-8009"]
```
