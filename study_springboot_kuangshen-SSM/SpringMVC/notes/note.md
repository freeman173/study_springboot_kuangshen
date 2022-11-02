狂神的springmvc视频

一、原生态的servlet项目：

MVC框架需要做的事：
    将url请求映射到Java类（servlet中去）；
    得到请求（封装用户提交的数据），调用业务处理，返回结果（封装响应数据，将响应数据渲染成html/jsp数据）
    

原生态servlet的web项目搭建：见代码即可。
tomcat的配置：简单，不需要记录（网上资料一大堆）。


二、springmvc初步项目的理解

执行原理（见笔记图片）
    用户发送请求至前端控制器DispatcherServlet；
    DispatcherServlet收到请求调用HandlerMapping处理器映射器。
    处理器映射器根据请求url找到具体的处理器，生成处理器对象及处理器拦截器(如果有则生成)一并返回给DispatcherServlet。
    DispatcherServlet通过HandlerAdapter处理器适配器调用处理器。
    执行处理器(Controller层，也叫后端控制器)。
    Controller执行完成返回数据和视图(ModelAndView)。
    HandlerAdapter将controller执行结果ModelAndView返回给DispatcherServlet。
    DispatcherServlet将ModelAndView传给ViewReslover视图解析器。
    ViewReslover解析后返回具体的View视图（JSP / HTML）。
    DispatcherServlet对View进行渲染视图（即将模型数据填充至视图中）。
    DispatcherServlet响应用户，用户看到界面和数据。

注：只有少部分需要用户自动编写（其中大部分流程由框架自动实现）！


在具体项目中的执行原理：见配置文件中的笔记：


themeleaf模板引擎：简单了解一下就行，后面有需要再来深入了解
    Thymeleaf是一个流行的模板引擎，该模板引擎采用Java语言开发；
Thymeleaf的主要目标在于提供一种可被浏览器正确显示的、格式良好的模板创建方式，因此也可以用作静态建模。
你可以使用它创建经过验证的XML与HTML模板。使用thymeleaf创建的html模板可以在浏览器里面直接打开（展示静态数据），
这有利于前后端分离。



三、springmvc的注解开发

相比于第二个版本：
    处理器映射器、处理器适配器、视图解析器为springmvc的三大件：
        在springmvc的注解开发spring的配置文件中，前两者开启注解驱动即可！（其他区别的见代码即可！）



四、restful风格：一个资源定位以及资源操作的风格。基于这种风格设计的uri更好用一点。


具体细节见代码



五、
重定向与转发：
    转发：直接给个 “return ‘路径’”即可
    重定向：给个 “return ‘redirect:路径’”即可


参数传递格式：具体细节见UserController代码即可

 

六、乱码
尽量统一设置为utf-8即可；遇到再解决吧！


七、json

前后端分离时代：
    后端使用接口提供数据即可；
    前端独立部署，负责渲染后端的数据；

json为一种数据交换的格式。全称是 JavaScript Object Notation，即 JavaScript对象标记法。
语法规则：
    数组（Array）用方括号(“[]”)表示。
    对象（0bject）用大括号(“{}”)表示。
    名称/值对(name/value）组合成数组和对象。
    名称(name）置于双引号中，值（value）有字符串、数值、布尔值、null、对象和数组。
    并列的数据之间用逗号(“,”）分隔。

具体细节去网上查！



jackson的使用：Java生态圈中有很多处理JSON和XML格式化的类库， 
常见的解析器：Jsonlib，Gson，fastjson，Jackson。Jackson是其中比较著名的一个，
也比较方便。，Jackson相对来说比较高效，在项目中主要使用Jackson进行JSON和Java对象转换。


注：具体使用工具类代码

八、ssm整合项目
见项目代码


九、拦截器

拦截器与过滤器的区别：
    过滤器是servlet规范的一部分，任何javaweb都可以使用；
    拦截器是springmvc框架自己的，只有该框架才能用。


拦截器的具体实现这里有点迷糊，后面再回来梳理一下！

    
