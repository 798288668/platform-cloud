# platform-cloud

### 基于Spring Cloud的微服务实践

##### 框架选型
* Eureka：使用Spring Cloud Netflix中的Eureka实现高可用HA的服务注册中心以及服务注册与发现；

* Spring Cloud Feign：服务间通过Feign实现服务的消费以及基于Ribbon的负载均衡；

* Spring Cloud Config：通过Spring Cloud Config实现了应用多环境的外部化配置以及版本管理。

* Spring Cloud Hystrix：使用Hystrix的融断机制来避免在微服务架构中个别服务出现异常时引起的故障蔓延。

* Spring Cloud Zuul：通过Zuul为接入层服务提供API网关服务，帮助实现接口的动态路由、认证鉴权、静态应答处理等。
    
* Spring Cloud Bus：通过Bus+kafka实现对配置信息的实时更新。可以向其中任何一个实例发送POST请求（/bus/refresh）实现所有实例配置信息的动态更新。

* Spring Cloud Security：未完成

* Swagger UI：使用Swagger UI实现自文档的微服务，写好接口即有文档，即可调试。

* spring-cloud-consul(后面替换eureka)：
    > Consul的优势：
    > * 使用Raft一致性算法，能保证分布式集群内各节点状态一致
    > * 提供服务注册、服务发现、服务状态检查
    > * 支持HTTP、DNS等协议
    > * 提供分布式一致性KV存储
    
    > 实现功能：
    服务注册，引用了srping-cloud-consul的项目可以自动注册服务，也可以通过HTTP接口手动注册，Docker容器也可以自动注册。
    服务健康状态检查，Consul可以自动维护健康的服务列表。
    异构系统可以直接通过Consul的HTTP接口拉取并监视服务列表，或者直接使用DNS解析服务。
    通过分布式一致性KV存储进行微服务的配置下发。
    为一些业务提供选主和分布式锁服务。

分布式事务解决方案：CQRS+Event Sourcing