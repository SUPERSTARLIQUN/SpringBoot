# 一、SpringBoot

For work reasons, build an initial frame palace for your own use（中文：出于工作上的原因，为自己建造一个初始框架）

[^注释]:



# 二、项目搭建初始框架

## 2.1技术体系

> Springboot 2.2.6
>
> Mybatis（Java的持久层框架）
>
> mysql（关系型数据库）
>
> redis（非关系型数据库）
>
> ElasticSearch(分布式搜索引擎)
>
> Sa-Token(预部署)，现安装Spring Security
>
> RabbitMQ（消息中间件）
>
> logbock（日志控件）


## 2.2tools工具

​    文件上传
​    随机数
​    ND5加密
​    Cookie工具
​    Session工具
​    IP地址获取
​    JSON对象转化
​    Redis工具
​    Java自定义响应工具
​    表格导入导出

## 2.3实体类目录介绍

### （1）entity

​    最常用实体类，基本和数据表一一对应，一个实体一张表。

### （2）bo

​    代表业务对象的意思，Bo就是把业务逻辑封装为一个对象（注意是逻辑，业务逻辑），这个对象可以包括一个或多个其它的对象。通过调用Dao方法，结合Po或Vo进行业务操作。

### （3）po

​    代表持久层对象的意思，对应数据库中表的字段，数据库表中的记录在java对象中的显示状态，最形象的理解就是一个PO就是数据库中的一条记录。

### （4）vo

​    代表值对象的意思，通常用于业务层之间的数据传递，由new创建，由GC回收。

### （5）pojo

​    代表简单无规则java对象，纯的传统意义的java对象，最基本的Java Bean只有属性加上属性的get和set方法

# 三.项目后续构建

