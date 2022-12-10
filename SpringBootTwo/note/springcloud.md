一、springcloud的介绍


微服务架构的4个核心问题：
    1、服务太多，客户端如何去访问？    api
    2、服务之间如何通信？            HTTP/RPC
    3、如何治理服务？               注册与发现
    4、服务挂了怎么办?              熔断机制


如何解决这四个问题？

    1、springcloud NetFlix （一站式解决方案）
        api网关：
        Fegin：
        服务注册发现：Eureka
        熔断机制：Hystrix

    2、springcloud Alibaba  （一站式解决方案,更简单）


    3、apache dubbo zookeeper



常见的微服务面试题：
    1、什么是微服务？
        关注于一个点，具体解决某一个问题的一个服务应用。可以类比于一个模块项目，一个模块就做一件事！

    8、eureka与zookeeper的区别？
    2、微服务之间如何独立通信？
    3、springcloud和dubbo的区别？
    4、谈谈springboot和springcloud的理解？
        springboot专注于单个微服务开发；
        springcloud关注于全局的微服务协调治理框架，它将一个个单体微服务整合并管理起来;
        springcloud离不开springboot。
        



    5、服务熔断与服务降级？
    6、微服务的优缺点？
    7、列举微服务的技术栈？
        服务开发：spring、springboot。
        服务注册：eureka、zookeeper
        服务熔断：
        消息队列：rabbitmq
        …………



  


