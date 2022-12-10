 一、springboot的介绍
    Spring就是一个轻量级的控制反转（IOC）和面向切面编程（AOP）的框架。 
Spring Boot框架基本上是Spring框架的扩展，它消除了设置Spring应用程序所需的复杂例行配置


约定大于配置:
    在springboot中的一种开发原则，就是为了减少人为的配置，能使用默认配置就使用默认配置，默认配置其实就是所谓的“约定”。
当存在特殊需求的时候，我们再自行自定义配置覆盖掉默认配置即可，这样就可以大大的减少配置工作，提高我们的工作效率。




二、第一个springboot程序原理初步探索

自动配置部分：
    依赖配置文件pom.xml：

        核心依赖项：此为项目的核心依赖，里面存放了版本仓库（在引入一些springboot依赖时，可以不需要指定版本）
            “<parent>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-parent</artifactId>
            <version>2.7.5</version>
            <relativePath/> <!-- lookup parent from repository -->
            </parent>”
        
        启动器：
             “<dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-starter-web</artifactId>
             </dependency>”
            ‘spring-boot-starter-web’是一个启动器（启动相关场景），
        会自动将所需功能的依赖包全部导进来。（不需要像spring项目一样，手动地一个一个导入依赖包）
            
            

    启动类部分：
        
        @SpringBootApplication（自动配置）：
            springboot所有自动配置都是在启动的时候扫描并加载：spring.factories的所有自动配置类都在这里面（导入对应启动器选项，自动配置就会生效）
                1、springboot启动时，从META/INF/spring.factories下获取指定值；
                2、将启动器引入配置文件，自动配置就会生效（以前需要手动配置的东西就被自动配置了）
                3、整合javaee，解决方案和自配置的东西都在spring-boot-autoconfigure.jar(JAR（Java ARchive，Java 归档）是一种与平台无关的文件格式，可将多个文件合成一个文件。)
                4、将需要导入的组件以类的形式返回，这些组件就会被添加到容器。
                5、容器中存在非常多的……AutoConfiguration文件（@bean）。这些类给容器中导入了这个场景需要的所有组件

        
            SpringBoot 的 @SpringBootApplication 会自动扫描本类所在包下的所有类和子类，需要排除的类直接定义在Springboot启动类所在包外面即可.


        SpringApplication.run()(启动项目):
            创建SpringApplication对象；在对象初始化时保存事件监听器，容器初始化类以及判断是否为web应用，保存包含main方法的主配置类。
            调用run方法；准备spring的上下文，完成容器的初始化，创建，加载等。会在不同的时机触发监听器的不同事件。


原理部分就理解到这里，后面需要再来深入了解！







三、application.yaml配置文件
    1、默认值配置文件
    springboot的默认配置文件的名字为：/META-INF/spring-configuration-metadata.json。
/META-INF/additional-spring-configuration-metadata.json是/META-INF/spring-configuration-
metadata.json 文件中的补充配置信息。


    2、手动配置文件（优先级大于默认配置文件）
    在 Spring Boot 项目中，为满足以上要求，我们将大量的参数配置在 application.properties 或 application.yml 文件中，
通过 @ConfigurationProperties 注解，我们可以方便的获取这些参数值。
    
    
    3、自动配置再解析
        在@ConfigurationProperties的使用，把配置类的属性与yml配置文件绑定起来的时候，还需要加上@Component注解才能绑定并注入IOC容器中，若不加上@Component，则会无效。
        @ EnableConfigurationProperties的作用：则是将让使用了 @ConfigurationProperties 注解的配置类生效,将该类注入到 IOC 容器中,交由 IOC 容器进行管理，此时则不用再配置类上加上@Component。
    

    
    4、springboot的启动原理：
        1、当启动springboot项目时，先创建springapplication的对象，在对象的构造方法中会进行参数构造工作：
            判断当前应用程序类型以及初始化器和监听器，在整个工程中，会加载spring.factories文件获取配置类并放入缓存中，方便后续取用。
        
        2、springapplication对象创建完成后，执行run方法，整个过程中最核心的两个方法：
                preparecontext:对上下文对象做一个初始化操作！
                refreshcontext（对容器做一个刷新工作！）：
                            包括解析@import注解的工作


    
    原理部分就理解到这里，后面需要再来深入了解！
    
    注：看源码方法：一步一步debug，滤清整个流程！



