package com.jc.utils;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Date;


@Component
@Slf4j
public class UtilOne implements MetaObjectHandler {
    public void insertFill(MetaObject metaObject) {
        System.out.println("插入填充!");
        this.setFieldValByName("createTime", new Date(), metaObject);

    }

    public void updateFill(MetaObject metaObject) {
        System.out.println("更新填充!");
        this.setFieldValByName("updateTime", new Date(), metaObject);

    }
}
