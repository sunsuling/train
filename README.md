train
=====

train


实用工具:

// 在lunix 下面安装mysq 数据库
http://www.2cto.com/database/201401/273423.html

// 切换到mysql 控制台
mysql -uroot -p  -- mysql登录

// git 使用方法
http://www.cnblogs.com/chiao/archive/2011/07/27/2117835.html

// linux 下查看再跑的进程 
ps -ef|grep 包含的进程名称
kill 进程号码 干掉进程

// 二维码的js
https://github.com/jeromeetienne/jquery-qrcode 以及使用方法

// bootstrap 可视工具
http://www.bootcss.com/p/layoutit/

// 项目结构
app 
  -- bean    存放session 的model 
  
  -- controllers  存放所有的台controller(可以扩子类)
  
  -- sqlmap  存放一些不能用model去实现的复杂sql
  
  -- utils  一些工具类
  
  -- views  存放所有的页面(可以扩子包)
  
  -- Global.java 这个类 项目自启动的时候自动运行，在这里可以做拦截操作以及回调，JOB轮寻操作等
conf   配置文件
  -- applicatio.conf  包含数据库等配置信息
  -- routers 路由文件 存放所有的URL
logs 
   存放所有的错误日志
public 
    存放前台页面依赖的js ,css 图片等

