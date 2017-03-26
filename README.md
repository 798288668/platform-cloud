# platform-cloud

##spring-cloud-consul：
使用Raft一致性算法，能保证分布式集群内各节点状态一致
提供服务注册、服务发现、服务状态检查
支持HTTP、DNS等协议
提供分布式一致性KV存储

###实现功能：
服务注册，引用了srping-cloud-consul的项目可以自动注册服务，也可以通过HTTP接口手动注册，Docker容器也可以自动注册
服务健康状态检查，Consul可以自动维护健康的服务列表
异构系统可以直接通过Consul的HTTP接口拉取并监视服务列表，或者直接使用DNS解析服务
通过分布式一致性KV存储进行微服务的配置下发
为一些业务提供选主和分布式锁服务