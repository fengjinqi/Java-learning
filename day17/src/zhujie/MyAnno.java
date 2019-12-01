package zhujie;


import java.lang.annotation.*;

/**
 * @Target 描述注解存在的位置
 * @Documented 抽取到api文档中
 * @Inherited 被子类继承
 * @Retention 被保留的阶段
 */
@Retention(value = RetentionPolicy.RUNTIME)//RUNTIME保留class字节被jvm执行
@Inherited
@Documented
@Target(value = {ElementType.TYPE,ElementType.FIELD,ElementType.METHOD})//TYPE 表示只能存在类上面,FIELD成员变量，METHOD方法
public @interface MyAnno {
    public abstract int value();
    public abstract String n()default "东方不败";
    /*public abstract String show2();
    public abstract EnumPerson pre();*/
    String[] strs();
}
