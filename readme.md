## 开始

方法一：

进入mysql， 执行以下命令：

mysql> create database springdb;

mysql> create user 'springuser'@'%' identified by 'password';

mysql> grant all on springdb.* to 'springuser'@'%'; 

主目录下执行以下命令：
mvn clean package

java -jar target/*.jar

方法二（需要安装docker）：

主目录执行以下命令：

docker-compose up

## http 接口

查看 src/main/java/com/example/accessingdatamysql/MainController.java

## 导入postman
shixi.postman_collection.json