在demo1案例中大致实现了springboot启动与自动装配的原理（有些模糊）,自定义了starter的使用（有些bug）
等后面回来再看，现在先不看了！继续学后面的内容即可！！



四、springboot的web开发部分

1、要解决的几个问题：
    导入静态资源、首页定制、模板引擎（themeleaf）、扩展springmvc、拦截器。


2、静态资源

webmvcautoconfiguration.class:
    public void addResourceHandlers():

            （1）String staticPathPattern = this.mvcProperties.getStaticPathPattern();
                    "this.staticPathPattern"（静态路径模式） = "/**":可以访问该文件夹下的所有文件
            
                        
             （2）“if (!registry.hasMappingForPattern(staticPathPattern)) {
                    this.customizeResourceHandlerRegistration(registry.addResourceHandler(new String[]{staticPathPattern}).addResourceLocations(WebMvcAutoConfiguration.getResourceLocations(this.resourceProperties.getStaticLocations())).setCachePeriod(this.getSeconds(cachePeriod)).setCacheControl(cacheControl));
                }”
                         private static final String[] CLASSPATH_RESOURCE_LOCATIONS = new String[]{"classpath:/META-INF/resources/", "classpath:/resources/", "classpath:/static/", "classpath:/public/"};
                将resouces下面的四个文件夹注册到静态资源访问路径，优先级逐个递减                    

            
            上面（1）（2）的含义：将resouces下面的四个文件夹注册到静态资源访问路径（优先级逐个递减）；
        项目的静态资源访问路径为：http://localhost:8080/+文件夹下的文件名（该路径就可以映射到对应的静态文件）
        

注：静态资源的原理了解到这里即可！




3、首页读取

    private Resource getIndexHtml(String location) {
    return this.resourceLoader.getResource(location + "index.html");
    }
    从静态资源目录下读取“index.html”文件！（这个不重要）



4、thymeleaf
    Thymeleaf 是一个 Java 库和模板引擎，用于解析应用程序生成的数据并将其呈现为模板文件，
从而提供转换。它就像 HTML，但提供了更多用于处理渲染数据的属性。



    1、thymeleaf的使用
    
        1、引入starter依赖：
             <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-starter-thymeleaf</artifactId>
                <version>2.2.2.RELEASE</version>
            </dependency>
        SpringBoot会自动为Thymeleaf注册一个视图解析器：
    
        2、
           在resources创建templates (名称固定) 这个是Springboot 固定的模板存放地方。
        访问的时候就和SpringMVC中的视图解析器一样,利用 Model 或者 ModelAndView …进行传值
        
        默认前缀：classpath:/templates/
        
        默认后缀：.html
        
        所以如果我们返回视图：users，会指向到 classpath:/templates/users.html
        
        一般我们无需进行修改，默认即可。
        
        注意: 要使用templates模板语法的页面必须放在 templates 目录下才能解析否则解析不了
        
        访问 templates内的页面必须通过解析器才能访问也就是需要在Controller里,写接口然后通过接口进行跳转（这个地方原理
    后面再来深入了解）

    
5.mvc配置

    注：springboot在自动装配时，优先装配用户自己配置的组件；如果组件存在多个，比如视图解析器，就将用户配置的与系统配置的组合起来使用。

    
    注：
        @ComponentScan注解一般和@Configuration注解一起使用，主要的作用就是定义包扫描的规则，然后根据定义的规则找出哪些
    需类需要自动装配到spring的bean容器中，然后交由spring进行统一管理。（这个先了解到这里，后面有需要再来进一步了解）



五、简单的员工管理系统

1、
数据库脚本：
create table departments
(
id             int         not null
primary key,
departmentName varchar(20) not null
)；


