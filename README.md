spring-integration-kafka-memory-leak
====================================

```
Jan 06, 2015 11:55:28 AM org.apache.catalina.core.AprLifecycleListener init
INFORMATION: The APR based Apache Tomcat Native library which allows optimal performance in production environments was not found on the java.library.path: /Users/marcelalburg/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.
Jan 06, 2015 11:55:28 AM org.apache.tomcat.util.digester.SetPropertiesRule begin
WARNUNG: [SetPropertiesRule]{Server/Service/Engine/Host/Context} Setting property 'source' to 'org.eclipse.jst.jee.server:spring-integration-kafka-memory-leak' did not find a matching property.
Jan 06, 2015 11:55:28 AM org.apache.coyote.AbstractProtocol init
INFORMATION: Initializing ProtocolHandler ["http-nio-8080"]
Jan 06, 2015 11:55:28 AM org.apache.tomcat.util.net.NioSelectorPool getSharedSelector
INFORMATION: Using a shared selector for servlet write/read
Jan 06, 2015 11:55:28 AM org.apache.coyote.AbstractProtocol init
INFORMATION: Initializing ProtocolHandler ["ajp-nio-8009"]
Jan 06, 2015 11:55:28 AM org.apache.tomcat.util.net.NioSelectorPool getSharedSelector
INFORMATION: Using a shared selector for servlet write/read
Jan 06, 2015 11:55:28 AM org.apache.catalina.startup.Catalina load
INFORMATION: Initialization processed in 788 ms
Jan 06, 2015 11:55:28 AM org.apache.catalina.core.StandardService startInternal
INFORMATION: Starting service Catalina
Jan 06, 2015 11:55:28 AM org.apache.catalina.core.StandardEngine startInternal
INFORMATION: Starting Servlet Engine: Apache Tomcat/8.0.12
Jan 06, 2015 11:55:35 AM org.apache.catalina.core.ApplicationContext log
INFORMATION: Spring WebApplicationInitializers detected on classpath: [org.example.kafkamemoryleak.configuration.AppInitializer@3386ac3c]
log4j:WARN No appenders could be found for logger (org.springframework.web.context.support.StandardServletEnvironment).
log4j:WARN Please initialize the log4j system properly.
log4j:WARN See http://logging.apache.org/log4j/1.2/faq.html#noconfig for more info.
Jan 06, 2015 11:55:35 AM org.apache.catalina.core.ApplicationContext log
INFORMATION: Set web app root system property: 'webapp.root' = [/Users/marcelalburg/Documents/workspace-sts-3.6.1.RELEASE/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/spring-integration-kafka-memory-leak]
Jan 06, 2015 11:55:35 AM org.apache.catalina.core.ApplicationContext log
INFORMATION: Initializing log4j from [/Users/marcelalburg/Documents/workspace-sts-3.6.1.RELEASE/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/spring-integration-kafka-memory-leak/WEB-INF/properties/log4j.xml]
Jan 06, 2015 11:55:35 AM org.apache.catalina.core.ApplicationContext log
INFORMATION: Initializing Spring FrameworkServlet 'dispatcher'
[frontend] INFO    2015-01-06 11:55:35,982 [localhost-startStop-1] org.springframework.web.servlet.DispatcherServlet   - FrameworkServlet 'dispatcher': initialization started
[frontend] INFO    2015-01-06 11:55:35,992 [localhost-startStop-1] org.springframework.web.context.support.XmlWebApplicationContext   - Refreshing WebApplicationContext for namespace 'dispatcher-servlet': startup date [Tue Jan 06 11:55:35 CET 2015]; root of context hierarchy
[frontend] INFO    2015-01-06 11:55:36,057 [localhost-startStop-1] org.springframework.beans.factory.xml.XmlBeanDefinitionReader   - Loading XML bean definitions from ServletContext resource [/WEB-INF/mvc-config.xml]
[frontend] INFO    2015-01-06 11:55:36,286 [localhost-startStop-1] org.springframework.beans.factory.xml.XmlBeanDefinitionReader   - Loading XML bean definitions from ServletContext resource [/WEB-INF/kafka-context.xml]
[frontend] INFO    2015-01-06 11:55:36,429 [localhost-startStop-1] org.springframework.beans.factory.config.PropertiesFactoryBean   - Loading properties file from URL [jar:file:/Users/marcelalburg/Documents/workspace-sts-3.6.1.RELEASE/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/spring-integration-kafka-memory-leak/WEB-INF/lib/spring-integration-core-4.1.0.RELEASE.jar!/META-INF/spring.integration.default.properties]
[frontend] INFO    2015-01-06 11:55:36,446 [localhost-startStop-1] org.springframework.integration.config.IntegrationRegistrar   - No bean named 'integrationHeaderChannelRegistry' has been explicitly defined. Therefore, a default DefaultHeaderChannelRegistry will be created.
[frontend] INFO    2015-01-06 11:55:36,690 [localhost-startStop-1] org.springframework.integration.config.DefaultConfiguringBeanFactoryPostProcessor   - No bean named 'errorChannel' has been explicitly defined. Therefore, a default PublishSubscribeChannel will be created.
[frontend] INFO    2015-01-06 11:55:36,691 [localhost-startStop-1] org.springframework.integration.config.DefaultConfiguringBeanFactoryPostProcessor   - No bean named 'taskScheduler' has been explicitly defined. Therefore, a default ThreadPoolTaskScheduler will be created.
[frontend] INFO    2015-01-06 11:55:37,033 [localhost-startStop-1] org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler   - Initializing ExecutorService  'defaultSockJsTaskScheduler'
[frontend] INFO    2015-01-06 11:55:37,304 [localhost-startStop-1] org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter   - Looking for @ControllerAdvice: WebApplicationContext for namespace 'dispatcher-servlet': startup date [Tue Jan 06 11:55:35 CET 2015]; root of context hierarchy
[frontend] INFO    2015-01-06 11:55:37,490 [localhost-startStop-1] org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter   - Looking for @ControllerAdvice: WebApplicationContext for namespace 'dispatcher-servlet': startup date [Tue Jan 06 11:55:35 CET 2015]; root of context hierarchy
[frontend] INFO    2015-01-06 11:55:37,564 [localhost-startStop-1] org.springframework.web.servlet.handler.SimpleUrlHandlerMapping   - Mapped URL path [/resources/**] onto handler 'org.springframework.web.servlet.resource.ResourceHttpRequestHandler#0'
[frontend] INFO    2015-01-06 11:55:37,673 [localhost-startStop-1] org.springframework.beans.factory.config.PropertiesFactoryBean   - Loading properties file from URL [jar:file:/Users/marcelalburg/Documents/workspace-sts-3.6.1.RELEASE/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/spring-integration-kafka-memory-leak/WEB-INF/lib/spring-integration-core-4.1.0.RELEASE.jar!/META-INF/spring.integration.default.properties]
[frontend] INFO    2015-01-06 11:55:37,720 [localhost-startStop-1] org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler   - Initializing ExecutorService  'taskScheduler'
[frontend] INFO    2015-01-06 11:55:37,817 [localhost-startStop-1] org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor   - Initializing ExecutorService  'kafkaTaskExecutor'
[frontend] INFO    2015-01-06 11:55:37,847 [localhost-startStop-1] org.springframework.integration.kafka.support.ConsumerConfigFactoryBean   - Using consumer properties => {group.id=default, fetch.message.max.bytes=5242880, consumer.timeout.ms=4000, auto.offset.reset=smallest, zookeeper.sync.time.ms=2000, zookeeper.session.timeout.ms=6000, zookeeper.connect=127.0.0.1, socket.receive.buffer.bytes=10485760, auto.commit.interval.ms=1000}
[frontend] INFO    2015-01-06 11:55:38,415 [localhost-startStop-1] kafka.utils.VerifiableProperties   - Verifying properties
[frontend] INFO    2015-01-06 11:55:38,502 [localhost-startStop-1] kafka.utils.VerifiableProperties   - Property auto.commit.interval.ms is overridden to 1000
[frontend] INFO    2015-01-06 11:55:38,502 [localhost-startStop-1] kafka.utils.VerifiableProperties   - Property auto.offset.reset is overridden to smallest
[frontend] INFO    2015-01-06 11:55:38,503 [localhost-startStop-1] kafka.utils.VerifiableProperties   - Property consumer.timeout.ms is overridden to 4000
[frontend] INFO    2015-01-06 11:55:38,503 [localhost-startStop-1] kafka.utils.VerifiableProperties   - Property fetch.message.max.bytes is overridden to 5242880
[frontend] INFO    2015-01-06 11:55:38,503 [localhost-startStop-1] kafka.utils.VerifiableProperties   - Property group.id is overridden to default
[frontend] INFO    2015-01-06 11:55:38,503 [localhost-startStop-1] kafka.utils.VerifiableProperties   - Property socket.receive.buffer.bytes is overridden to 10485760
[frontend] INFO    2015-01-06 11:55:38,503 [localhost-startStop-1] kafka.utils.VerifiableProperties   - Property zookeeper.connect is overridden to 127.0.0.1
[frontend] INFO    2015-01-06 11:55:38,503 [localhost-startStop-1] kafka.utils.VerifiableProperties   - Property zookeeper.session.timeout.ms is overridden to 6000
[frontend] INFO    2015-01-06 11:55:38,504 [localhost-startStop-1] kafka.utils.VerifiableProperties   - Property zookeeper.sync.time.ms is overridden to 2000
[frontend] INFO    2015-01-06 11:55:38,551 [localhost-startStop-1] org.springframework.integration.endpoint.SourcePollingChannelAdapter   - started kafka-inbound-channel-adapter
[frontend] WARN    2015-01-06 11:55:38,563 [localhost-startStop-1] org.springframework.web.servlet.handler.SimpleUrlHandlerMapping   - Neither 'urlMap' nor 'mappings' set on SimpleUrlHandlerMapping
[frontend] INFO    2015-01-06 11:55:38,591 [kafkaTaskExecutor-1] kafka.consumer.ZookeeperConsumerConnector   - [default_MacBook.local-1420541738588-56bc7077], Connecting to zookeeper instance at 127.0.0.1
[frontend] INFO    2015-01-06 11:55:38,611 [ZkClient-EventThread-18-127.0.0.1] org.I0Itec.zkclient.ZkEventThread   - Starting ZkClient event thread.
[frontend] INFO    2015-01-06 11:55:38,627 [kafkaTaskExecutor-1] org.apache.zookeeper.ZooKeeper   - Client environment:zookeeper.version=3.3.3-1203054, built on 11/17/2011 05:47 GMT
[frontend] INFO    2015-01-06 11:55:38,627 [kafkaTaskExecutor-1] org.apache.zookeeper.ZooKeeper   - Client environment:host.name=127.0.0.1
[frontend] INFO    2015-01-06 11:55:38,627 [kafkaTaskExecutor-1] org.apache.zookeeper.ZooKeeper   - Client environment:java.version=1.8.0_25
[frontend] INFO    2015-01-06 11:55:38,628 [kafkaTaskExecutor-1] org.apache.zookeeper.ZooKeeper   - Client environment:java.vendor=Oracle Corporation
[frontend] INFO    2015-01-06 11:55:38,628 [kafkaTaskExecutor-1] org.apache.zookeeper.ZooKeeper   - Client environment:java.home=/Library/Java/JavaVirtualMachines/jdk1.8.0_25.jdk/Contents/Home/jre
[frontend] INFO    2015-01-06 11:55:38,628 [kafkaTaskExecutor-1] org.apache.zookeeper.ZooKeeper   - Client environment:java.class.path=/opt/apache-tomcat-8.0.12/bin/bootstrap.jar:/opt/apache-tomcat-8.0.12/bin/tomcat-juli.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_25.jdk/Contents/Home/lib/tools.jar
[frontend] INFO    2015-01-06 11:55:38,628 [kafkaTaskExecutor-1] org.apache.zookeeper.ZooKeeper   - Client environment:java.library.path=/Users/marcelalburg/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.
[frontend] INFO    2015-01-06 11:55:38,628 [kafkaTaskExecutor-1] org.apache.zookeeper.ZooKeeper   - Client environment:java.io.tmpdir=/var/folders/n4/mdg8cr_934v9y3rqzcl5t0m00000gp/T/
[frontend] INFO    2015-01-06 11:55:38,628 [kafkaTaskExecutor-1] org.apache.zookeeper.ZooKeeper   - Client environment:java.compiler=<NA>
[frontend] INFO    2015-01-06 11:55:38,628 [kafkaTaskExecutor-1] org.apache.zookeeper.ZooKeeper   - Client environment:os.name=Mac OS X
[frontend] INFO    2015-01-06 11:55:38,628 [kafkaTaskExecutor-1] org.apache.zookeeper.ZooKeeper   - Client environment:os.arch=x86_64
[frontend] INFO    2015-01-06 11:55:38,628 [kafkaTaskExecutor-1] org.apache.zookeeper.ZooKeeper   - Client environment:os.version=10.10.1
[frontend] INFO    2015-01-06 11:55:38,628 [kafkaTaskExecutor-1] org.apache.zookeeper.ZooKeeper   - Client environment:user.name=marcelalburg
[frontend] INFO    2015-01-06 11:55:38,628 [kafkaTaskExecutor-1] org.apache.zookeeper.ZooKeeper   - Client environment:user.home=/Users/marcelalburg
[frontend] INFO    2015-01-06 11:55:38,628 [kafkaTaskExecutor-1] org.apache.zookeeper.ZooKeeper   - Client environment:user.dir=/Users/marcelalburg/Documents/sts-3.6.2.RELEASE/STS.app/Contents/MacOS
[frontend] INFO    2015-01-06 11:55:38,630 [kafkaTaskExecutor-1] org.apache.zookeeper.ZooKeeper   - Initiating client connection, connectString=127.0.0.1 sessionTimeout=6000 watcher=org.I0Itec.zkclient.ZkClient@724aa9d7
[frontend] INFO    2015-01-06 11:55:38,633 [localhost-startStop-1] org.springframework.context.support.DefaultLifecycleProcessor   - Starting beans in phase -2147483648
[frontend] INFO    2015-01-06 11:55:38,636 [localhost-startStop-1] org.springframework.context.support.DefaultLifecycleProcessor   - Starting beans in phase 0
[frontend] INFO    2015-01-06 11:55:38,637 [localhost-startStop-1] org.springframework.integration.endpoint.EventDrivenConsumer   - Adding {logging-channel-adapter:logInputFromKafka.adapter} as a subscriber to the 'logInputFromKafka' channel
[frontend] INFO    2015-01-06 11:55:38,639 [localhost-startStop-1] org.springframework.integration.channel.DirectChannel   - Channel 'org.springframework.web.context.WebApplicationContext:/spring-integration-kafka-memory-leak/dispatcher.logInputFromKafka' has 1 subscriber(s).
[frontend] INFO    2015-01-06 11:55:38,639 [localhost-startStop-1] org.springframework.integration.endpoint.EventDrivenConsumer   - started logInputFromKafka.adapter
[frontend] INFO    2015-01-06 11:55:38,640 [localhost-startStop-1] org.springframework.integration.endpoint.EventDrivenConsumer   - Adding {logging-channel-adapter:_org.springframework.integration.errorLogger} as a subscriber to the 'errorChannel' channel
[frontend] INFO    2015-01-06 11:55:38,640 [localhost-startStop-1] org.springframework.integration.channel.PublishSubscribeChannel   - Channel 'org.springframework.web.context.WebApplicationContext:/spring-integration-kafka-memory-leak/dispatcher.errorChannel' has 1 subscriber(s).
[frontend] INFO    2015-01-06 11:55:38,640 [localhost-startStop-1] org.springframework.integration.endpoint.EventDrivenConsumer   - started _org.springframework.integration.errorLogger
[frontend] INFO    2015-01-06 11:55:38,655 [kafkaTaskExecutor-1-SendThread()] org.apache.zookeeper.ClientCnxn   - Opening socket connection to server /127.0.0.1:2181
[frontend] INFO    2015-01-06 11:55:38,668 [kafkaTaskExecutor-1-SendThread(127.0.0.1:2181)] org.apache.zookeeper.ClientCnxn   - Socket connection established to 127.0.0.1/127.0.0.1:2181, initiating session
[frontend] INFO    2015-01-06 11:55:38,681 [kafkaTaskExecutor-1-SendThread(127.0.0.1:2181)] org.apache.zookeeper.ClientCnxn   - Session establishment complete on server 127.0.0.1/127.0.0.1:2181, sessionid = 0x14abed95acd0002, negotiated timeout = 6000
[frontend] INFO    2015-01-06 11:55:38,684 [kafkaTaskExecutor-1-EventThread] org.I0Itec.zkclient.ZkClient   - zookeeper state changed (SyncConnected)
[frontend] INFO    2015-01-06 11:55:38,690 [localhost-startStop-1] org.springframework.web.servlet.DispatcherServlet   - FrameworkServlet 'dispatcher': initialization completed in 2701 ms
Jan 06, 2015 11:55:38 AM org.apache.coyote.AbstractProtocol start
INFORMATION: Starting ProtocolHandler ["http-nio-8080"]
Jan 06, 2015 11:55:38 AM org.apache.coyote.AbstractProtocol start
INFORMATION: Starting ProtocolHandler ["ajp-nio-8009"]
Jan 06, 2015 11:55:38 AM org.apache.catalina.startup.Catalina start
INFORMATION: Server startup in 9818 ms
[frontend] INFO    2015-01-06 11:55:38,709 [kafkaTaskExecutor-1] kafka.consumer.ZookeeperConsumerConnector   - [default_MacBook.local-1420541738588-56bc7077], starting auto committer every 1000 ms
[frontend] INFO    2015-01-06 11:55:38,807 [kafkaTaskExecutor-1] kafka.consumer.ZookeeperConsumerConnector   - [default_MacBook.local-1420541738588-56bc7077], begin registering consumer default_MacBook.local-1420541738588-56bc7077 in ZK
[frontend] INFO    2015-01-06 11:55:38,884 [kafkaTaskExecutor-1] kafka.consumer.ZookeeperConsumerConnector   - [default_MacBook.local-1420541738588-56bc7077], end registering consumer default_MacBook.local-1420541738588-56bc7077 in ZK
[frontend] INFO    2015-01-06 11:55:38,891 [default_MacBook.local-1420541738588-56bc7077_watcher_executor] kafka.consumer.ZookeeperConsumerConnector   - [default_MacBook.local-1420541738588-56bc7077], starting watcher executor thread for consumer default_MacBook.local-1420541738588-56bc7077
[frontend] INFO    2015-01-06 11:55:38,953 [kafkaTaskExecutor-1] kafka.consumer.ZookeeperConsumerConnector   - [default_MacBook.local-1420541738588-56bc7077], begin rebalancing consumer default_MacBook.local-1420541738588-56bc7077 try #0
[frontend] INFO    2015-01-06 11:55:39,352 [kafkaTaskExecutor-1] kafka.consumer.ConsumerFetcherManager   - [ConsumerFetcherManager-1420541738691] Stopping leader finder thread
[frontend] INFO    2015-01-06 11:55:39,354 [kafkaTaskExecutor-1] kafka.consumer.ConsumerFetcherManager   - [ConsumerFetcherManager-1420541738691] Stopping all fetchers
[frontend] INFO    2015-01-06 11:55:39,358 [kafkaTaskExecutor-1] kafka.consumer.ConsumerFetcherManager   - [ConsumerFetcherManager-1420541738691] All connections stopped
[frontend] INFO    2015-01-06 11:55:39,361 [kafkaTaskExecutor-1] kafka.consumer.ZookeeperConsumerConnector   - [default_MacBook.local-1420541738588-56bc7077], Cleared all relevant queues for this fetcher
[frontend] INFO    2015-01-06 11:55:39,366 [kafkaTaskExecutor-1] kafka.consumer.ZookeeperConsumerConnector   - [default_MacBook.local-1420541738588-56bc7077], Cleared the data chunks in all the consumer message iterators
[frontend] INFO    2015-01-06 11:55:39,367 [kafkaTaskExecutor-1] kafka.consumer.ZookeeperConsumerConnector   - [default_MacBook.local-1420541738588-56bc7077], Committing all offsets after clearing the fetcher queues
[frontend] INFO    2015-01-06 11:55:39,371 [kafkaTaskExecutor-1] kafka.consumer.ZookeeperConsumerConnector   - [default_MacBook.local-1420541738588-56bc7077], Releasing partition ownership
[frontend] INFO    2015-01-06 11:55:39,379 [kafkaTaskExecutor-1] kafka.consumer.ZookeeperConsumerConnector   - [default_MacBook.local-1420541738588-56bc7077], Consumer default_MacBook.local-1420541738588-56bc7077 rebalancing the following partitions: ArrayBuffer(0) for topic test with consumers: List(default_MacBook.local-1420541738588-56bc7077-0)
[frontend] INFO    2015-01-06 11:55:39,385 [kafkaTaskExecutor-1] kafka.consumer.ZookeeperConsumerConnector   - [default_MacBook.local-1420541738588-56bc7077], default_MacBook.local-1420541738588-56bc7077-0 attempting to claim partition 0
[frontend] INFO    2015-01-06 11:55:39,461 [kafkaTaskExecutor-1] kafka.consumer.ZookeeperConsumerConnector   - [default_MacBook.local-1420541738588-56bc7077], default_MacBook.local-1420541738588-56bc7077-0 successfully owned partition 0 for topic test
[frontend] INFO    2015-01-06 11:55:39,464 [kafkaTaskExecutor-1] kafka.consumer.ZookeeperConsumerConnector   - [default_MacBook.local-1420541738588-56bc7077], Updating the cache
[frontend] INFO    2015-01-06 11:55:39,472 [kafkaTaskExecutor-1] kafka.consumer.ZookeeperConsumerConnector   - [default_MacBook.local-1420541738588-56bc7077], Consumer default_MacBook.local-1420541738588-56bc7077 selected partitions : test:0: fetched offset = -1: consumed offset = -1
[frontend] INFO    2015-01-06 11:55:39,477 [default_MacBook.local-1420541738588-56bc7077-leader-finder-thread] kafka.consumer.ConsumerFetcherManager$LeaderFinderThread   - [default_MacBook.local-1420541738588-56bc7077-leader-finder-thread], Starting 
[frontend] INFO    2015-01-06 11:55:39,483 [kafkaTaskExecutor-1] kafka.consumer.ZookeeperConsumerConnector   - [default_MacBook.local-1420541738588-56bc7077], end rebalancing consumer default_MacBook.local-1420541738588-56bc7077 try #0
[frontend] INFO    2015-01-06 11:55:39,521 [default_MacBook.local-1420541738588-56bc7077-leader-finder-thread] kafka.utils.VerifiableProperties   - Verifying properties
[frontend] INFO    2015-01-06 11:55:39,522 [default_MacBook.local-1420541738588-56bc7077-leader-finder-thread] kafka.utils.VerifiableProperties   - Property client.id is overridden to default
[frontend] INFO    2015-01-06 11:55:39,522 [default_MacBook.local-1420541738588-56bc7077-leader-finder-thread] kafka.utils.VerifiableProperties   - Property metadata.broker.list is overridden to 127.0.0.1:9092
[frontend] INFO    2015-01-06 11:55:39,522 [default_MacBook.local-1420541738588-56bc7077-leader-finder-thread] kafka.utils.VerifiableProperties   - Property request.timeout.ms is overridden to 30000
[frontend] INFO    2015-01-06 11:55:39,573 [default_MacBook.local-1420541738588-56bc7077-leader-finder-thread] kafka.client.ClientUtils$   - Fetching metadata from broker id:0,host:127.0.0.1,port:9092 with correlation id 0 for 1 topic(s) Set(test)
[frontend] INFO    2015-01-06 11:55:39,582 [default_MacBook.local-1420541738588-56bc7077-leader-finder-thread] kafka.producer.SyncProducer   - Connected to 127.0.0.1:9092 for producing
[frontend] INFO    2015-01-06 11:55:39,665 [default_MacBook.local-1420541738588-56bc7077-leader-finder-thread] kafka.producer.SyncProducer   - Disconnecting from 127.0.0.1:9092
[frontend] INFO    2015-01-06 11:55:39,703 [ConsumerFetcherThread-default_MacBook.local-1420541738588-56bc7077-0-0] kafka.consumer.ConsumerFetcherThread   - [ConsumerFetcherThread-default_MacBook.local-1420541738588-56bc7077-0-0], Starting 
[frontend] INFO    2015-01-06 11:55:39,771 [default_MacBook.local-1420541738588-56bc7077-leader-finder-thread] kafka.consumer.ConsumerFetcherManager   - [ConsumerFetcherManager-1420541738691] Added fetcher for partitions ArrayBuffer([[test,0], initOffset -1 to broker id:0,host:127.0.0.1,port:9092] )
Jan 06, 2015 11:55:56 AM org.apache.catalina.core.StandardServer await
INFORMATION: A valid shutdown command was received via the shutdown port. Stopping the Server instance.
Jan 06, 2015 11:55:56 AM org.apache.coyote.AbstractProtocol pause
INFORMATION: Pausing ProtocolHandler ["http-nio-8080"]
Jan 06, 2015 11:55:57 AM org.apache.coyote.AbstractProtocol pause
INFORMATION: Pausing ProtocolHandler ["ajp-nio-8009"]
Jan 06, 2015 11:55:57 AM org.apache.catalina.core.StandardService stopInternal
INFORMATION: Stopping service Catalina
Jan 06, 2015 11:55:57 AM org.apache.catalina.core.ApplicationContext log
INFORMATION: Destroying Spring FrameworkServlet 'dispatcher'
[frontend] INFO    2015-01-06 11:55:57,614 [localhost-startStop-2] org.springframework.web.context.support.XmlWebApplicationContext   - Closing WebApplicationContext for namespace 'dispatcher-servlet': startup date [Tue Jan 06 11:55:35 CET 2015]; root of context hierarchy
[frontend] INFO    2015-01-06 11:55:57,616 [localhost-startStop-2] org.springframework.context.support.DefaultLifecycleProcessor   - Stopping beans in phase 1073741823
[frontend] INFO    2015-01-06 11:55:57,619 [localhost-startStop-2] org.springframework.integration.endpoint.SourcePollingChannelAdapter   - stopped kafka-inbound-channel-adapter
[frontend] INFO    2015-01-06 11:55:57,619 [localhost-startStop-2] org.springframework.context.support.DefaultLifecycleProcessor   - Stopping beans in phase 0
[frontend] INFO    2015-01-06 11:55:57,620 [localhost-startStop-2] org.springframework.integration.endpoint.EventDrivenConsumer   - Removing {logging-channel-adapter:logInputFromKafka.adapter} as a subscriber to the 'logInputFromKafka' channel
[frontend] INFO    2015-01-06 11:55:57,620 [localhost-startStop-2] org.springframework.integration.channel.DirectChannel   - Channel 'org.springframework.web.context.WebApplicationContext:/spring-integration-kafka-memory-leak/dispatcher.logInputFromKafka' has 0 subscriber(s).
[frontend] INFO    2015-01-06 11:55:57,620 [localhost-startStop-2] org.springframework.integration.endpoint.EventDrivenConsumer   - stopped logInputFromKafka.adapter
[frontend] INFO    2015-01-06 11:55:57,620 [localhost-startStop-2] org.springframework.integration.endpoint.EventDrivenConsumer   - Removing {logging-channel-adapter:_org.springframework.integration.errorLogger} as a subscriber to the 'errorChannel' channel
[frontend] INFO    2015-01-06 11:55:57,620 [localhost-startStop-2] org.springframework.integration.channel.PublishSubscribeChannel   - Channel 'org.springframework.web.context.WebApplicationContext:/spring-integration-kafka-memory-leak/dispatcher.errorChannel' has 0 subscriber(s).
[frontend] INFO    2015-01-06 11:55:57,620 [localhost-startStop-2] org.springframework.integration.endpoint.EventDrivenConsumer   - stopped _org.springframework.integration.errorLogger
[frontend] INFO    2015-01-06 11:55:57,620 [localhost-startStop-2] org.springframework.context.support.DefaultLifecycleProcessor   - Stopping beans in phase -2147483648
[frontend] INFO    2015-01-06 11:55:58,627 [localhost-startStop-2] kafka.consumer.ZookeeperConsumerConnector   - [default_MacBook.local-1420541738588-56bc7077], ZKConsumerConnector shutting down
[frontend] INFO    2015-01-06 11:55:58,629 [localhost-startStop-2] kafka.consumer.ConsumerFetcherManager   - [ConsumerFetcherManager-1420541738691] Stopping leader finder thread
[frontend] INFO    2015-01-06 11:55:58,630 [localhost-startStop-2] kafka.consumer.ConsumerFetcherManager$LeaderFinderThread   - [default_MacBook.local-1420541738588-56bc7077-leader-finder-thread], Shutting down
[frontend] INFO    2015-01-06 11:55:58,631 [default_MacBook.local-1420541738588-56bc7077-leader-finder-thread] kafka.consumer.ConsumerFetcherManager$LeaderFinderThread   - [default_MacBook.local-1420541738588-56bc7077-leader-finder-thread], Stopped 
[frontend] INFO    2015-01-06 11:55:58,632 [localhost-startStop-2] kafka.consumer.ConsumerFetcherManager$LeaderFinderThread   - [default_MacBook.local-1420541738588-56bc7077-leader-finder-thread], Shutdown completed
[frontend] INFO    2015-01-06 11:55:58,632 [localhost-startStop-2] kafka.consumer.ConsumerFetcherManager   - [ConsumerFetcherManager-1420541738691] Stopping all fetchers
[frontend] INFO    2015-01-06 11:55:58,632 [localhost-startStop-2] kafka.consumer.ConsumerFetcherThread   - [ConsumerFetcherThread-default_MacBook.local-1420541738588-56bc7077-0-0], Shutting down
[frontend] WARN    2015-01-06 11:55:58,635 [ConsumerFetcherThread-default_MacBook.local-1420541738588-56bc7077-0-0] kafka.consumer.SimpleConsumer   - Reconnect due to socket error: null
[frontend] INFO    2015-01-06 11:55:58,637 [ConsumerFetcherThread-default_MacBook.local-1420541738588-56bc7077-0-0] kafka.consumer.ConsumerFetcherThread   - [ConsumerFetcherThread-default_MacBook.local-1420541738588-56bc7077-0-0], Stopped 
[frontend] INFO    2015-01-06 11:55:58,637 [localhost-startStop-2] kafka.consumer.ConsumerFetcherThread   - [ConsumerFetcherThread-default_MacBook.local-1420541738588-56bc7077-0-0], Shutdown completed
[frontend] INFO    2015-01-06 11:55:58,637 [localhost-startStop-2] kafka.consumer.ConsumerFetcherManager   - [ConsumerFetcherManager-1420541738691] All connections stopped
[frontend] INFO    2015-01-06 11:55:58,643 [ZkClient-EventThread-18-127.0.0.1] org.I0Itec.zkclient.ZkEventThread   - Terminate ZkClient event thread.
Exception in thread "kafkaTaskExecutor-1" org.springframework.messaging.core.DestinationResolutionException: failed to look up MessageChannel with name 'errorChannel' in the BeanFactory.; nested exception is org.springframework.beans.factory.BeanCreationNotAllowedException: Error creating bean with name 'errorChannel': Singleton bean creation not allowed while the singletons of this factory are in destruction (Do not request a bean from a BeanFactory in a destroy method implementation!)
	at org.springframework.integration.support.channel.BeanFactoryChannelResolver.resolveDestination(BeanFactoryChannelResolver.java:108)
	at org.springframework.integration.support.channel.BeanFactoryChannelResolver.resolveDestination(BeanFactoryChannelResolver.java:44)
	at org.springframework.integration.channel.MessagePublishingErrorHandler.resolveErrorChannel(MessagePublishingErrorHandler.java:111)
	at org.springframework.integration.channel.MessagePublishingErrorHandler.handleError(MessagePublishingErrorHandler.java:78)
	at org.springframework.integration.util.ErrorHandlingTaskExecutor$1.run(ErrorHandlingTaskExecutor.java:55)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
	at java.lang.Thread.run(Thread.java:745)
Caused by: org.springframework.beans.factory.BeanCreationNotAllowedException: Error creating bean with name 'errorChannel': Singleton bean creation not allowed while the singletons of this factory are in destruction (Do not request a bean from a BeanFactory in a destroy method implementation!)
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:215)
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:298)
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:198)
	at org.springframework.integration.support.channel.BeanFactoryChannelResolver.resolveDestination(BeanFactoryChannelResolver.java:99)
	... 7 more
[frontend] INFO    2015-01-06 11:55:58,651 [localhost-startStop-2] org.apache.zookeeper.ZooKeeper   - Session: 0x14abed95acd0002 closed
[frontend] INFO    2015-01-06 11:55:58,652 [kafkaTaskExecutor-1-EventThread] org.apache.zookeeper.ClientCnxn   - EventThread shut down
[frontend] INFO    2015-01-06 11:55:58,652 [localhost-startStop-2] kafka.consumer.ZookeeperConsumerConnector   - [default_MacBook.local-1420541738588-56bc7077], ZKConsumerConnector shut down completed
[frontend] INFO    2015-01-06 11:55:58,653 [localhost-startStop-2] org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor   - Shutting down ExecutorService 'kafkaTaskExecutor'
[frontend] INFO    2015-01-06 11:55:58,654 [localhost-startStop-2] org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler   - Shutting down ExecutorService 'taskScheduler'
[frontend] INFO    2015-01-06 11:55:58,655 [localhost-startStop-2] org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler   - Shutting down ExecutorService 'defaultSockJsTaskScheduler'
Jan 06, 2015 11:55:58 AM org.apache.catalina.core.ApplicationContext log
INFORMATION: Shutting down log4j
Jan 06, 2015 11:55:58 AM org.apache.catalina.loader.WebappClassLoader clearReferencesThreads
WARNUNG: The web application [/spring-integration-kafka-memory-leak] appears to have started a thread named [kafkaTaskExecutor-1-SendThread(127.0.0.1:2181)] but has failed to stop it. This is very likely to create a memory leak. Stack trace of thread:
 java.lang.Thread.sleep(Native Method)
 org.apache.zookeeper.ClientCnxn$SendThread.cleanup(ClientCnxn.java:1261)
 org.apache.zookeeper.ClientCnxn$SendThread.run(ClientCnxn.java:1211)
Jan 06, 2015 11:55:58 AM org.apache.catalina.loader.WebappClassLoader clearReferencesThreads
WARNUNG: The web application [/spring-integration-kafka-memory-leak] appears to have started a thread named [default_MacBook.local-1420541738588-56bc7077_watcher_executor] but has failed to stop it. This is very likely to create a memory leak. Stack trace of thread:
 sun.misc.Unsafe.park(Native Method)
 java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
 java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.await(AbstractQueuedSynchronizer.java:2163)
 kafka.consumer.ZookeeperConsumerConnector$ZKRebalancerListener$$anon$1.run(ZookeeperConsumerConnector.scala:348)
Jan 06, 2015 11:55:58 AM org.apache.catalina.loader.WebappClassLoader clearReferencesThreads
WARNUNG: The web application [/spring-integration-kafka-memory-leak] appears to have started a thread named [pool-1-thread-1] but has failed to stop it. This is very likely to create a memory leak. Stack trace of thread:
 sun.misc.Unsafe.park(Native Method)
 java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:215)
 java.util.concurrent.SynchronousQueue$TransferStack.awaitFulfill(SynchronousQueue.java:460)
 java.util.concurrent.SynchronousQueue$TransferStack.transfer(SynchronousQueue.java:362)
 java.util.concurrent.SynchronousQueue.poll(SynchronousQueue.java:941)
 java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1066)
 java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1127)
 java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
 java.lang.Thread.run(Thread.java:745)
Jan 06, 2015 11:55:58 AM org.apache.catalina.loader.WebappClassLoader checkThreadLocalMapForLeaks
SCHWERWIEGEND: The web application [/spring-integration-kafka-memory-leak] created a ThreadLocal with key of type [scala.util.DynamicVariable$$anon$1] (value [scala.util.DynamicVariable$$anon$1@526effe5]) and a value of type [scala.Some] (value [Some([1.91] failure: end of input

{"jmx_port":-1,"timestamp":"1420541126553","host":"127.0.0.1","version":1,"port":9092}
                                                                                          ^)]) but failed to remove it when the web application was stopped. Threads are going to be renewed over time to try and avoid a probable memory leak.
Jan 06, 2015 11:55:58 AM org.apache.catalina.loader.WebappClassLoader checkThreadLocalMapForLeaks
SCHWERWIEGEND: The web application [/spring-integration-kafka-memory-leak] created a ThreadLocal with key of type [scala.util.DynamicVariable$$anon$1] (value [scala.util.DynamicVariable$$anon$1@202d458a]) and a value of type [scala.None$] (value [None]) but failed to remove it when the web application was stopped. Threads are going to be renewed over time to try and avoid a probable memory leak.
Jan 06, 2015 11:55:58 AM org.apache.coyote.AbstractProtocol stop
INFORMATION: Stopping ProtocolHandler ["http-nio-8080"]

Exception: java.lang.IllegalStateException thrown from the UncaughtExceptionHandler in thread "kafkaTaskExecutor-1-SendThread(127.0.0.1:2181)"
Exception in thread "default_MacBook.local-1420541738588-56bc7077_watcher_executor" java.lang.IllegalStateException: Can't overwrite cause with java.lang.IllegalStateException: Illegal access: this web application instance has been stopped already.  Could not load kafka.consumer.ZookeeperConsumerConnector$ZKRebalancerListener$$anon$1$$anonfun$run$4.  The eventual following stack trace is caused by an error thrown for debugging purposes as well as to attempt to terminate the thread which caused the illegal access, and has no functional impact.
	at java.lang.Throwable.initCause(Throwable.java:457)
	at org.apache.catalina.loader.WebappClassLoader.checkStateForClassLoading(WebappClassLoader.java:1331)
	at org.apache.catalina.loader.WebappClassLoader.loadClass(WebappClassLoader.java:1212)
	at org.apache.catalina.loader.WebappClassLoader.loadClass(WebappClassLoader.java:1173)
	at kafka.consumer.ZookeeperConsumerConnector$ZKRebalancerListener$$anon$1.run(ZookeeperConsumerConnector.scala:360)
Caused by: java.lang.ClassNotFoundException
	at org.apache.catalina.loader.WebappClassLoader.checkStateForClassLoading(WebappClassLoader.java:1330)
	... 3 more
Jan 06, 2015 11:55:59 AM org.apache.coyote.AbstractProtocol stop
INFORMATION: Stopping ProtocolHandler ["ajp-nio-8009"]
Jan 06, 2015 11:55:59 AM org.apache.coyote.AbstractProtocol destroy
INFORMATION: Destroying ProtocolHandler ["http-nio-8080"]
Jan 06, 2015 11:55:59 AM org.apache.coyote.AbstractProtocol destroy
INFORMATION: Destroying ProtocolHandler ["ajp-nio-8009"]

```
