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
#DQL 查询表操作

语法
```mysql
select 
    字段名
from 
    表名
where
    条件
group by 
    分组字段
having 
    分组之后的条件
order by 
    排序
limit 
    分页
```
**查询**
```mysql
select 字段1,字段2 from  表名;
```
**去重**
```mysql
SELECT distinct ...字段名 from 表名;
```
**计算**
```mysql
ifnull(表达式1,表达式2):null参与的运算 计算结果都为null
    表达式1 哪个字段需要判断是否为null
    表达式2 替换值
```
**起别名**
```mysql
select name as 名字 from 表名;
```
**条件查询**
```mysql
select 字段 from 表 where 字段 between 20 and 30;#取20-30之间数据
select name from student where age in (10,11,34);# || 取10或者11或者34的值
select name from student where age is null;#取为空
select name from student where age is not null;#不为空
select name from student where name like '_n%';#第二个字为n的模糊查询
select name from student where name like '___';#三个字的模糊查询
select name from student where name like '%n%';#为n的模糊查询

```
**排序查询**
```mysql
select name from student order by age desc ;# desc 降序 默认升序 asc

```
**聚合函数**
```mysql
count();#计算个数
max();#最大值
min();#最小值
sum();#计算和
avg();#计算平均值

```
**分组**
```mysql
select name avg(age) from student group by sex;# 分组
select sex,avg(age),count(id) from student where matc>70 group by sex having count(id)>2;#性别分组 查询平均年龄 分数大于70人数大于2个

```
**分页**
```mysql
limit 0,3;
#(当前页面-1)*显示的条数
```
**约束**
```mysql
create table stu(
  id int primary key auto_increment,#--->主键自增
  name VARCHAR(20) not null ,#非空
  phone int unique #唯一
)
```
**外键约束**
```mysql
create table stu(
  id int primary key auto_increment,
  name varchar(20)
);
create table emp(
  id int primary key auto_increment,
  nam varchar(20),
  emp_stu_id int,
  constraint emp_stu_fk foreign key (emp_stu_id) references stu(id)
);

```
**级联操作**
```mysql
alter table stu add constraint 外键 foreign key (外键字段名) references 主表名(主表列名) on UPDATE cascade on delete cascade ;
```