create table employees
(
id           int auto_increment
primary key,
lastName     varchar(20) not null,
email        varchar(20) not null,
gender       tinyint     not null,
departmentid int         not null,
birth        date        not null
);


2、员工页面的增删改查：
    web层面确实太简单了（现在的能力已经够用了）；数据库设计、sql查询语句（结合dao层框架）需要加强突破一下！


3、拦截器

知道怎么用就行了（后面有需要再来深入了解）



六、其他感兴趣的点（见demo4）

异步方法：
    主线程正在执行，引入支线程做给用户反馈相关的任务。
    只需要这两个注解：
        @Async
        @EnableAsync


定时任务：
    定时执行一个任务：
    只需两个注解：
        @Scheduled(cron = "0,20,40 */1 * * * ?")
        @EnableScheduling



七、sprinboot整合mybatis+sql语句再强化一手（见demo5）

1、环境搭建完成

2、找一个具体的数据库来练手：先在数据库层面练习sql语句的使用

2.1 主键与外键：
    主键(primary key) 能够唯一标识表中某一行的属性或属性组。一个表只能有一个主键，一个主键可以有多个字段。
    外键（foreign key） 是用于建立和加强两个表数据之间的链接的一列或多列；从表的外键就是主表的主键，
外键将两表联系起来。


    外键一般在从表的sql语句中建立：
        约束条件：
         on update cascade:当主表的主键更新时，从表的外键也开始更新。
         on delete cascade:当主表的主键列被删除，从表的外键列也被删除。

    具体案例：
        学生表：学号、姓名、性别  主键：学号 
        课程表：课程号、课程名    主键：课程号   
        学生成绩：id,学号、课程号、成绩   外键：学号、课程号  


2.2 多表联合查询
    几种常用连接：
        INNER JOIN：如果表中有至少一个匹配，则返回行
        LEFT JOIN：即使右表中没有匹配，也从左表返回所有的行
        RIGHT JOIN：即使左表中没有匹配，也从右表返回所有的行
        FULL JOIN：只要其中一个表中存在匹配，则返回行
    

    基于以上案例的三表联合查询sql语句：
        SELECT studentgrade.grade_id,studentgrade.stu_id,studentgrade.course_id,studentgrade.grade_id,
    student.stu_id,student.stu_name,student.stu_sex,
    course.course_id,course.course_name
    from studentgrade inner join student on  studentgrade.stu_id=student.stu_id
                      inner join course on studentgrade.course_id=course.course_id


2.3  groupby、having、函数的联合使用（太简单了）
在 SQL 中增加 HAVING 子句原因是，WHERE 关键字无法与聚合函数一起使用。HAVING 子句可以让我们筛选分组后的各组数据。
    
    SELECT avg(grade),course.course_id,course_name
    from studentgrade inner join student on  studentgrade.stu_id=student.stu_id
    inner join course on studentgrade.course_id=course.course_id
    group by course.course_id
    having avg(grade)>25


2.4 嵌套sql语句(这个简单，后面随便用就行了！)
    select * from studentgrade
    where  EXISTS (select course_id from studentgrade
    where course_id=102)


注：sql语句的基本操作这一块基本上没啥问题了（90%的问题能够解决），如果后面有需要再来深入了解即可。




3、mybatis与sql的联合使用（就这两个重点花时间看看即可，其他的没必要花时间）

    3.1、一对多与多对一查询（一个老师对应多个学生）
            老师表字段：id，name  主键：id
            学生表字段：id，name，tid  主键：id  外键：tid（对应老师表的id）

            具体使用见demo5的案例


    3.2动态sql语句：根据不同的条件生成不同的sql语句。
            具体见demo5案例。
            

    mybatis跟sql的结合使用学到这里就差不多了，后面有需要的再来深入了解！
            


8、如何给springboot来一个自定义starter？
    
    具体实现参照MyStarter案例即可（网上资料足够解决这个问题）。
    
    还剩一个不重要的疑问：项目的扩展库中看不到自定义starter的jar包？(这个不重要)


    
