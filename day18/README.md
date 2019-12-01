#数据库操作
**查询数据库所有名称**
```mysql
show databases;
```
**查询某个数据库的字符集**
```mysql
SHOW CREATE DATABASE 数据库名称;#数据库创建语句
```
**创建数据库**
```mysql
CREATE DATABASE 数据名称;
CREATE DATABASE IF NOT EXISTS 数据名称 CHARACTER SET 编码 #先判断是否存在并创建指定字符编码数据库
```
**修改数据库**
```mysql
ALTER DATABASE 数据库名称 CHARACTER SET 字符集名称;#修改数据库字符编码
```
**删除数据库**
```mysql
DROP DATABASE 数据库名称;
DROP DATABASE IF EXISTS 数据库名称;#判断删除
```
**查询当前使用的数据库**
```mysql
SELECT DATABASE();
```
**进入数据库**
```mysql
USE 数据库名称;
```
#表操作
**查询有哪些表**
```mysql
SHOW TABLES;
```
**查询表结构**
```mysql
DESC 表名;
```
**创建表**
```mysql
CREATE TABLE 表名(
  字段名 数据类型,
   字段名 数据类型
);
```
**删除表**
```mysql
DROP TABLE 表名;
DROP TABLE IF EXISTS 表名;#判断删除
```
**修改表字符**
```mysql
ALTER TABLE 表名 CHARACTER SET 字符集名称;
```

**修改表名**
```mysql
ALTER TABLE 表名 RENAME TO 新表名;
```
**查询表创建结构**
```mysql
SHOW CREATE TABLE 表名;
```
**添加字段**
```mysql
ALTER TABLE 表名 ADD 字段名 数据类型;
```
**修改字段**
```mysql
ALTER TABLE 表名 CHANGE 原字段名 新字段名 字段类型;
ALTER TABLE 表名 MODIFY 字段名 数据类型;
```
**删除字段**
```mysql
ALTER TABLE 表名 DROP 字段名;
```
#DML 增删改表中数据
**增加数据**
```mysql
INSERT INTO  表名(字段1,字段2,...字段n).values(值1,...值n);
```
**删除数据**
```mysql
DELETE FROM 表名 [WHERE 条件];
```
**修改数据**
```mysql
UPDATE 表名 SET 字段=值,字段1=值 WHERE [条件];
```
