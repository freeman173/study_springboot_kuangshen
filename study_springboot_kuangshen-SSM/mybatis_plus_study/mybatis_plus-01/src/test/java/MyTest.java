
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.jc.mapper.UserMapper;
import com.jc.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;


@Transactional
public class MyTest {


    /*
    插入操作
     */
    @Test
    public void testOne() throws ClassNotFoundException, IOException {

//spring的ioc托管了mybatis，还是舒服！
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

        UserMapper userMapper=context.getBean(UserMapper.class);

        Object object=userMapper.selectList(null);

        User user=new User();
        user.setAge(12);user.setName("蒋超");user.setEmail("dfd");
        Object object1=userMapper.insert(user);


        System.out.println("________END__________");
    }



    /*
       更新操作:
            在做更新操作时，自动帮你拼接了动态sql语句

        */
    @Test
    public void testTwo() throws ClassNotFoundException, IOException {

//spring的ioc托管了mybatis，还是舒服！
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

        UserMapper userMapper=context.getBean(UserMapper.class);
        User user=new User();
        user.setAge(12);user.setName("刘7");user.setEmail("dfd");user.setId(6);
        Object object1=userMapper.updateById(user);


        Object object=userMapper.selectList(null);


        System.out.println("________END__________");
    }


    /*
       查询操作：


        */
    @Test
    public void testThree() throws ClassNotFoundException, IOException {

//spring的ioc托管了mybatis，还是舒服！
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

        UserMapper userMapper=context.getBean(UserMapper.class);

//        Object object=userMapper.selectBatchIds(Arrays.asList(1,2,3));


//        分页查询
        Page<User> page=new Page<>(2,5);
        Object object=userMapper.selectPage(page,null);


        QueryWrapper queryWrapper=new QueryWrapper();


        System.out.println("________END__________");
    }




    /*
          自动生成代码操作：


           */
    @Test
    public void testFour() throws ClassNotFoundException, IOException {


        FastAutoGenerator.create("jdbc:mysql://localhost:3306/mybatis","root","123456")
                // 全局配置
                .globalConfig((scanner, builder) -> builder
                        .author("蒋超")
                        //禁止打开输出目录
                        .disableOpenDir()
                        //配置时间
                        .commentDate("yyyy-MM-dd")
                        // 指定输出目录
                        .outputDir(System.getProperty("user.dir")+"/src/main/java")
                )
                // 包配置
                .packageConfig(builder -> {
                    // 设置父包名
                    builder.parent("com.demo.richText")
                            .entity("pojo")
                            .controller("controller")
                            .service("service")
                            .serviceImpl("service.impl")
                            .mapper("mapper");
//                            .xml("mapper.xml")
//                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml,System.getProperty("user.dir")+"/src/main/resources/mapper")); // 设置mapperXml生成路径
                })
                // 策略配置
                .strategyConfig((scanner, builder) -> builder.addInclude("user")
                        //controller 配置
                        .controllerBuilder()
                        .formatFileName("%sController")
                        .enableRestStyle()
                        .enableHyphenStyle()
                        //service 配置
                        .serviceBuilder()
                        .formatServiceFileName("%sService")
                        .formatServiceImplFileName("%sServiceImpl")
                        //pojo 配置
                        .entityBuilder()
                        .enableLombok()
                        //自动插入 更新时间 创造时间

                        //mapper 配置
                        .mapperBuilder()
                        .superClass(BaseMapper.class)
                        .formatMapperFileName("%sMapper")
                        .enableMapperAnnotation()
                        .formatXmlFileName("%sMapper")
                        .build())

                .execute();



        System.out.println("________END__________");
    }




}
